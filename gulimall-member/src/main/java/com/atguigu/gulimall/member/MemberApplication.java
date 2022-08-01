package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/*
* 想要远程调用别的服务
* 1.引入open-feign
* 2.编写一个接口告诉SpringCloud这个结构需要远程调用
*   *.声明的方法就是调用的那个远程服务的那个 controller 实现方法
* 3.@EnableFeignClients注解，开启远程调用功能
* */
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class,args);
    }
}
