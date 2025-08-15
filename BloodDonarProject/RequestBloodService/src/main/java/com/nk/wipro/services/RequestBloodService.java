package com.nk.wipro.services;

import com.nk.wipro.entity.Blood;
import com.nk.wipro.entity.RequestBlood;
import java.util.List;

public interface RequestBloodService {
    RequestBlood addRequest(RequestBlood requestBlood);
    List<RequestBlood> getAllRequests();
    RequestBlood getRequestStatus(Long id);
	List<Blood> getAllBloodFromOtherService();
}
