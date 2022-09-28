package com.trkj.nacosservicedemo1.nacosdiscovery;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("nacos-service") // 指向服务提供者应用
public interface EchoService {

  @GetMapping("/echo/{message}")
  String echo(@PathVariable("message") String message);
}
