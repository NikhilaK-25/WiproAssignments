package com.nikhila.quizappmonorepo.services;

import com.nikhila.quizappmonorepo.entities.Quiz;

import java.util.List;

public interface QuizService {
    Quiz createQuiz(Quiz quiz);
    List<Quiz> getAllQuizzes();
    Quiz getQuizById(Long id);
    Quiz updateQuiz(Long id, Quiz updatedQuiz);
    void deleteQuiz(Long id);
	int calculateScore(Long id, List<Long> selectedOptionIds);
}
