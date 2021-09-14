package com.tarun.simpleController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleContoller {

    @RequestMapping("/")
    public String show(){
        System.out.println("hi");
        return "home.jsp";
    }
}
