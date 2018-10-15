package com.demo.gyb.entity.device;

import java.sql.Timestamp;

public class GatewayInfo {
    private Integer dataId;
    private String gateMacId;
    private Integer deviceType;
    private Integer build;
    private Byte status;
    private Timestamp gainStatusTime;
    private Timestamp uploadStatusTime;
    private String remark;
    private Timestamp createTime;
    private Timestamp modifyTime;
    private String hardwareName;
    private Byte isWarning;
    private Byte type1;
	public Integer majorVersion;
	public Integer minorVersion;
	public String NetworkName;
	public String networkId;
	public String iconUrl;
	private Integer mapId;
	private Double coordinate_x;
	private Double coordinate_y;
	private String mapName;
	public String getMapName() {
		return mapName;
	}
	public void setMapName(String mapName) {
		this.mapName = mapName;
	}
	public Integer getMapId() {
		return mapId;
	}
	public void setMapId(Integer mapId) {
		this.mapId = mapId;
	}
	public Double getCoordinate_x() {
		return coordinate_x;
	}
	public void setCoordinate_x(Double coordinate_x) {
		this.coordinate_x = coordinate_x;
	}
	public Double getCoordinate_y() {
		return coordinate_y;
	}
	public void setCoordinate_y(Double coordinate_y) {
		this.coordinate_y = coordinate_y;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getNetworkId() {
		return networkId;
	}
	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}
	public String getNetworkName() {
		return NetworkName;
	}
	public void setNetworkName(String networkName) {
		NetworkName = networkName;
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
	public Byte getType1() {
		return type1;
	}
	public void setType1(Byte type1) {
		this.type1 = type1;
	}
	public Byte getIsWarning() {
		return isWarning;
	}
	public void setIsWarning(Byte isWarning) {
		this.isWarning = isWarning;
	}
	public Integer getDataId() {
		return dataId;
	}
	public void setDataId(Integer dataId) {
		this.dataId = dataId;
	}
	public String getGateMacId() {
		return gateMacId;
	}
	public void setGateMacId(String gateMacId) {
		this.gateMacId = gateMacId;
	}
	public Integer getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
	}
	public Integer getBuild() {
		return build;
	}
	public void setBuild(Integer build) {
		this.build = build;
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
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	public Timestamp getGainStatusTime() {
		return gainStatusTime;
	}
	public void setGainStatusTime(Timestamp gainStatusTime) {
		this.gainStatusTime = gainStatusTime;
	}
	public Timestamp getUploadStatusTime() {
		return uploadStatusTime;
	}
	public void setUploadStatusTime(Timestamp uploadStatusTime) {
		this.uploadStatusTime = uploadStatusTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getHardwareName() {
		return hardwareName;
	}
	public void setHardwareName(String hardwareName) {
		this.hardwareName = hardwareName;
	}
	@Override
	public String toString() {
		return "GatewayInfo [dataId=" + dataId + ", gateMacId=" + gateMacId
				+ ", deviceType=" + deviceType + ", build=" + build
				+ ", status=" + status + ", gainStatusTime=" + gainStatusTime
				+ ", uploadStatusTime=" + uploadStatusTime + ", remark="
				+ remark + ", createTime=" + createTime + ", modifyTime="
				+ modifyTime + ", hardwareName=" + hardwareName
				+ ", isWarning=" + isWarning + ", type1=" + type1
				+ ", majorVersion=" + majorVersion + ", minorVersion="
				+ minorVersion + ", NetworkName=" + NetworkName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((NetworkName == null) ? 0 : NetworkName.hashCode());
		result = prime * result + ((build == null) ? 0 : build.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((dataId == null) ? 0 : dataId.hashCode());
		result = prime * result
				+ ((deviceType == null) ? 0 : deviceType.hashCode());
		result = prime * result
				+ ((gainStatusTime == null) ? 0 : gainStatusTime.hashCode());
		result = prime * result
				+ ((gateMacId == null) ? 0 : gateMacId.hashCode());
		result = prime * result
				+ ((hardwareName == null) ? 0 : hardwareName.hashCode());
		result = prime * result
				+ ((isWarning == null) ? 0 : isWarning.hashCode());
		result = prime * result
				+ ((majorVersion == null) ? 0 : majorVersion.hashCode());
		result = prime * result
				+ ((minorVersion == null) ? 0 : minorVersion.hashCode());
		result = prime * result
				+ ((modifyTime == null) ? 0 : modifyTime.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type1 == null) ? 0 : type1.hashCode());
		result = prime
				* result
				+ ((uploadStatusTime == null) ? 0 : uploadStatusTime.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GatewayInfo other = (GatewayInfo) obj;
		if (NetworkName == null) {
			if (other.NetworkName != null)
				return false;
		} else if (!NetworkName.equals(other.NetworkName))
			return false;
		if (build == null) {
			if (other.build != null)
				return false;
		} else if (!build.equals(other.build))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (dataId == null) {
			if (other.dataId != null)
				return false;
		} else if (!dataId.equals(other.dataId))
			return false;
		if (deviceType == null) {
			if (other.deviceType != null)
				return false;
		} else if (!deviceType.equals(other.deviceType))
			return false;
		if (gainStatusTime == null) {
			if (other.gainStatusTime != null)
				return false;
		} else if (!gainStatusTime.equals(other.gainStatusTime))
			return false;
		if (gateMacId == null) {
			if (other.gateMacId != null)
				return false;
		} else if (!gateMacId.equals(other.gateMacId))
			return false;
		if (hardwareName == null) {
			if (other.hardwareName != null)
				return false;
		} else if (!hardwareName.equals(other.hardwareName))
			return false;
		if (isWarning == null) {
			if (other.isWarning != null)
				return false;
		} else if (!isWarning.equals(other.isWarning))
			return false;
		if (majorVersion == null) {
			if (other.majorVersion != null)
				return false;
		} else if (!majorVersion.equals(other.majorVersion))
			return false;
		if (minorVersion == null) {
			if (other.minorVersion != null)
				return false;
		} else if (!minorVersion.equals(other.minorVersion))
			return false;
		if (modifyTime == null) {
			if (other.modifyTime != null)
				return false;
		} else if (!modifyTime.equals(other.modifyTime))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (type1 == null) {
			if (other.type1 != null)
				return false;
		} else if (!type1.equals(other.type1))
			return false;
		if (uploadStatusTime == null) {
			if (other.uploadStatusTime != null)
				return false;
		} else if (!uploadStatusTime.equals(other.uploadStatusTime))
			return false;
		return true;
	}
}
