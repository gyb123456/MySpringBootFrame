package com.demo.gyb.listener;

import com.demo.gyb.config.IotProperties;
import com.demo.gyb.timer.UpdateStartNettyTimer;
import org.apache.log4j.Logger;
import org.springframework.core.annotation.Order;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Timer;

/**
 * 固件升级程序启动入口
 * GYB 20180822
 * !在此Lister中需要使用bean获取配置环境里的值
 */
@Order(2)
@WebListener
public class UpdateStartNettyListener implements ServletContextListener {

	//获取spring注入的bean对象
	private WebApplicationContext springContext;
	private IotProperties iotProperties;
	Logger logger = Logger.getLogger(UpdateStartNettyListener.class);
	Timer timer;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		springContext = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
		String firmware_update_port ="";
		if(springContext != null){
			iotProperties = (IotProperties)springContext.getBean("iotProperties");
			firmware_update_port = iotProperties.getFirmware_update_port();
			logger.info("！！！！！！！！取到的IOT_FIRMWARE_LOGIN_PORT_UPDATE的值为："+firmware_update_port);
		}else{
			logger.error("WebListener-UpdateStartNettyListener获取应用程序上下文失败!");
			return;
		}
		try{
			// 在这里初始化监听器，在tomcat启动的时候监听器启动，可以在这里实现定时器功能  
	        timer = new Timer();
	        timer.schedule(new UpdateStartNettyTimer(firmware_update_port), 5000);
	        logger.info("3netty启动的定时器已启动--------------,"+5+"秒后,开始执行定时任务");
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("3netty启动的定时器启动失败,原因:"+e);
		}
	}
    //在这里关闭监听器，所以在这里销毁定时器。
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		 timer.cancel();
	     logger.info("netty启动的定时器销毁---------------");  
	}

}
