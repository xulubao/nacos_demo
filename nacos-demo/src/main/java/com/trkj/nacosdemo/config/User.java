package com.trkj.nacosdemo.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author XuLuBao
 * @version V1.0
 * @Package com.trkj.nacosdemo.config
 * @date 2021/6/10 15:28
 */
@Data
@RefreshScope
//@Component   //当如果不是组件就会报错
@ConfigurationProperties(prefix = "user")
@Slf4j
public class User implements InitializingBean, DisposableBean {

    private String name;
    private int age;

    @Override
    public void destroy() throws Exception {
        log.info("in user destroy {},{}",name,age);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("in user destroy {},{}",name,age);
    }
}
