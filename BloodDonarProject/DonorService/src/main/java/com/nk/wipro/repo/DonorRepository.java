package com.nk.wipro.repo;

import com.nk.wipro.entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonorRepository extends JpaRepository<Donor, Long> {
    List<Donor> findByBloodGroup(String bloodGroup);
    List<Donor> findByCity(String city);
}
