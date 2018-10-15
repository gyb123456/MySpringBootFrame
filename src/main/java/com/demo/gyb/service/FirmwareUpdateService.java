package com.demo.gyb.service;

import io.netty.channel.ChannelHandlerContext;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * 固件升级的实现类
 *2018年1月16日
 * Mod 20180821 GYB
 */
@Service(value="firmwareUpdateService")
public class FirmwareUpdateService {


	Logger logger =  Logger.getLogger("firmware");

	public void handleMessage(String strRecv,String msgType,String uuid){

	}
	/**
	 * 固件登录
	 */
	public void login(ChannelHandlerContext ctx, String strRecv){

	}

	/**
	 * 固件断链的处理
	 */
	public void disconnectionHandle(String gatewayMac){
		System.out.println("固件断链,但是代码没处理！！！");
//		NetworkGateway networkGateway = networkGatewayMapper.queryByGatewayId(gatewayMac);
//		if(null != networkGateway){
//			List<NetworkGateway> list = networkGatewayMapper.queryByNetworkId(networkGateway.getNetworkId());
//			if(null != list && !list.isEmpty()){
//				for(NetworkGateway bean : list){
//					if(FirmwareSocketMgr.m_SocketChannel.containsKey(bean.getGateMacId())){
//						if(FirmwareSocketMgr.networkStatusMap.containsKey(networkGateway.getNetworkId())){
//							FirmwareSocketMgr.networkStatusMap.remove(networkGateway.getNetworkId());
//						}
//						return;
//					}
//				}
//				FirmwareSocketMgr.networkStatusMap.put(networkGateway.getNetworkId(), "");
//			}
//		}
	}
}
