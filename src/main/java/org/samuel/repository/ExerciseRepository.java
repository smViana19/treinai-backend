package org.samuel.repository;

import org.samuel.model.Exercise;

import java.util.List;

public interface ExerciseRepository {

  void insertExercise(Exercise exercise);

  List<Exercise> getAllExercises();

  Exercise getExerciseById(int id);

  void deleteExercise(int id);
}
