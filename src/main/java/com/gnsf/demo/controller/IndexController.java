package com.gnsf.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 * author:w
 * time:05-15
 */
@RestController

public class IndexController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("欢迎进入spring boot");
        return "index";
    }
}
