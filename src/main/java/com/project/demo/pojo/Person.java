package com.project.demo.pojo;

public class Person {
    /*
    个人id
     */
    private Integer personID;
    /*
    个人名字
     */
    private String personName;
    /*
    个人年龄
     */
    private Integer personAge;
    /*
    个人的民族
     */
    private String personNation;
    /*
    个人的地址
     */
    private String personPlace;
    /*
    个人的出生日期
     */
    private Integer personBorn;

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

    public Integer getPersonBorn() {
        return personBorn;
    }

    public void setPersonBorn(Integer personBorn) {
        this.personBorn = personBorn;
    }
}
