package com.project.demo.controller;


import com.project.demo.pojo.CognizanceAndPerson;
import com.project.demo.service.CognizanceAndPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.demo.pojo.User;
import com.project.demo.pojo.UserRole;
import com.project.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/17 16:32
 */
@Controller
@RequestMapping("/user")
public class UserController {
//
//    @Autowired private UserService service;
//
//    @RequestMapping("/register")
//    public String register(User user){
//        return service.register(user).toString();
//    }
//
//    @RequestMapping("/findUser/{id}")
//    public String findUser(@PathVariable int id){
//        return service.findById(id).toString();
//    }

    @Autowired private UserService userService;
    @RequestMapping("/All")
    public String All(){
        return "login";
    }

    //登录
    @RequestMapping("/login")
    public String login(Model model,HttpServletRequest request,@RequestParam("user_name") String user_name,@RequestParam("user_password") String user_password){
        User user = userService.findByUserName(user_name);
        if(user ==null){
            //暂时，结果要在页面显示账号为空
            HttpSession session = request.getSession();
            session.setAttribute("error","yes");
            model.addAttribute("error","yes");
            return "login";
        }else{
            User userReal = userService.findByUsernameAndPassword(user_name,user_password);
            if (userReal != null) {
                int num = userService.findRoleId(userReal.getUserId());
                String roleName = userService.findRole(num);
                model.addAttribute("roleId",num);
                model.addAttribute("user",userReal);
                model.addAttribute("roleName",roleName);
                return "index";

            }
            model.addAttribute("error","no");
            return "login";
        }
    }

    //显示所有用户
    @RequestMapping("/findAll")
    public void findAll(){
        userService.findAll();
    }

    //创建一个用户
    @RequestMapping()
    public void register(User user){
        userService.register(user);
    }

    //删除用户
    @RequestMapping("/delete")
    public void delete(@PathVariable int userId){
        userService.delete(userId);
    }
    //修改用户基本信息
    @RequestMapping("/modify")
    public void modifyUser(User user){
        userService.modify(user);
    }
    //修改权限
    @RequestMapping("/modifyUserRole")
    public void modifyUserRole(UserRole userRole){
        userService.modifyUserRole(userRole);
    }

    @ResponseBody
    @RequestMapping("/findAllPage")
    public  PageInfo<User> userPageInfo(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                       @RequestParam(value = "pageSize",defaultValue = "4") int pageSize){
        PageInfo<User> pageInfo =userService.findAllPage(pageNum,pageSize);

        return pageInfo;
    }


    @RequestMapping("/find")
    public String find(Model model,@RequestParam(value = "page",defaultValue = "1") int page,
                             @RequestParam(value = "pageSize",defaultValue = "4") int pageSize){
        PageHelper.startPage(page,pageSize);
        List<User> list =userService.findAll();
        PageInfo<User> pageInfo = new PageInfo<>(list);
        model.addAttribute("pageInfo",pageInfo);
        return "User";

    }
}
