package com.trkj.nacosdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * @author XuLuBao
 * @version V1.0
 * @Package com.trkj.nacosdemo
 * @date 2021/6/16 18:42
 */
@SpringBootTest
public class TimingProgramApplicationTests {
    @Autowired
    JavaMailSenderImpl mailSender;
    @Test
    void SenMail() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("这是啥嘛");
        simpleMailMessage.setText("这是一封简单的邮件啦~");
        simpleMailMessage.setFrom("2324962847@qq.com");
        simpleMailMessage.setTo("1642205646@qq.com");
        mailSender.send(simpleMailMessage);
    }
}