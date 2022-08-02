package com.atguigu.gulimall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
* 整合Mybatis-plus
*   1.导入Mybatis-plus
*   2.配置
*       配置数据库
*           a.导入数据库驱动
*           b.配置数据源
*        配置mybatis-plus
*           a.使用MapperScan
*           b.告诉mybatis-plus,sql映射文件位置
* */
@EnableDiscoveryClient
@SpringBootApplication
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
