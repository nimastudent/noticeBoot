package com.nima.webnotice.controller;


import com.nima.webnotice.entities.ResultSet;
import com.nima.webnotice.entities.User;
import com.nima.webnotice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller

public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/userLogin")
    @ResponseBody
    public String userLogin(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        System.out.println(userName);
        System.out.println(password);
        return "test123";
    }

    @PostMapping(value = "/login")
    @ResponseBody

    public Object postTest(@RequestParam("userName") String userName, @RequestParam("password") String password, HttpServletRequest request) {
        HttpSession session = request.getSession();

        if (userName == null || password == null) {
            return "false";
        }
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        Boolean login = userService.login(user);
        ResultSet rs = new ResultSet();
        rs.setStatus(200);
        if (login) {
            rs.setMessage("登录成功");
            rs.setData(true);
            session.setAttribute("User",user);
        } else {
            rs.setMessage("密码错误或者用户名不存在");
            rs.setData(false);
        }
        return rs;
    }


}
