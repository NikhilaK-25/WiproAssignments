package com.nikhila.quizappmonorepo.exception;

@SuppressWarnings("serial")
public class QuestionNotFoundException extends RuntimeException {
    public QuestionNotFoundException(String string) {
        super("Question with id " + string + " not found");
    }
}

