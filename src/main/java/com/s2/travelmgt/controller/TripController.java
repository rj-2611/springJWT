package com.s2.travelmgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.s2.travelmgt.model.TripDetails;
import com.s2.travelmgt.repository.TripInfoRepo;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/trips")
public class TripController {
	
	@Autowired
    TripInfoRepo tripInfoRepo;
	
	@GetMapping(path = "/getTripInfo")
    @ResponseBody
    public List<TripDetails> getEventInfo() {
        List<TripDetails> tripInfo = (List<TripDetails>) tripInfoRepo.findAll();
        return tripInfo;
    }
}

