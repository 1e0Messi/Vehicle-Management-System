package com.team4.controller;

import com.team4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 缑元彪 on 2018/3/10.
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/testSpringMVC")
    public String testSpringMVC(){
        return "testSpringMVC";
    }

    @RequestMapping("/testMyBatis")
    @ResponseBody
    public String testMyBatis(){
        String rs = "id:" + userService.getAllUser().get(0).getId() + "     userName:" +userService.getAllUser().get(0).getUserName() + "    age:" + userService.getAllUser().get(0).getAge() + "\\r\\nid:" + userService.getAllUser().get(1).getId() + "     userName:" +userService.getAllUser().get(1).getUserName() + "    age:" + userService.getAllUser().get(1).getAge();
        return rs;
    }
}
