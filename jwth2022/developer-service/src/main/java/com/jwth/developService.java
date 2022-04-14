package com.jwth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.jwth.mapper")
@EnableDiscoveryClient
@EnableAsync
public class developService {
    public static void main(String[] args) {
        SpringApplication.run(developService.class);
    }
}
