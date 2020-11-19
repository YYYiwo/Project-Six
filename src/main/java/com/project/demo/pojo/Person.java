package com.project.demo.pojo;

public class Person {
    /*
    个人id
     */
    private Integer PersonID;
    /*
    个人名字
     */
    private String PersonName;
    /*
    个人年龄
     */
    private Integer Personage;
    /*
    个人的国家
     */
    private String PersonNation;
    /*
    个人的地址
     */
    private String PersonPlace;
    /*
    个人的出生日期
     */
    private Integer PersonBorn;

    public Integer getPersonID() {
        return PersonID;
    }

    public void setPersonID(Integer personID) {
        PersonID = personID;
    }

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String personName) {
        PersonName = personName;
    }

    public Integer getPersonage() {
        return Personage;
    }

    public void setPersonage(Integer personage) {
        Personage = personage;
    }

    public String getPersonNation() {
        return PersonNation;
    }

    public void setPersonNation(String personNation) {
        PersonNation = personNation;
    }

    public String getPersonPlace() {
        return PersonPlace;
    }

    public void setPersonPlace(String personPlace) {
        PersonPlace = personPlace;
    }

    public Integer getPersonBorn() {
        return PersonBorn;
    }

    public void setPersonBorn(Integer personBorn) {
        PersonBorn = personBorn;
    }
}
