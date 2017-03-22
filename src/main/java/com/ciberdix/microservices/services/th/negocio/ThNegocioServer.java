package com.ciberdix.microservices.services.th.negocio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters = false)
public class ThNegocioServer {
    public static final String DOMINIO_SERVICE_URL = "http://TH-DOMINIO-SERVICE";

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "th-negocio-server");
        SpringApplication.run(ThNegocioServer.class, args);
    }    
}
