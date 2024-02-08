package com.dailycodebuffer.springboot.controller;

import com.dailycodebuffer.springboot.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello Fazeel REST!";
    }

    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setId("1");;
        user.setName("Fazeel Usmani");
        user.setEmail("fazeel@gmail.com");

        return user;
    }

    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id, @PathVariable("id2") String id2) {
        return "The path variable is " + id + " and second path variable is " + id2;
    }

    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name,
                                @RequestParam(name="email", required = false, defaultValue = "") String emailId) {
        return "Your name is: " + name + " and emailId is: " + emailId;
    }

}
