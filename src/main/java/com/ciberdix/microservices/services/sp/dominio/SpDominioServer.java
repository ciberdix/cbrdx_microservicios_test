package com.ciberdix.microservices.services.sp.dominio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
public class SpDominioServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "sp-dominio-server");
        SpringApplication.run(SpDominioServer.class, args);
    }
}
