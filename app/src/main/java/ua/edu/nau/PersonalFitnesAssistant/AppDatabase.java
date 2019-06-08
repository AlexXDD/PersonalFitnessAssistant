package ua.edu.nau.PersonalFitnesAssistant;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import ua.edu.nau.PersonalFitnesAssistant.dao.ExerciseDao;
import ua.edu.nau.PersonalFitnesAssistant.dao.ExerciseGroupDao;
import ua.edu.nau.PersonalFitnesAssistant.dao.SetDao;
import ua.edu.nau.PersonalFitnesAssistant.dao.TrainingDao;
import ua.edu.nau.PersonalFitnesAssistant.dao.UserParametersDao;
import ua.edu.nau.PersonalFitnesAssistant.dao.WorkoutDayDao;
import ua.edu.nau.PersonalFitnesAssistant.dao.WorkoutPlanDao;
import ua.edu.nau.PersonalFitnesAssistant.model.Exercise;
import ua.edu.nau.PersonalFitnesAssistant.model.ExerciseGroup;
import ua.edu.nau.PersonalFitnesAssistant.model.Set;
import ua.edu.nau.PersonalFitnesAssistant.model.Training;
import ua.edu.nau.PersonalFitnesAssistant.model.UserParameters;
import ua.edu.nau.PersonalFitnesAssistant.model.WorkoutDay;
import ua.edu.nau.PersonalFitnesAssistant.model.WorkoutPlan;

@Database(entities = {
        UserParameters.class,
        Exercise.class,
        ExerciseGroup.class,
        Set.class, Training.class,
        WorkoutDay.class,
        WorkoutPlan.class
}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserParametersDao userParametersDao();

    public abstract ExerciseDao exerciseDao();

    public abstract ExerciseGroupDao exerciseGroupDao();

    public abstract SetDao setDao();

    public abstract TrainingDao trainingDao();

    public abstract WorkoutDayDao workoutDayDao();

    public abstract WorkoutPlanDao workoutPlanDao();
}
