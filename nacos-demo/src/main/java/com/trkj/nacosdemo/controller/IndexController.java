package com.trkj.nacosdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

/**
 * @author XuLuBao
 * @version V1.0
 * @Package com.trkj.nacosdemo.controller
 * @date 2021/6/10 15:14
 */
@RestController
@Slf4j
@RefreshScope
public class IndexController {
    @Value("${user.name}")
    private String userName;
    @Value("${user.age}")
    private String userAge;

    @PostConstruct
    public void init(){
        log.info("IndexController：userName:{},userAge:{}",userName,userAge);
    }
    @PreDestroy
    public void destory(){
        log.info("Destory：userName:{},userAge:{}",userName,userAge);
    }
    @GetMapping("/user")
    public String user(@RequestParam(required=false)  String user){
        log.info("User：userName:{},userAge:{}", StringUtils.isEmpty(user)?userName:user,userAge);
        return "user:"+userName+ "        age:"+userAge;
    }

    @PostMapping("/test")
    private Map<String ,Object> test(Map<String,Object> map){

        return map;
    }
}
