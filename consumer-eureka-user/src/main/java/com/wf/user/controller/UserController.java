package com.wf.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wf
 * @create 2020-08-29 21:13
 * @desc
 **/
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket() {
        String object = restTemplate.getForObject("http://PROVIDER-EUREKA-TICKET/ticket", String.class);
        return "购买了：" + object;
    }
}
