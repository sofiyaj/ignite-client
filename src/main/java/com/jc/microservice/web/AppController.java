package com.jc.microservice.web;


import org.gj.demo.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jc.microservice.service.AppService;


/**
 * @Author: wangjie
 * @Description:
 * @Date: Created in 19:07 2018/1/8
 */
@RestController
@RequestMapping("/ignite")
@CrossOrigin
public class AppController {
    @Autowired
    AppService appService;
    @RequestMapping("/pull")
    @ResponseBody
    public void pull() {
    	appService.pull();
    }
    @RequestMapping("/get")
    @ResponseBody
    public String put(int key){
        appService.get(key);
        return "ok";
    }
    @RequestMapping("/put")
    @ResponseBody
    public String put(int key, String value){
        appService.put(key, value);
        return "ok";
    }


}
