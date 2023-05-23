package com.nagarro.kshitizagarwal.Application2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.kshitizagarwal.Application2.model.UserDetails;

public interface Repository extends JpaRepository<UserDetails, Integer> {

}
