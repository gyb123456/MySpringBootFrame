package com.demo.gyb.entity.firmware;

import java.sql.Timestamp;

public class FirmwareUpdate {
    private Integer dataId;
    private String macId;
    private Integer firmwareDataId;
    private Timestamp createTime;
    private Timestamp modifyTime;
    private Integer version;
    private String firmwareFileUrl;
	public Integer getDataId() {
		return dataId;
	}
	public void setDataId(Integer dataId) {
		this.dataId = dataId;
	}
	public String getMacId() {
		return macId;
	}
	public void setMacId(String macId) {
		this.macId = macId;
	}	
	public Integer getFirmwareDataId() {
		return firmwareDataId;
	}
	public void setFirmwareDataId(Integer firmwareDataId) {
		this.firmwareDataId = firmwareDataId;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}	
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getFirmwareFileUrl() {
		return firmwareFileUrl;
	}
	public void setFirmwareFileUrl(String firmwareFileUrl) {
		this.firmwareFileUrl = firmwareFileUrl;
	}    
}
