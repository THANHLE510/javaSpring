package com.example.examspringframework.repository;
import com.example.examspringframework.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface RoleRepository extends JpaRepository<Role, Long>{
    List<Role> findByUserId(String userId);
}
