package com.nikhila.quizappmonorepo.services;

import com.nikhila.quizappmonorepo.entities.Question;
import com.nikhila.quizappmonorepo.exception.QuestionNotFoundException;
import com.nikhila.quizappmonorepo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QuestionServiceImpl implements QuestionServices {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestionById(Long id) {
        return questionRepository.findById(id)
                .orElseThrow(() -> new QuestionNotFoundException("Question not found with ID: " + id));
    }

    @Override
    public Question updateQuestion(Long id, Question updatedQuestion) {
        Question existing = getQuestionById(id);

        existing.setQuestionTitle(updatedQuestion.getQuestionTitle());
        existing.setOption1(updatedQuestion.getOption1());
        existing.setOption2(updatedQuestion.getOption2());
        existing.setOption3(updatedQuestion.getOption3());
        existing.setOption4(updatedQuestion.getOption4());
        existing.setCorrectAnswer(updatedQuestion.getCorrectAnswer());
        existing.setDifficultyLevel(updatedQuestion.getDifficultyLevel());
        existing.setCategory(updatedQuestion.getCategory());

        return questionRepository.save(existing);
    }

    @Override
    public String deleteQuestion(Long id) {
        Question question = getQuestionById(id);
        questionRepository.delete(question);
        return "Question deleted with ID: " + id;
    }

    @Override
    public int calculateScore(Map<Long, String> userAnswers) {
        int score = 0;
        for (Map.Entry<Long, String> entry : userAnswers.entrySet()) {
            Question question = getQuestionById(entry.getKey());
            if (question.getCorrectAnswer().equalsIgnoreCase(entry.getValue())) {
                score++;
            }
        }
        return score;
    }
}
