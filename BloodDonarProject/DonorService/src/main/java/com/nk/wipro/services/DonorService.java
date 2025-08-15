package com.nk.wipro.services;

import com.nk.wipro.entity.Donor;
import java.util.List;

public interface DonorService {
    Donor addDonor(Donor donor);
    Donor updateDonor(Long id, Donor donor);
    List<Donor> getDonorsByBloodGroup(String bloodGroup);
    List<Donor> getDonorsByCity(String city);
    void deleteDonor(Long id);
    Donor getDonorById(Long id);
}
