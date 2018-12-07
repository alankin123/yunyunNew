package com.alankin.ucenter.dao.model;

import java.io.Serializable;

public class UserLoginLog implements Serializable {
    private Long id;

    /**
     * 用户uid
     *
     * @mbg.generated
     */
    private Long uid;

    /**
     * 登录方式 第三方/邮箱/手机等
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     * 操作类型 1登陆成功  2登出成功 3登录失败 4登出失败
     *
     * @mbg.generated
     */
    private Byte command;

    /**
     * 客户端版本号
     *
     * @mbg.generated
     */
    private String version;

    /**
     * 客户端
     *
     * @mbg.generated
     */
    private String client;

    /**
     * 登录时设备号
     *
     * @mbg.generated
     */
    private String deviceId;

    /**
     * 登录ip
     *
     * @mbg.generated
     */
    private String lastip;

    /**
     * 手机系统
     *
     * @mbg.generated
     */
    private String os;

    /**
     * 系统版本
     *
     * @mbg.generated
     */
    private String osver;

    private String text;

    /**
     * 操作时间
     *
     * @mbg.generated
     */
    private Integer createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getCommand() {
        return command;
    }

    public void setCommand(Byte command) {
        this.command = command;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsver() {
        return osver;
    }

    public void setOsver(String osver) {
        this.osver = osver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", type=").append(type);
        sb.append(", command=").append(command);
        sb.append(", version=").append(version);
        sb.append(", client=").append(client);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", lastip=").append(lastip);
        sb.append(", os=").append(os);
        sb.append(", osver=").append(osver);
        sb.append(", text=").append(text);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserLoginLog other = (UserLoginLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCommand() == null ? other.getCommand() == null : this.getCommand().equals(other.getCommand()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getClient() == null ? other.getClient() == null : this.getClient().equals(other.getClient()))
            && (this.getDeviceId() == null ? other.getDeviceId() == null : this.getDeviceId().equals(other.getDeviceId()))
            && (this.getLastip() == null ? other.getLastip() == null : this.getLastip().equals(other.getLastip()))
            && (this.getOs() == null ? other.getOs() == null : this.getOs().equals(other.getOs()))
            && (this.getOsver() == null ? other.getOsver() == null : this.getOsver().equals(other.getOsver()))
            && (this.getText() == null ? other.getText() == null : this.getText().equals(other.getText()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCommand() == null) ? 0 : getCommand().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getClient() == null) ? 0 : getClient().hashCode());
        result = prime * result + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        result = prime * result + ((getLastip() == null) ? 0 : getLastip().hashCode());
        result = prime * result + ((getOs() == null) ? 0 : getOs().hashCode());
        result = prime * result + ((getOsver() == null) ? 0 : getOsver().hashCode());
        result = prime * result + ((getText() == null) ? 0 : getText().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}