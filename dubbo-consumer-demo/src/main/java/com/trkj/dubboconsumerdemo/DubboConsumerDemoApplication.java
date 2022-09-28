package com.trkj.dubboconsumerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DubboConsumerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerDemoApplication.class, args);
    }

}
