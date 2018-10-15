package com.demo.gyb.dao.firmware;


import com.demo.gyb.entity.firmware.FirmwareUpdate;

public interface FirmwareUpdateMapper {
	FirmwareUpdate queryByMacId(String macId);
	int insert(FirmwareUpdate bean);
	int updateByMacId(FirmwareUpdate bean);
	int deleteByMacId(String macId);
	int updateByExample(FirmwareUpdate bean);
}
