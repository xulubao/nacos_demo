package com.trkj.dubboproviderdemo.service;


import com.trkj.service.EchoService;
import org.apache.dubbo.config.annotation.DubboService;
@DubboService
public class SimpleEchoService implements EchoService {
    @Override
    public String echo(String s) {
        return "[ECHO] " + s;
    }
}