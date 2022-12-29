package com.workout.workoutApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workout.workoutApp.entity.DayEntity;
import com.workout.workoutApp.repository.DayMongoRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DayServiceImpl implements DayService {

	@Autowired
	private DayMongoRepo dayMongoRepo;
	
	@Override
	public List<DayEntity> getAllDays() {
		
		return dayMongoRepo.findAll();
	}

	@Override
	public DayEntity getDay(String id) {
		Optional<DayEntity> optional = dayMongoRepo.findById(id);
		DayEntity dayEntity = null;
		if(optional.isPresent()) {
			dayEntity = optional.get();
		}
		return dayEntity;
	}

	@Override
	public DayEntity addDay(DayEntity dayEntity) {
		
		return dayMongoRepo.insert(dayEntity);
	}

	@Override
	public DayEntity editDay(DayEntity dayEntity) {
		
		return dayMongoRepo.save(dayEntity);
	}

	@Override
	public void deleteDay(DayEntity dayEntity) {
		
		dayMongoRepo.delete(dayEntity);
	}

}
