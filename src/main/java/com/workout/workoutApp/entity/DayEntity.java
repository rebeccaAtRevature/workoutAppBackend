package com.workout.workoutApp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "workoutInfo")
public class DayEntity {
	
	@Id
	private String id;
	private String date;
	private String morningWorkout;
	private String afternoonWorkout;
	private String breakfast;
	private String lunch;
	private String dinner;
	private String beverage;

}
