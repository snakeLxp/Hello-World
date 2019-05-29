package com.cun.provider2.controller;

import com.cun.provider2.service.Message2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019-05-29.
 */
@RestController
public class Message2Controller {


    @Autowired
    Message2Service message2Service;


    @GetMapping("/get")
    public String getMessage(){

        return message2Service.getMessage();
    }

}
