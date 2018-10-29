package com.devil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eurekaApp {
    public static void main(String []args){
        SpringApplication.run(eurekaApp.class,args);
    }
}
