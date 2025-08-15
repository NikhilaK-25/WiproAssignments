package com.nk.wipro.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "BloodGroup is required")
    private String bloodGroup;

    @NotBlank(message = "City is required")
    private String city;

   
    @Min(value = 18, message = "Age must be at least 18")
    private int age;

    @Email(message = "Invalid email format")
    private String email;
    
    @NotBlank(message = "Gender is required")
    private String gender;
    
    

    
}
