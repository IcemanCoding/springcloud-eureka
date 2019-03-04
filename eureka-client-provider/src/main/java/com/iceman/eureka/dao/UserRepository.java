package com.iceman.eureka.dao;

import com.iceman.eureka.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Iceman
 * 2019/2/27
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
