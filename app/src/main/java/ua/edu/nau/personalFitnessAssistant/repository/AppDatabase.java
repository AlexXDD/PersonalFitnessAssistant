package ua.edu.nau.personalFitnessAssistant.repository;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.Executors;

import ua.edu.nau.personalFitnessAssistant.model.Exercise;
import ua.edu.nau.personalFitnessAssistant.model.ExerciseDescription;
import ua.edu.nau.personalFitnessAssistant.model.ExerciseGroup;
import ua.edu.nau.personalFitnessAssistant.model.Set;
import ua.edu.nau.personalFitnessAssistant.model.Training;
import ua.edu.nau.personalFitnessAssistant.model.UserParameters;
import ua.edu.nau.personalFitnessAssistant.model.WorkoutDay;
import ua.edu.nau.personalFitnessAssistant.model.WorkoutPlan;
import ua.edu.nau.personalFitnessAssistant.repository.dao.ExerciseDao;
import ua.edu.nau.personalFitnessAssistant.repository.dao.ExerciseDescriptionDao;
import ua.edu.nau.personalFitnessAssistant.repository.dao.ExerciseGroupDao;
import ua.edu.nau.personalFitnessAssistant.repository.dao.SetDao;
import ua.edu.nau.personalFitnessAssistant.repository.dao.TrainingDao;
import ua.edu.nau.personalFitnessAssistant.repository.dao.UserParametersDao;
import ua.edu.nau.personalFitnessAssistant.repository.dao.WorkoutDayDao;
import ua.edu.nau.personalFitnessAssistant.repository.dao.WorkoutPlanDao;

@Database(entities = {
        UserParameters.class,
        Exercise.class,
        ExerciseGroup.class,
        ExerciseDescription.class,
        Set.class, Training.class,
        WorkoutDay.class,
        WorkoutPlan.class
}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE;

    public abstract UserParametersDao userParametersDao();

    public abstract ExerciseDao exerciseDao();

    public abstract ExerciseGroupDao exerciseGroupDao();

    public abstract ExerciseDescriptionDao exerciseDescriptionDao();

    public abstract SetDao setDao();

    public abstract TrainingDao trainingDao();

    public abstract WorkoutDayDao workoutDayDao();

    public abstract WorkoutPlanDao workoutPlanDao();

    public synchronized static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = buildDatabase(context);
        }
        return INSTANCE;
    }

    private static AppDatabase buildDatabase(final Context context) {
        return Room.databaseBuilder(context,
                AppDatabase.class,
                "assistant-database")
                .addCallback(new Callback() {
                    @Override
                    public void onCreate(@NonNull final SupportSQLiteDatabase db) {
                        super.onCreate(db);
                        Executors.newSingleThreadScheduledExecutor().execute(new Runnable() {
                            @Override
                            public void run() {
                                //TODO pre-populate DB with data
                            }
                        });
                    }
                })
                .build();
    }
}
