package com.nikhila.quizappmonorepo.exception;


@SuppressWarnings("serial")
public class QuizNotFoundException extends RuntimeException {
    public QuizNotFoundException(Long id) {
        super("Quiz not found with ID: " + id);
    }
}
