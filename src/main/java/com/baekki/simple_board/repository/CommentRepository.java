// src/main/java/com.baekki.simple_board/repository/CommentRepository
package com.baekki.simple_board.repository;

import com.baekki.simple_board.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepository extends JpaRepository<Comment, Integer> {    // 이 코드 줄 설명해보기.

}
