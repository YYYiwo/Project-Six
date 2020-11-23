package com.project.demo.pojo;

import java.util.Date;

public class Person {
    /*
    先进个人id
     */
    private Integer personID;

    /*
    先进个人名字
     */
    private String personName;

    /*
    先进个人年龄
     */
    private Integer personAge;

    /*
    先进个人的民族
     */
    private String personNation;

    /*
    先进个人的地址
     */
    private String personPlace;

    /*
    先进个人的出生日期
     */
    private Date personBorn;

    /*
    用户的id
     */
    private Integer userId;

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Integer personAge) {
        this.personAge = personAge;
    }

    public String getPersonNation() {
        return personNation;
    }

    public void setPersonNation(String personNation) {
        this.personNation = personNation;
    }

    public String getPersonPlace() {
        return personPlace;
    }

    public void setPersonPlace(String personPlace) {
        this.personPlace = personPlace;
    }

    public Date getPersonBorn() {
        return personBorn;
    }

    public void setPersonBorn(Date personBorn) {
        this.personBorn = personBorn;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", personName='" + personName + '\'' +
                ", personAge=" + personAge +
                ", personNation='" + personNation + '\'' +
                ", personPlace='" + personPlace + '\'' +
                ", personBorn=" + personBorn +
                ", userId=" + userId +
                '}';
    }
}
