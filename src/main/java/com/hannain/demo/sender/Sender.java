package com.hannain.demo.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @version: 1.0.0
 * @author: wangcd
 * @date: 十二月 27 2017,15:50
 * @description:
 **/
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
//        this.rabbitTemplate.convertAndSend("hello", context);
    }
}
