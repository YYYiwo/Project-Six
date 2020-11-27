package com.project.demo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.demo.pojo.CognizanceAndPerson;
import com.project.demo.service.CognizanceAndPersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired private CognizanceAndPersonService service;

    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
        List<CognizanceAndPerson> pages = service.findAllPages();
        PageInfo<CognizanceAndPerson> pageInfo = new PageInfo<>(pages);

        System.out.println(pageInfo);
    }

}
