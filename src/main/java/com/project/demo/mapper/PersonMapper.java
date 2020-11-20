package com.project.demo.mapper;

import com.project.demo.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonMapper {
    /**
     * 添加一个先进个人
     * @param person 先进个人
     */
    void savePerson(Person person);

    /**
     * 根据id查找先进个人
     * @param id 先进个人id
     * @return 先进个人信息
     */
    Person findByPersonId(int id);

    /**
     * 根据id删除先进个人
     * @param id 先进个人id
     */
    void deleteByPersonId(int id);

    /**
     * 修改先进个人信息
     * @param person 先进个人信息
     */
    void updatePerson(Person person);

}
