package com.project.demo.controller;

import com.project.demo.pojo.CognizanceAndPerson;
import com.project.demo.service.CognizanceAndPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/17 16:32
 */
@Controller
public class UserController {

    @Autowired private CognizanceAndPersonService service;

    @RequestMapping("findAll")
    public String bourse(Model model) {
        List<CognizanceAndPerson> allPages = service.findAllPages();
        model.addAttribute("pages",allPages);
        return "find";
    }
}
