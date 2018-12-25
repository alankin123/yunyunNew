package com.alankin.gateway.web.request;

/**
 * @author: alankin
 * @Description: TODO
 * @date 创建时间：2018/12/25　17:21
 */
public class RegisterReqVo {
    /**
     * 用户ID
     *
     * @mbg.generated
     */
    private Long uid;

    /**
     * 2正常用户 3禁言用户 4虚拟用户 5运营
     *
     * @mbg.generated
     */
    private Byte userRole;

    /**
     * 注册来源：1手机号 2邮箱 3用户名 4qq 5微信 6腾讯微博 7新浪微博
     *
     * @mbg.generated
     */
    private Byte registerSource;

    /**
     * 用户账号，必须唯一
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * 用户昵称
     *
     * @mbg.generated
     */
    private String nickName;

    /**
     * 用户性别 0-female 1-male
     *
     * @mbg.generated
     */
    private Boolean gender;

    /**
     * 用户生日
     *
     * @mbg.generated
     */
    private Long birthday;

    /**
     * 用户个人签名
     *
     * @mbg.generated
     */
    private String signature;

    /**
     * 手机号码(唯一)
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 手机号码绑定时间
     *
     * @mbg.generated
     */
    private Integer mobileBindTime;

    /**
     * 邮箱(唯一)
     *
     * @mbg.generated
     */
    private String email;

    /**
     * 邮箱绑定时间
     *
     * @mbg.generated
     */
    private Integer emailBindTime;

    /**
     * 头像
     *
     * @mbg.generated
     */
    private String face;

    /**
     * 头像 200x200x80
     *
     * @mbg.generated
     */
    private String face200;

    /**
     * 原图头像
     *
     * @mbg.generated
     */
    private String srcface;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Integer createTime;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    private Integer updateTime;

    /**
     * 用户设备push_token
     *
     * @mbg.generated
     */
    private String pushToken;

    private static final long serialVersionUID = 1L;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Byte getUserRole() {
        return userRole;
    }

    public void setUserRole(Byte userRole) {
        this.userRole = userRole;
    }

    public Byte getRegisterSource() {
        return registerSource;
    }

    public void setRegisterSource(Byte registerSource) {
        this.registerSource = registerSource;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getMobileBindTime() {
        return mobileBindTime;
    }

    public void setMobileBindTime(Integer mobileBindTime) {
        this.mobileBindTime = mobileBindTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEmailBindTime() {
        return emailBindTime;
    }

    public void setEmailBindTime(Integer emailBindTime) {
        this.emailBindTime = emailBindTime;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getFace200() {
        return face200;
    }

    public void setFace200(String face200) {
        this.face200 = face200;
    }

    public String getSrcface() {
        return srcface;
    }

    public void setSrcface(String srcface) {
        this.srcface = srcface;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }
}
