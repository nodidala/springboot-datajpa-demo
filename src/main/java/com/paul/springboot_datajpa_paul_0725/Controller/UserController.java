package com.paul.springboot_datajpa_paul_0725.Controller;

import com.paul.springboot_datajpa_paul_0725.Entity.User;
import com.paul.springboot_datajpa_paul_0725.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 一个教训：@Controller("/"),这种写法不对，想在根目录加，应该使用@RequestMapping("/")
 * @author paul
 * @date 2019/7/25 15:47
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }
    @RequestMapping("/list")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }
}
