package org.samuel.controller;

import org.samuel.model.Exercise;
import org.samuel.service.ExerciseService;

import java.util.List;

public class ExerciseController {

  private ExerciseService service;

  public ExerciseController(ExerciseService service) {
    this.service = service;
  }

  public void insertExercises(Exercise exercise) {
    service.insertExercise(exercise);
  }

  public List<Exercise> getAllExercises() {
    return service.getAllExercises();
  }

  public Exercise getExerciseById(int id) {
    return service.getExerciseById(id);
  }

  public void deleteExercise(int id) {
    service.deleteExercise(id);
  }
}
