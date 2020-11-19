package com.project.demo.pojo;

import java.util.Date;

/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/17 16:25
 */
public class User {
    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户真实名称
     */
    private String userRealName;

    /**
     * 出生日期
     */
    private Date userBornDate;

    /**
     * 性别
     */
    private String userGender;

    /**
     * 身份证
     */
    private String userIdentity;

    /**
     * 电话号码
     */
    private String userPhone;

    /**
     * 邮箱
     */
    private String userEmail;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public Date getUserBornDate() {
        return userBornDate;
    }

    public void setUserBornDate(Date userBornDate) {
        this.userBornDate = userBornDate;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRealName='" + userRealName + '\'' +
                ", userBornDate=" + userBornDate +
                ", userGender='" + userGender + '\'' +
                ", userIdentity='" + userIdentity + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
