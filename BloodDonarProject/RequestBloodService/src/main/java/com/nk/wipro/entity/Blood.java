package com.nk.wipro.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Blood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Blood group is required")
    private String bloodGroup;

    @NotNull(message = "Quantity is required")
    @Min(value = 1, message = "Quantity must be at least 1 unit")
    private Integer quantity;

    @NotBlank(message = "Status is required")
    private String status;  
}
