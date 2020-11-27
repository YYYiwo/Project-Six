package com.project.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.demo.mapper.CognizanceAndPersonMapper;
import com.project.demo.pojo.CognizanceAndPerson;
import com.project.demo.service.CognizanceAndPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/24 14:51
 */
@Service
public class CognizanceAndPersonServiceImpl implements CognizanceAndPersonService {

    @Autowired
    private CognizanceAndPersonMapper cognizanceAndPersonMapper;


    @Override
    public List<CognizanceAndPerson> findByPersonName(String personName) {
        return cognizanceAndPersonMapper.findByPersonName(personName);
    }

    @Override
    public List<CognizanceAndPerson> findByPersonAge(int personAge) {
        return cognizanceAndPersonMapper.findByPersonAge(personAge);
    }

    @Override
    public List<CognizanceAndPerson> findByPersonNation(String personNation) {
        return cognizanceAndPersonMapper.findByPersonNation(personNation);
    }

    @Override
    public List<CognizanceAndPerson> findByHoner(String honer) {
        return cognizanceAndPersonMapper.findByHoner(honer);
    }

    @Override
    public List<CognizanceAndPerson> findBySort(String sort) {
        return cognizanceAndPersonMapper.findBySort(sort);
    }

    @Override
    public List<CognizanceAndPerson> findByAttribute(String attribute) {
        return cognizanceAndPersonMapper.findByAttribute(attribute);
    }

    @Override
    public List<CognizanceAndPerson> findByStatus(String status) {
        return cognizanceAndPersonMapper.findByStatus(status);
    }

    @Override
    public List<CognizanceAndPerson> findByCall(String call) {
        return cognizanceAndPersonMapper.findByCall(call);
    }

    @Override
    public List<CognizanceAndPerson> findAllPages() {
        return cognizanceAndPersonMapper.findAll();
    }
}
