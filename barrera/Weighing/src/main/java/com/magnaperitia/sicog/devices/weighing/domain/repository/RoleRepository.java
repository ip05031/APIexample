package com.magnaperitia.sicog.devices.weighing.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magnaperitia.sicog.devices.weighing.domain.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	public Optional<Role> findByName(String name);

}