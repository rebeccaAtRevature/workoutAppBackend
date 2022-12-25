package com.workout.workoutApp.service;

import java.util.List;

import com.workout.workoutApp.entity.DayEntity;

public interface DayService {
	// Get all
	public List<DayEntity> getAllDays();
	// Get one
	public DayEntity getDay(String id);
	// add day
	public DayEntity addDay(DayEntity dayEntity);
	// edit one
	public DayEntity editDay(DayEntity dayEntity);
	// delete one
	public void deleteDay(DayEntity dayEntity);
}
