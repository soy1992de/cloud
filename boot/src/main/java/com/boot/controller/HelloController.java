package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@RequestMapping("hello")*/
public class HelloController {

    @RequestMapping("/world")
    public String helloWorld(){
        return "hello spring boot";
    }



  /*  @Autowired
    public UtilTime utilTime;*/



}
