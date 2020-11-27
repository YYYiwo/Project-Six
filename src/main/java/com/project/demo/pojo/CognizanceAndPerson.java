package com.project.demo.pojo;

import java.util.Date;

/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/24 14:33
 */
public class CognizanceAndPerson {
    /**
     * 劳模荣誉称号
     */
    private String honer;

    /**
     * 劳模系统分类
     */
    private String sort;

    /**
     * 劳模社会属性
     */
    private String attribute;

    /**
     * 劳模认定状态
     **/
    private String status;

    /**
     * 劳模调动状态
     */
    private String call;

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

    public String getHoner() {
        return honer;
    }

    public void setHoner(String honer) {
        this.honer = honer;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
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

    @Override
    public String toString() {
        return "CognizanceAndPerson{" +
                "honer='" + honer + '\'' +
                ", sort='" + sort + '\'' +
                ", attribute='" + attribute + '\'' +
                ", status='" + status + '\'' +
                ", call='" + call + '\'' +
                ", personName='" + personName + '\'' +
                ", personAge=" + personAge +
                ", personNation='" + personNation + '\'' +
                ", personPlace='" + personPlace + '\'' +
                ", personBorn=" + personBorn +
                '}';
    }
}
