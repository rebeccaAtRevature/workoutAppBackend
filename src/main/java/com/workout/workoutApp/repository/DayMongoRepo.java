package com.workout.workoutApp.repository;

import com.workout.workoutApp.entity.DayEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface DayMongoRepo extends MongoRepository<DayEntity,Integer> {
	

}
