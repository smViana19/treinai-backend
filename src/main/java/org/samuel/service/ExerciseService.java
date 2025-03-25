package org.samuel.service;

import org.samuel.model.Exercise;
import org.samuel.repository.ExerciseRepository;

import java.util.List;

public class ExerciseService {
  private ExerciseRepository repository;

  public ExerciseService(ExerciseRepository repository) {
    this.repository = repository;
  }

  public void insertExercise(Exercise exercise) {
    repository.insertExercise(exercise);
  }

  public List<Exercise> getAllExercises() {
    return repository.getAllExercises();
  }

  public Exercise getExerciseById(int id) {
    return repository.getExerciseById(id);
  }

  public void deleteExercise(int id) {
    repository.deleteExercise(id);
  }

}
