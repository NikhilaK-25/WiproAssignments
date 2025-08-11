package com.nikhila.quizappmonorepo.controller;

import com.nikhila.quizappmonorepo.entities.Quiz;
import com.nikhila.quizappmonorepo.services.QuizService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/quizzes")
@Slf4j
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz quiz) {
        return quizService.createQuiz(quiz);
    }

    @GetMapping
    public List<Quiz> getAllQuizzes() {
        return quizService.getAllQuizzes();
    }

    @GetMapping("/{id}")
    public Quiz getQuizById(@PathVariable Long id) {
        return quizService.getQuizById(id);
    }

    @PutMapping("/{id}")
    public Quiz updateQuiz(@PathVariable Long id, @RequestBody Quiz updatedQuiz) {
        return quizService.updateQuiz(id, updatedQuiz);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuiz(@PathVariable Long id) {
        quizService.deleteQuiz(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/submit")
    public int submitQuiz(@PathVariable Long id, @RequestBody Map<String, List<Long>> payload) {
        List<Long> selectedOptionIds = payload.get("selectedOptionIds");
        log.info("Quiz ID: {}", id);
        log.info("Selected Option IDs: {}", selectedOptionIds);
        return quizService.calculateScore(id, selectedOptionIds);
    }
}
