package com.zbw.controller;

import com.zbw.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public void login(@RequestParam(required = false,value = "username")String username,
                      @RequestParam(required = false,value = "password")String password){

    }
}
