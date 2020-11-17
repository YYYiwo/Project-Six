package com.project.demo.pojo;

import java.util.Date;

/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/17 16:25
 */
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userRealName;
    private Date userLocalDate;

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

    public Date getUserLocalDate() {
        return userLocalDate;
    }

    public void setUserLocalDate(Date userLocalDate) {
        this.userLocalDate = userLocalDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRealName='" + userRealName + '\'' +
                ", userLocalDate=" + userLocalDate +
                '}';
    }
}
