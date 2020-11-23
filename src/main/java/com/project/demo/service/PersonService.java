package com.project.demo.service;

import com.project.demo.pojo.Person;

/**
 *
 */

public interface PersonService {

    /**
     * 注册先进个人信息
     * @param person 先进个人信息
     */
    void register(Person person);

    /**
     * 根据id查找先进个人
     * @param id 先进个人id
     * @return 先进个人信息
     */
    Person findById(int id);

    /**
     * 根据id删除先进个人
     * @param id 先进个人ID
     */
    void delete(int id);

    /**
     * 修改先进个人信息
     * @param person 先进个人
     */
    void modify(Person person);

}
