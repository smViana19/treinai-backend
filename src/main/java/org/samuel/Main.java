package org.samuel;

import org.samuel.controller.ExerciseController;
import org.samuel.model.Exercise;
import org.samuel.repository.ExerciseRepository;
import org.samuel.repository.ExerciseRepositoryImpl;
import org.samuel.service.ExerciseService;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    ExerciseRepository exerciseRepository = new ExerciseRepositoryImpl();

    ExerciseService exerciseService = new ExerciseService(exerciseRepository);

    ExerciseController exerciseController = new ExerciseController(exerciseService);

    Exercise newExercise = new Exercise(1, "Supino reto", "Exercicio para peito completo");
    Exercise newExercise2 = new Exercise(2, "Supino inclinado", "Exercicio para peito superior");
    exerciseController.insertExercises(newExercise);
    exerciseController.insertExercises(newExercise2);

    List<Exercise> exercises = exerciseController.getAllExercises();

    for (int i = 0; i < exercises.size(); i++) {
      Exercise exercise = exercises.get(i);
      System.out.println(exercise.getId() + " - " + exercise.getName() + " - " + exercise.getDescription());

    }

    Exercise exercise = exerciseController.getExerciseById(2);
    System.out.println(exercise.getId() + " - " + exercise.getName() + " - " + exercise.getDescription());


  }
}