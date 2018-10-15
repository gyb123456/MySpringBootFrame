package com.demo.gyb.listener;


import com.demo.gyb.timer.FirmwareHeartLiveTimer;
import org.apache.log4j.Logger;
import org.springframework.core.annotation.Order;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Order(0)
@WebListener
public class FirmwareHeartLiveListener implements ServletContextListener {
	Logger logger = Logger.getLogger(FirmwareHeartLiveListener.class);
	private ScheduledExecutorService executor = null;
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		try{
			// 在这里初始化监听器，在tomcat启动的时候监听器启动，可以在这里实现定时器功能  
			executor = Executors.newScheduledThreadPool(1);
		    long oneMinutes = 3 * 1000;
		    executor.scheduleAtFixedRate(
		            new FirmwareHeartLiveTimer(),
		            30000,  
		            oneMinutes,  
		            TimeUnit.MILLISECONDS);
	        logger.info("1计算固件是否断链的定时器启动--------------,"+"30s后,开始执行定时任务");
		}catch (Exception e) {
			e.printStackTrace();
			executor.shutdown();
			logger.error("1计算固件是否断链的定时器启动失败,原因:"+e);
		}
	}
	 //在这里关闭监听器，所以在这里销毁定时器。
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		 executor.shutdown();
	     logger.info("计算固件是否断链的定时器销毁---------------");  
	} 
}
