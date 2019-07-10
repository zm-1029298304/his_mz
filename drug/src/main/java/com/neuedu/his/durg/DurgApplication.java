package com.neuedu.his.durg;
/*
时间 ：  2019-07-0913:52

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
public class DurgApplication {
    public static void main(String[] args){
        SpringApplication.run(DurgApplication.class,args);
    }
}
