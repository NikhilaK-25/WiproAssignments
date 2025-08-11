package com.surya.example.service;

import com.surya.example.entities.School;
import java.util.List;

public interface SchoolService {
    School addSchool(School school);
    List<School> getAllSchools();
    School updateSchool(Long id, School updated);
    School patchSchoolName(Long id, String name);
    void deleteSchool(Long id);
    List<School> findSchoolsByName(String name);
}
