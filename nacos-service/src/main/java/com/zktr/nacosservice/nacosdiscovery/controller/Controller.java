package com.zktr.nacosservice.nacosdiscovery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XuLuBao
 * @version V1.0
 * @Package com.zktr.nacosservice.nacosdiscovery.controller
 * @date 2021/6/16 18:55
 */
@RestController
public class Controller {
    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        System.out.println("开始提供服务.........................."+message);
        return "[ECHO] : " + message;
    }

}
