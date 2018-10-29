package com.devil;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.devil.mapper")
public class ReptApp {
    public static void main(String []args){
        SpringApplication.run(ReptApp.class,args);
    }
}
