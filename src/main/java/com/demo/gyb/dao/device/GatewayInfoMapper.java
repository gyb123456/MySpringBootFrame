package com.demo.gyb.dao.device;


import com.demo.gyb.entity.device.GatewayInfo;

import java.util.List;
import java.util.Map;


public interface GatewayInfoMapper {
	GatewayInfo queryByMacId(String gateMacId);
	int updateStatus(Map<String, Object> map);
	int updateBuild(Map<String, Object> map);
	int insert(GatewayInfo bean);
	List<GatewayInfo> queryGatewayByNId(String networkId);
	List<GatewayInfo> queryGatewayByNId1(String networkId);
	int deleteByGateMacId(String gateMacId);
	int deleteByNetworkId(String networkId);
	List<GatewayInfo> queryByNetworkId(String networkId);
	int updataWarningStatus(Map<String, Object> map);//修改预警状态
	List<GatewayInfo> queryByTimeBeforeNow(Map<String, Object> map);//查询据当前系统前24小时的    网关信息
	List<GatewayInfo> queryByExample(Map<String, Object> param);//根据条件查询
	int queryCountByExample(Map<String, Object> param);//根据条件查询个数
	List<Map<String, Object>> queryByLikeMacId(Map<String, Object> param);

	//	List<GatewayInfo> queryUnConfigDevice(Map<String, Object> param);//查询当前网络下  未在地图上的网关
	List<GatewayInfo> queryAllByNId(Map<String, Object> param);//查询网络下所有网关
	int queryAllCountByNId(Map<String, Object> param);//查询网络下网关个数
	List<GatewayInfo> queryDeviceOnMap(Map<String, Object> param);//查询设备是否在 地图上


}
