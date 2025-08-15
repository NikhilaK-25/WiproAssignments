package com.nk.wipro.services;

import com.nk.wipro.Feign.RequestBloodServiceFeign;
import com.nk.wipro.entity.Blood;
import com.nk.wipro.entity.RequestBlood;
import com.nk.wipro.enums.RequestStatus;
import com.nk.wipro.exception.RequestNotFoundException;
import com.nk.wipro.repo.RequestBloodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestBloodServiceImpl implements RequestBloodService {

    private final RequestBloodRepository requestBloodRepository;
    private final RequestBloodServiceFeign requestBloodServiceFeign;

    @Override
    public RequestBlood addRequest(RequestBlood requestBlood) {
        requestBlood.setStatus(RequestStatus.PENDING);
        return requestBloodRepository.save(requestBlood);
    }

    @Override
    public List<RequestBlood> getAllRequests() {
        return requestBloodRepository.findAll();
    }

    @Override
    public RequestBlood getRequestStatus(Long id) {
        return requestBloodRepository.findById(id)
                .orElseThrow(() -> new RequestNotFoundException("Request with ID " + id + " not found"));
    }
    public List<Blood> getAllBloodFromOtherService() {
        return requestBloodServiceFeign.getAllBlood();
    }
}
