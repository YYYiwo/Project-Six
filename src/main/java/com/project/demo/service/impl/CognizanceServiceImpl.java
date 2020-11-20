package com.project.demo.service.impl;


import com.project.demo.mapper.CognizanceMapper;
import com.project.demo.pojo.Cognizance;
import com.project.demo.service.CognizanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CognizanceServiceImpl implements CognizanceService{

    @Autowired
    private CognizanceMapper cognizanceMapper;

    @Override
    public void add(Cognizance cognizance) {
        cognizanceMapper.add(cognizance);
    }

    @Override
    public void delete(Integer id) {
        cognizanceMapper.delete(id);
    }

    @Override
    public void update(Cognizance cognizance) {
        cognizanceMapper.update(cognizance);
    }

    @Override
    public void findById(Integer id) {
       cognizanceMapper.findById(id);
    }

}
