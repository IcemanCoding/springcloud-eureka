package com.iceman.eureka.controller;

import com.iceman.eureka.dao.UserRepository;
import com.iceman.eureka.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Iceman
 * 2019/2/27
 */
@RestController
@RequestMapping( "/user" )
public class UserInfoController {

    private static final Logger LOGGER = LoggerFactory.getLogger( UserInfoController.class );

    @Autowired
    private UserRepository userRepository;

    @GetMapping( "/{id}" )
    public UserEntity findById( @PathVariable Long id ) {
        LOGGER.info( "【start】..." );
        UserEntity userEntity = this.userRepository.findOne( id );
        return userEntity;
    }

}
