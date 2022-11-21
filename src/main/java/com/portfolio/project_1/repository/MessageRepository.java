package com.portfolio.project_1.repository;

import com.portfolio.project_1.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
