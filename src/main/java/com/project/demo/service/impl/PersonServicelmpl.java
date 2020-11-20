package com.project.demo.service.impl;

import com.project.demo.mapper.PersonMapper;
import com.project.demo.pojo.Person;
import com.project.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServicelmpl implements PersonService {
    @Autowired private PersonMapper personMapper;

    @Override
    public void register(Person person) {
        personMapper.savePerson(person);
    }

    @Override
    public Person findById(int id) {
        return personMapper.findByPersonId(id);
    }

    @Override
    public void delete(int id) {
        personMapper.deleteByPersonId(id);
        System.out.println("信息删除成功");
    }

    @Override
    public void modify(Person person) {
        personMapper.updatePerson(person);
    }
}
