package com.surya.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.surya.example.entities.School;

import java.util.List;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

   
    

    
    List<School> findBySchoolAdress(String address);

    
    List<School> findBySchoolNameContainingIgnoreCase(String name);
}
