package com.ciberdix.microservices.services.th.dominio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
public class ThDominioServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "th-dominio-server");
        SpringApplication.run(ThDominioServer.class, args);
    }
}
