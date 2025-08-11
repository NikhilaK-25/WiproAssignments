package com.nikhila.quizappmonorepo.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nikhila.quizappmonorepo.entities.Question;
import com.nikhila.quizappmonorepo.services.QuestionServices;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@Slf4j
public class QuestionController {

    @Autowired
    private QuestionServices quizServices;

    @PostMapping("/addQuestion")
    public Question addQuestion(@Valid @RequestBody Question question) {
        return quizServices.addQuestion(question);
    }

    @GetMapping("/getQuestions")
    public List<Question> getAllQuestions() {
        return quizServices.getAllQuestions();
    }

    @GetMapping("/getQuestionById/{id}")
    public Question getQuestionById(@PathVariable Long id) {
        return quizServices.getQuestionById(id);
    }

    @PatchMapping("/updateQuestion/{id}")
    public Question updateQuestion(@PathVariable Long id, @RequestBody Question question) {
        return quizServices.updateQuestion(id, question);
    }

    @DeleteMapping("/deleteQuestion/{id}")
    public String deleteQuestion(@PathVariable Long id) {
        return quizServices.deleteQuestion(id);
    }
}
