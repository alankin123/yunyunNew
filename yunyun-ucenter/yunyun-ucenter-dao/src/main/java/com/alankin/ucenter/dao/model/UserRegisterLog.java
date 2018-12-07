package com.alankin.ucenter.dao.model;

import java.io.Serializable;

public class UserRegisterLog implements Serializable {
    /**
     * 自增ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 用户ID
     *
     * @mbg.generated
     */
    private Long uid;

    /**
     * 注册方式1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博
     *
     * @mbg.generated
     */
    private Byte registerMethod;

    /**
     * 注册时间
     *
     * @mbg.generated
     */
    private Integer registerTime;

    /**
     * 注册IP
     *
     * @mbg.generated
     */
    private String registerIp;

    /**
     * 注册客户端
     *
     * @mbg.generated
     */
    private String registerClient;

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

    public Byte getRegisterMethod() {
        return registerMethod;
    }

    public void setRegisterMethod(Byte registerMethod) {
        this.registerMethod = registerMethod;
    }

    public Integer getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Integer registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public String getRegisterClient() {
        return registerClient;
    }

    public void setRegisterClient(String registerClient) {
        this.registerClient = registerClient;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", registerMethod=").append(registerMethod);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", registerIp=").append(registerIp);
        sb.append(", registerClient=").append(registerClient);
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
        UserRegisterLog other = (UserRegisterLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getRegisterMethod() == null ? other.getRegisterMethod() == null : this.getRegisterMethod().equals(other.getRegisterMethod()))
            && (this.getRegisterTime() == null ? other.getRegisterTime() == null : this.getRegisterTime().equals(other.getRegisterTime()))
            && (this.getRegisterIp() == null ? other.getRegisterIp() == null : this.getRegisterIp().equals(other.getRegisterIp()))
            && (this.getRegisterClient() == null ? other.getRegisterClient() == null : this.getRegisterClient().equals(other.getRegisterClient()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getRegisterMethod() == null) ? 0 : getRegisterMethod().hashCode());
        result = prime * result + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        result = prime * result + ((getRegisterIp() == null) ? 0 : getRegisterIp().hashCode());
        result = prime * result + ((getRegisterClient() == null) ? 0 : getRegisterClient().hashCode());
        return result;
    }
}