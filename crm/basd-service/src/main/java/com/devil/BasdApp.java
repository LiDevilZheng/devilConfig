package com.devil;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.devil.mapper")
public class BasdApp {
    public static void main(String []args){
        SpringApplication.run(BasdApp.class,args);
    }
}
