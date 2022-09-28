package com.trkj.dubboproviderdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DubboProviderDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderDemoApplication.class, args);
    }

}
