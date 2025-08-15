package com.nk.wipro.Feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import com.nk.wipro.entity.Donor;
import java.util.List;

@FeignClient(name = "DonorService", path = "/api/v1/donor")
public interface BloodServiceFeign {

	 @GetMapping("/bloodGroup/{bloodGroup}")
	    List<Donor> getDonorsByBloodGroup(@PathVariable String bloodGroup);
	 
    
    
    
}
