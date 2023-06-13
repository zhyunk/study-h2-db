package com.example.h2test.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @Column(name="CREATEDAT") private LocalDateTime createdAt;
    @Column(name="UPDATEDAT") private LocalDateTime updatedAt;
}
