package ua.edu.nau.PersonalFitnesAssistant.ui.main;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import ua.edu.nau.PersonalFitnesAssistant.R;

public class MainActivity extends AppCompatActivity implements TrainingFragment.OnFragmentInteractionListener, ExercisesFragment.OnFragmentInteractionListener, ProgressFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialization of tab view
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    //Method for adding new workout day to current workout plan
    public void onAddNewWorkoutDayButtonClick(View view) {

    }
}