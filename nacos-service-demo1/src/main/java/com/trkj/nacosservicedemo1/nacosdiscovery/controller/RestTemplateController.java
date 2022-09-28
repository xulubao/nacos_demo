package com.trkj.nacosservicedemo1.nacosdiscovery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController {
  @LoadBalanced
  @Autowired
  public RestTemplate restTemplate;
  @LoadBalanced
  @Bean
  public RestTemplate restTemplate() {
      return new RestTemplate();
  }
  @GetMapping("/call/echo/{message}")
  public String callEcho(@PathVariable String message) {
      // 访问应用 nacos-discovery-provide-sample 的 REST "/echo/{message}"
      return restTemplate.getForObject("http://nacos-service/echo/"+ message, String.class);
  }
}
