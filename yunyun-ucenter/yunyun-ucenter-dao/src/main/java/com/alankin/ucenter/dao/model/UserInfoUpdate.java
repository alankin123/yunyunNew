package com.alankin.ucenter.dao.model;

import java.io.Serializable;

public class UserInfoUpdate implements Serializable {
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
     * 属性名
     *
     * @mbg.generated
     */
    private String attributeName;

    /**
     * 属性对应旧的值
     *
     * @mbg.generated
     */
    private String attributeOldVal;

    /**
     * 属性对应新的值
     *
     * @mbg.generated
     */
    private String attributeNewVal;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    private Integer updateTime;

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

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeOldVal() {
        return attributeOldVal;
    }

    public void setAttributeOldVal(String attributeOldVal) {
        this.attributeOldVal = attributeOldVal;
    }

    public String getAttributeNewVal() {
        return attributeNewVal;
    }

    public void setAttributeNewVal(String attributeNewVal) {
        this.attributeNewVal = attributeNewVal;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", attributeName=").append(attributeName);
        sb.append(", attributeOldVal=").append(attributeOldVal);
        sb.append(", attributeNewVal=").append(attributeNewVal);
        sb.append(", updateTime=").append(updateTime);
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
        UserInfoUpdate other = (UserInfoUpdate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getAttributeName() == null ? other.getAttributeName() == null : this.getAttributeName().equals(other.getAttributeName()))
            && (this.getAttributeOldVal() == null ? other.getAttributeOldVal() == null : this.getAttributeOldVal().equals(other.getAttributeOldVal()))
            && (this.getAttributeNewVal() == null ? other.getAttributeNewVal() == null : this.getAttributeNewVal().equals(other.getAttributeNewVal()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        result = prime * result + ((getAttributeOldVal() == null) ? 0 : getAttributeOldVal().hashCode());
        result = prime * result + ((getAttributeNewVal() == null) ? 0 : getAttributeNewVal().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}