package com.nima.webnotice.controller;


import com.nima.webnotice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/userLogin")
    public String userLogin(@RequestParam("userName") String userName,@RequestParam("password") String password){
        System.out.println(userName);
        System.out.println(password);
        return "11211233";
    }


}
