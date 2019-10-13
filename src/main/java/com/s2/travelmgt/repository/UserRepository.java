package com.s2.travelmgt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<com.s2.travelmgt.model.User, Long> {
    Optional<com.s2.travelmgt.model.User> findByUsername(String username);
    //Boolean existsByUsername(String username);
    //Boolean existsByEmail(String email);
}