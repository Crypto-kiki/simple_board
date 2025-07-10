// src/main/java/com.baekki.simple_board/repository/PostRepository
package com.baekki.simple_board.repository;

import com.baekki.simple_board.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}