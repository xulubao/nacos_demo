package com.trkj.nacosservicedemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.trkj.nacosservicedemo1.nacosdiscovery")
public class NacosServiceDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosServiceDemo1Application.class, args);
    }

}
