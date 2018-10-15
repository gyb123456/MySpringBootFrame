package com.demo.gyb.entity.firmware;

import java.sql.Timestamp;

public class FirmwareInfo {
	private Integer dataId;
	private String firmwareNo;//固件编号
	private byte firmwareType;//固件类型 1:设备升级 2:独立版本
	private Integer build;//固件数字版本号
	private Integer majorVersion;//主版本号
	private Integer minorVersion;//副版本号
	private String description;//描述
	private Integer deviceType;//对应的硬件设备类型 网关:7003,灯:7001
	private String packageUrl;//固件包的下载地址（app使用）
	private String firmwareFileUrl;//固件包的下载地址（固件自己升级使用）
	private Timestamp createTime;
	private Timestamp modifyTime;
	public Integer getDataId() {
		return dataId;
	}
	public void setDataId(Integer dataId) {
		this.dataId = dataId;
	}
	public String getFirmwareNo() {
		return firmwareNo;
	}
	public void setFirmwareNo(String firmwareNo) {
		this.firmwareNo = firmwareNo;
	}
	public byte getFirmwareType() {
		return firmwareType;
	}
	public void setFirmwareType(byte firmwareType) {
		this.firmwareType = firmwareType;
	}
	public Integer getBuild() {
		return build;
	}
	public void setBuild(Integer build) {
		this.build = build;
	}
	public Integer getMajorVersion() {
		return majorVersion;
	}
	public void setMajorVersion(Integer majorVersion) {
		this.majorVersion = majorVersion;
	}
	public Integer getMinorVersion() {
		return minorVersion;
	}
	public void setMinorVersion(Integer minorVersion) {
		this.minorVersion = minorVersion;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
	}
	public String getPackageUrl() {
		return packageUrl;
	}
	public void setPackageUrl(String packageUrl) {
		this.packageUrl = packageUrl;
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
	public String getFirmwareFileUrl() {
		return firmwareFileUrl;
	}
	public void setFirmwareFileUrl(String firmwareFileUrl) {
		this.firmwareFileUrl = firmwareFileUrl;
	}
}
