package com.example.questiontesting.repositories;

import com.example.questiontesting.entity.Level;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelRepository extends JpaRepository<Level, Long> {
}
