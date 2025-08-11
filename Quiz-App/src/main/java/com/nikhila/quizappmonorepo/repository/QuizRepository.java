package com.nikhila.quizappmonorepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nikhila.quizappmonorepo.entities.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
