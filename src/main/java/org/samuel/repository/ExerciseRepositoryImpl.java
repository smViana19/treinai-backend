package org.samuel.repository;

import org.samuel.model.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ExerciseRepositoryImpl implements ExerciseRepository {

  private List<Exercise> exercises = new ArrayList<>();

  @Override
  public void insertExercise(Exercise exercise) {
    exercises.add(exercise);
  }

  @Override
  public List<Exercise> getAllExercises() {
    return exercises;
  }

  /* Esse filtro de id funcionaria tanto usando o metodo .stream ou o foreach
   * Ambos resultados vao dar filtrar pelo id, Se o id do exercício for igual ao id passado como argumento, o exercício é retornado
   *
   */

  @Override
  public Exercise getExerciseById(int id) {
    //usando stream
    //return exercises.stream().filter(exercise -> exercise.getId() == id).findFirst().orElse(null);
    //usando um foreach
//    for (Exercise exercise : exercises) {
//      if (exercise.getId() == id) {
//        return exercise;
//      }
//    }
//    return null;
    for (int i = 0; i < exercises.size(); i++) {
      if (exercises.get(i).getId() == id) {
        return exercises.get(i);
      }
    }
    return null;
  }


  @Override
  public void deleteExercise(int id) {
    for (int i = 0; i < exercises.size(); i++) {
      if (exercises.get(i).getId() == id) {
        exercises.remove(i);
        return;
      }
    }
  }
}
