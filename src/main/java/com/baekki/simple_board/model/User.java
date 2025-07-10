// src/main/java/com.baekki.simple_board/model/User
package com.baekki.simple_board.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 각 어노테이션이 무엇을 의미할까요?
@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 이건 무슨의미? 어떻게 사용?
    private Integer id;

    @Column(nullable = false, unique = true, length = 50)   // Column 어노테이션에 대한 옵션들 설명.
    private String username;

    @Column(nullable = false)
    private String password;
}
