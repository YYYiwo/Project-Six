package com.project.demo.service;

import com.project.demo.pojo.Cognizance;

import java.util.List;

public interface CognizanceService {
    void add(Cognizance cognizance);
    void delete(Integer id);
    void update(Cognizance cognizance);
    void findById(Integer id);

}
