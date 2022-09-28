package com.trkj.nacosdemo.controller;

import com.trkj.nacosdemo.config.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XuLuBao
 * @version V1.0
 * @Package com.trkj.nacosdemo.controller
 * @date 2021/6/10 15:36
 */
@RestController
@EnableConfigurationProperties(User.class)
@Slf4j
public class IndexController2 {
    @Autowired User user;
    @GetMapping("/user2")
    private String user(@RequestParam(required = false) String user){
        log.info("in user Controller {}",user.toString());
        return user.toString();
    }
}
