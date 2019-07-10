package com.neuedu.his.global;
/*
时间 ：  2019-07-0914:07

作用 ：

基本思路 ：
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class GlobalApplication {
    public static void main(String[] args){
        SpringApplication.run(GlobalApplication.class,args);
    }
}
