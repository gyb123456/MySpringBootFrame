package com.demo.gyb.timer;


import org.apache.log4j.Logger;

import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class FirmwareHeartLiveTimer extends TimerTask {
	Logger logger = Logger.getLogger(FirmwareHeartLiveTimer.class);
	Lock heartLive_lock;
	public FirmwareHeartLiveTimer(){
		heartLive_lock = new ReentrantLock();
	}
	@Override
	public void run() {

	}
}
