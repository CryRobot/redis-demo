package com.example.redisdemo.mq;

import org.springframework.stereotype.Service;

/**
 * @Author: CryRobot
 * @Date: 10/27/2019 9:24 PM
 * @Description:
 */
@Service
public class RedisReceiver {
    public void receiveMessage(String message) {
        System.out.println("消息来了："+message);
        //这里是收到通道的消息之后执行的方法
    }
}
