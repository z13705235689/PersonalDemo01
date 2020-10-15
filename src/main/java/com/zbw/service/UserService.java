package com.zbw.service;


import com.zbw.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public interface UserService {

    public void login(User user);

}
