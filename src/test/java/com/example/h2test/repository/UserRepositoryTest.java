package com.example.h2test.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void selectTest() {
        userRepository
                .findAll(
                        Sort.by(
                                Sort.Order.desc("name")
                        )
                )
                .forEach(System.out::println);
    }

}