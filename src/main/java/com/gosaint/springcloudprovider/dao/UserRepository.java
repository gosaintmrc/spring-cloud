package com.gosaint.springcloudprovider.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gosaint.springcloudprovider.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
