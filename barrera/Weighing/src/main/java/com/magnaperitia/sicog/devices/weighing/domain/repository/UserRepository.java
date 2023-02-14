package com.magnaperitia.sicog.devices.weighing.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magnaperitia.sicog.devices.weighing.domain.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(String username);

}