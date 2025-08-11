package com.nikhila.quizappmonorepo.services;

import com.nikhila.quizappmonorepo.entities.Question;

import java.util.List;
import java.util.Map;

public interface QuestionServices {
    Question addQuestion(Question question);
    List<Question> getAllQuestions();
    Question getQuestionById(Long id);
    Question updateQuestion(Long id, Question updatedQuestion);
    String deleteQuestion(Long id);
    int calculateScore(Map<Long, String> userAnswers);
}
