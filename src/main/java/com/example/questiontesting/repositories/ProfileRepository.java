package com.example.questiontesting.repositories;

import com.example.questiontesting.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
//Пример
//    @Override
//    Optional<Profile> findById(Long aLong);
//
//    Optional<Profile> findById(Long id, String name);
}
