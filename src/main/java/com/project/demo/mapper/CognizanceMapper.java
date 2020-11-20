package com.project.demo.mapper;

import com.project.demo.pojo.Cognizance;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
//@Repository
public interface CognizanceMapper{
    void add(Cognizance cognizance);

    void delete(Integer id);

    void update(Cognizance cognizance);

    void findById(Integer id);


}
