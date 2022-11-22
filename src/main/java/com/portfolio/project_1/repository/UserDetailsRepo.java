package com.portfolio.project_1.repository;

import com.portfolio.project_1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}