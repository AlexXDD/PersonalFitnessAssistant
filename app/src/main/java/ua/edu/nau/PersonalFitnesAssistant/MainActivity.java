package ua.edu.nau.PersonalFitnesAssistant;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ua.edu.nau.PersonalFitnesAssistant.ui.main.ExercisesFragment;
import ua.edu.nau.PersonalFitnesAssistant.ui.main.ProgressFragment;
import ua.edu.nau.PersonalFitnesAssistant.ui.main.SectionsPagerAdapter;
import ua.edu.nau.PersonalFitnesAssistant.ui.main.TrainingFragment;

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

        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}