package com.yybf.yybf.controller;


import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.yybf.yybf.entity.User;
import com.yybf.yybf.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/**
 * @author yhg
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/password")
    @ResponseBody
    public String getPasswordByid(){
        List<User> user_list  = userService.getAll();
//        return userService.getPasswordByid(1).getPassword();
        JSONArray jsonArray = new JSONArray();
        for(User user : user_list){
            jsonArray.add(user);
        }

        return jsonArray.toString();
    }

}
