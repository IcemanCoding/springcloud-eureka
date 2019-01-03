package com.iceman.eureka.server.ha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Iceman
 * 2019/1/3
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerHaApplication {

    public static void main( String[] args ) {
        SpringApplication.run( EurekaServerHaApplication.class, args );
    }

}
