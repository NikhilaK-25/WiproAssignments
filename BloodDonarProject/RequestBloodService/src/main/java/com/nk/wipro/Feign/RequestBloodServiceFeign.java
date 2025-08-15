package com.nk.wipro.Feign;

import com.nk.wipro.entity.Blood;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;




@FeignClient(name = "BloodService", path = "/api/v1/blood")
public interface RequestBloodServiceFeign {

	@GetMapping("/all")
	public List<Blood> getAllBlood() ;


    @GetMapping("/id/{id}")
    Blood getBloodById(@PathVariable("id") Long id);

    
}
