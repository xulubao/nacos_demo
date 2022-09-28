package com.trkj.nacosservicedemo1.nacosdiscovery.controller;

import com.trkj.nacosservicedemo1.nacosdiscovery.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenFeignController {

  @Autowired
  private EchoService echoService;

  @GetMapping("/feign/echo/{message}")
  public String feignEcho(@PathVariable String message) {
      return echoService.echo(message);
  }
}
