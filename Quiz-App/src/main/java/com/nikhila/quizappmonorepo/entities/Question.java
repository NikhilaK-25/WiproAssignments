package com.nikhila.quizappmonorepo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "question_table")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Question title is required!")
    @Size(min = 5, message = "Question title must be at least 5 characters long")
    private String questionTitle;

    @NotBlank(message = "Option1 is required!")
    private String option1;

    @NotBlank(message = "Option2 is required!")
    private String option2;

    @NotBlank(message = "Option3 is required!")
    private String option3;

    @NotBlank(message = "Option4 is required!")
    private String option4;

    @NotBlank(message = "Correct answer is required!")
    private String correctAnswer;

    @NotBlank(message = "Difficulty level is required!")
    private String difficultyLevel;

    @NotBlank(message = "Category is required!")
    private String category;
    
}
