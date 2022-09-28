package com.trkj.nacosdemo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class NacosDemo1Application {

    @Value("${user.name}")
    private String userName;
    @Value("${user.age}")
    private String userAge;

    @PostConstruct
    public void init(){
        log.info("userName:{},userAge:{}",userName,userAge);
    }

    public static void main(String[] args) {
        SpringApplication.run(NacosDemo1Application.class, args);
    }

}
