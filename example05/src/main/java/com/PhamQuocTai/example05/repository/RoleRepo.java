package com.PhamQuocTai.example05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PhamQuocTai.example05.entity.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    
}
