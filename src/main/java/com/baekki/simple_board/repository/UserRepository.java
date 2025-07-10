// src/main/java/com.baekki.simple_board/repository/UserRepository
package com.baekki.simple_board.repository;

import com.baekki.simple_board.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
