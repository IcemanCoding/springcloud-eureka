package com.iceman.eureka.controller;

import com.iceman.eureka.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Iceman
 * 2019/2/27
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping( "/user/{id}" )
    public UserEntity findById( @PathVariable Long id ) {
        return this.restTemplate.getForObject( "http://localhost:8282/user/" + id, UserEntity.class );
    }

}
