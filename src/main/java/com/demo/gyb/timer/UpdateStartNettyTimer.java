package com.demo.gyb.timer;


import com.demo.gyb.netty.UpdateZNettyServer;
import org.apache.log4j.Logger;

import java.util.TimerTask;


public class UpdateStartNettyTimer extends TimerTask {
	Logger logger = Logger.getLogger(UpdateStartNettyTimer.class);
	private String IOT_FIRMWARE_LOGIN_PORT_UPDATE = "7073";

	public UpdateStartNettyTimer(String firmware_update_port){
		this.IOT_FIRMWARE_LOGIN_PORT_UPDATE =  firmware_update_port;
	}
	@Override
	public void run() {
		System.out.println("UpdateStartNettyTimer run");
		try{
			UpdateZNettyServer update_m_Network = new UpdateZNettyServer(Integer.parseInt(IOT_FIRMWARE_LOGIN_PORT_UPDATE));
			update_m_Network.start();
			logger.info("更新固件的netty已经开启");
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("netty start error,原因:"+e);
		}
		
	}

}
