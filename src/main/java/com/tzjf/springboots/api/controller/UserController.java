package com.tzjf.springboots.api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tzjf.springboots.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@Controller
@RequestMapping("user")
public class UserController {

    private final int age = 12 ;

    @RequestMapping("addUser")
    public void addUser(User user, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
        System.out.println(age);
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(user);
        System.out.println(s);
        Integer online_num = (Integer) session.getServletContext().getAttribute("online_num");
        System.out.println("当前登录人数:"+online_num);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.write(s);
        writer.write("当前登录人数:"+online_num);
        writer.flush();
        writer.close();
    }

}
