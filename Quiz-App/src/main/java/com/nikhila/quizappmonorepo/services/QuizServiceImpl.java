package com.nikhila.quizappmonorepo.services;

import com.nikhila.quizappmonorepo.entities.Quiz;
import com.nikhila.quizappmonorepo.exception.QuizNotFoundException;
import com.nikhila.quizappmonorepo.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Override
    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz getQuizById(Long id) {
        return quizRepository.findById(id)
                .orElseThrow(() -> new QuizNotFoundException(id));
    }

    @Override
    public Quiz updateQuiz(Long id, Quiz updatedQuiz) {
        Quiz existing = getQuizById(id);

        existing.setQuizTitle(updatedQuiz.getQuizTitle());
        existing.setCategory(updatedQuiz.getCategory());
        existing.setDifficultyLevel(updatedQuiz.getDifficultyLevel());

        if (updatedQuiz.getQuestions() != null) {
            existing.getQuestions().clear();
            existing.getQuestions().addAll(updatedQuiz.getQuestions());
        }

        return quizRepository.save(existing);
    }

    @Override
    public void deleteQuiz(Long id) {
        Quiz quiz = getQuizById(id);
        quizRepository.delete(quiz);
    }

	@Override
	public int calculateScore(Long id, List<Long> selectedOptionIds) {
		// TODO Auto-generated method stub
		return 0;
	}
}
