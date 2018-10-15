package com.demo.gyb.dao.firmware;

import com.demo.gyb.entity.firmware.FirmwareInfo;

import java.util.List;
import java.util.Map;

/**
 * @author fangguanqgiang
 *	固件管理
 * 2018年1月9日
 */
public interface FirmwareInfoMapper {

	Integer queryCountByMap(Map<String, Object> param);//查询固件总数

	List<FirmwareInfo> queryByMap(Map<String, Object> param);//设备列表

	int insert(FirmwareInfo bean);//发布固件

	int updateFirmware(FirmwareInfo bean);//修改固件信息

	FirmwareInfo queryByDataId(Integer dataId); //根据id查询固件信息

	int deleteByDataId(Integer dataId);//根据id删除固件

	FirmwareInfo queryByDtype(Integer deviceType);//根据 对应的硬件设备类型查询 最新版本 limit 0,1

	List<FirmwareInfo> queryByBuildDType(Map<String, Object> param);//根据用户输入的build 判断是否存在该build

	FirmwareInfo queryByFirmwareNo(String firmwareNo);

	List<FirmwareInfo> queryByDtype1(Map<String, Object> param);//查询当前类型下的所有固件信息 按照build排序

	FirmwareInfo querByMacId(String gateMacId); //通过网关mac地址查询固件版信息
	
	FirmwareInfo queryLastByBuildDetype(Map<String, Object> param);
}
