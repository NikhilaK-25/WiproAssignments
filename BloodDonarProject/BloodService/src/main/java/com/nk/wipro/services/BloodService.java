package com.nk.wipro.services;

import com.nk.wipro.entity.Blood;
import com.nk.wipro.entity.Donor;
import com.nk.wipro.exception.BloodNotFoundException;

import java.util.List;

public interface BloodService {
    
    Blood addBloodGroup(Blood blood);
    
    List<Blood> getBloodGroups();
    
    Blood getBloodById(Long id);
    Blood updateBloodStatus(Long id, String status) throws BloodNotFoundException;

	List<Donor> getDonorsByBloodGroup(String bloodGroup);
}
