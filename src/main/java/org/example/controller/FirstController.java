package org.example.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Enumeration;

/**
 * 该类为拦截器,拦截浏览器的请求并做处理
 *
 * @author Jackasher
 * @version 1.0
 * @className FirstController
 * @since 1.0
 **/
@Controller("firstController")
public class FirstController {
    public FirstController() {
        System.out.println("FirstController被创建");
    }

    @RequestMapping("/first")
    public String hehe() {
        return "first";
    }

    @RequestMapping("/second")
    public String haha() {
        return "second";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response ) {
        return "login";
    }

    @RequestMapping("/identified")
    public String loginIndetiyied(HttpServletRequest request, HttpServletResponse response ) {

        System.out.println(request);
        System.out.println(request);
        Enumeration<String> parameterNames = request.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String s = parameterNames.nextElement();
            System.out.println(s);
        }

        return "okay";
    }

    @RequestMapping("/edit")
    public String edit() {
        return "edit";
    }

    @RequestMapping("/manager")
    public String manager() {
        return "manager";
    }

    @RequestMapping("/LostAndFound")
    public String lostAndFound() {
        return "LostAndFound";
    }

    @RequestMapping("/trade")
    public String trade() {
        return "trade";
    }

    @RequestMapping("/life")
    public String life() {
        return "life";
    }

    @RequestMapping("/")
    public String all() {
        return "first";
    }

    @RequestMapping("/login/{a}/{b}")
    public String RESTFulURL(@PathVariable("a") String username, @PathVariable("b") String password){
        System.out.println("a = " + username + " b = " + password);
        return "okay";
    }

    @RequestMapping(value = "/login/post",method = {RequestMethod.POST})
    public String UserLogin(){
        return "okay";
    }

    @RequestMapping("/a")
    public String URlTest(
                          @RequestParam(name = "username", required = false) String username,
                          @RequestParam(name = "password", required = false) String password
                          ) {

        return "okay";
    }

    @RequestMapping(value = "/b", params = {"username","password","age"})
    public String URlTest2(){


        return "okay";
    }

}
