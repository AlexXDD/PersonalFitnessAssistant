package ua.edu.nau.personalFitnessAssistant.ui.workoutDayExercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import ua.edu.nau.personalFitnessAssistant.R;
import ua.edu.nau.personalFitnessAssistant.ui.training.TrainingActivity;

public class WorkoutDayExercisesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_day_exercises);
    }

    public void onItemClickHandler(View view) {
        startActivity(new Intent(this, TrainingActivity.class));
    }
}
