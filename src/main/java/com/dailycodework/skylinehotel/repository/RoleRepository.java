package com.dailycodework.skylinehotel.repository;

import com.dailycodework.skylinehotel.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(String role);

    boolean existsByName(String role);
}