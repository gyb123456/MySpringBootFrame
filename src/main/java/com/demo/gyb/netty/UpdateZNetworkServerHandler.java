package com.demo.gyb.netty;

import com.demo.gyb.config.SpringBeanUtil;
import com.demo.gyb.service.FirmwareUpdateService;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import org.apache.log4j.Logger;

public class UpdateZNetworkServerHandler extends ChannelInboundHandlerAdapter {
	Logger logger =  Logger.getLogger("firmware");
	FirmwareUpdateService firmwareUpdateService;
	private boolean boo = true;
	private int length;
	StringBuffer buff= new StringBuffer();
	private int surplusLength = 0;

	UpdateZNetworkServerHandler() {
		// 从Spring中获取bean
		firmwareUpdateService = (FirmwareUpdateService) SpringBeanUtil.getBean("firmwareUpdateService");
		System.out.println("firmwareUpdateService获取成功======================"+firmwareUpdateService);
	}

	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		ByteBuf in = (ByteBuf) msg;
		try {
			byte[] req = new byte[in.readableBytes()];
			in.readBytes(req);
			String strRecv = new String(req, "UTF-8");
			System.out.println("固件发送信息："+strRecv);
			logger.info("####:"+strRecv+",boo:"+boo);
			analysisMessage(ctx,strRecv);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ReferenceCountUtil.release(msg); // (2)
		}
	}
	public void analysisMessage(ChannelHandlerContext ctx,String strRecv) throws Exception{

	}
	public void channelReadComplete(ChannelHandlerContext ctx) {
		// ctx.writeAndFlush(Unpooled.EMPTY_BUFFER) //flush掉所有写回的数据
		// .addListener(ChannelFutureListener.CLOSE); //当flush完成后关闭channel
	}



}
