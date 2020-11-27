package com.project.demo.service;

import com.github.pagehelper.PageInfo;
import com.project.demo.pojo.CognizanceAndPerson;

import java.util.List;


/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/24 14:50
 */
public interface CognizanceAndPersonService {

    /**
     * 根据个人名字查询先进个人信息
     * @param personName 名字
     * @return 先进个人信息
     */
    List<CognizanceAndPerson> findByPersonName(String personName);

    /**
     * 根据年龄查询
     * @param personAge 年龄
     * @return 个人信息
     */
    List<CognizanceAndPerson> findByPersonAge(int personAge);

    /**
     * 根据民族查询
     * @param personNation 民族
     * @return 个人信息
     */
    List<CognizanceAndPerson> findByPersonNation(String personNation);

    /**
     * 根据荣誉称号查询
     * @param honer 称号
     * @return 个人信息
     */
    List<CognizanceAndPerson> findByHoner(String honer);

    /**
     * 根据系统分类查询
     * @param sort 系统分类（所属的工会）
     * @return 个人信息
     */
    List<CognizanceAndPerson> findBySort(String sort);

    /**
     * 根据社会属性查询
     * @param attribute 社会属性
     * @return 个人信息
     */
    List<CognizanceAndPerson> findByAttribute(String attribute);

    /**
     * 根据认定状况查询
     * @param status 认定状况
     * @return 个人信息
     */
    List<CognizanceAndPerson> findByStatus(String status);

    /**
     * 根据调动状况查询
     * @param call 调动状况
     * @return 个人信息
     */
    List<CognizanceAndPerson> findByCall(String call);

    List<CognizanceAndPerson> findAllPages();
}
