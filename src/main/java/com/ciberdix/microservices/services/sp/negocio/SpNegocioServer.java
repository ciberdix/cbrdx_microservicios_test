package com.ciberdix.microservices.services.sp.negocio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters = false)
public class SpNegocioServer {

    public static final String DOMINIO_SERVICE_URL = "http://SP-DOMINIO-SERVICE";

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "sp-negocio-server");
        SpringApplication.run(SpNegocioServer.class, args);
    }
}
