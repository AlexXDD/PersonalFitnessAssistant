package ua.edu.nau.PersonalFitnesAssistant;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import ua.edu.nau.PersonalFitnesAssistant.dao.ExerciseDao;
import ua.edu.nau.PersonalFitnesAssistant.dao.ExerciseGroupDao;
import ua.edu.nau.PersonalFitnesAssistant.dao.SetDao;
import ua.edu.nau.PersonalFitnesAssistant.dao.TrainingDao;
import ua.edu.nau.PersonalFitnesAssistant.dao.UserDao;
import ua.edu.nau.PersonalFitnesAssistant.dao.WorkoutDayDao;
import ua.edu.nau.PersonalFitnesAssistant.dao.WorkoutPlanDao;
import ua.edu.nau.PersonalFitnesAssistant.model.Exercise;
import ua.edu.nau.PersonalFitnesAssistant.model.ExerciseGroup;
import ua.edu.nau.PersonalFitnesAssistant.model.Set;
import ua.edu.nau.PersonalFitnesAssistant.model.Training;
import ua.edu.nau.PersonalFitnesAssistant.model.User;
import ua.edu.nau.PersonalFitnesAssistant.model.WorkoutDay;
import ua.edu.nau.PersonalFitnesAssistant.model.WorkoutPlan;

@Database(entities = {
        User.class,
        Exercise.class,
        ExerciseGroup.class,
        Set.class, Training.class,
        WorkoutDay.class,
        WorkoutPlan.class
}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();

    public abstract ExerciseDao exerciseDao();

    public abstract ExerciseGroupDao exerciseGroupDao();

    public abstract SetDao SetDao();

    public abstract TrainingDao trainingDao();

    public abstract WorkoutDayDao workoutDayDao();

    public abstract WorkoutPlanDao workoutPlanDao();
}
