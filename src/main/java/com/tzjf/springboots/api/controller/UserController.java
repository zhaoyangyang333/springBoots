package com.tzjf.springboots.api.controller;

import com.tzjf.springboots.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("addUser")
    public User addUser(User user) throws IOException {
       return user;
    }



}
