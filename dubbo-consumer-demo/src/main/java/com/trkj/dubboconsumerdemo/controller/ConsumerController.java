package com.trkj.dubboconsumerdemo.controller;

import com.trkj.service.EchoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ConsumerController {
    @DubboReference
    private EchoService echoService;
    @Value("${server.port}")
    private String port;

    @GetMapping("/echo")
    public String echo(@RequestParam(name = "message", defaultValue = "no message") String message) {
        System.out.println("开始调用远程方法");
        return echoService.echo(message+" : "+port);
    }
}
