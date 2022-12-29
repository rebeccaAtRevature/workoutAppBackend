package com.workout.workoutApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workout.workoutApp.entity.DayEntity;
import com.workout.workoutApp.service.DayServiceImpl;

@RestController
@RequestMapping("/api")
public class DayController {

	@Autowired
	private DayServiceImpl dayServiceImpl;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<DayEntity>> fetchAllDays() {
		List<DayEntity> dayEntities = dayServiceImpl.getAllDays();
		return new ResponseEntity<List<DayEntity>> (dayEntities, HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<DayEntity> getDay(@PathVariable("id") String id) {
		DayEntity returnDayEntity = dayServiceImpl.getDay(id);
		return new ResponseEntity<DayEntity>(returnDayEntity, HttpStatus.OK);
	}
	
	@PostMapping("/addDay")
	public ResponseEntity<DayEntity> addDay(@RequestBody DayEntity dayEntity) {
		DayEntity returnDayEntity = dayServiceImpl.addDay(dayEntity);
		return new ResponseEntity<DayEntity> (returnDayEntity, HttpStatus.CREATED);
	}
	
	
}
