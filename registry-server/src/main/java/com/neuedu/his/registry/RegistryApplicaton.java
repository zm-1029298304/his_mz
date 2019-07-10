package com.neuedu.his.registry;
/*
时间 ：  2019-07-0914:51

作用 ：

基本思路 ：
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryApplicaton {
    public static void main(String[] args) {
        SpringApplication.run(RegistryApplicaton.class,args);
    }
}
