package ua.edu.nau.personalFitnessAssistant.ui.adapters;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import ua.edu.nau.personalFitnessAssistant.R;
import ua.edu.nau.personalFitnessAssistant.ui.main.ExercisesFragment;
import ua.edu.nau.personalFitnessAssistant.ui.main.ProgressFragment;
import ua.edu.nau.personalFitnessAssistant.ui.main.TrainingFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};
    private static final int TABS_COUNT = 3;
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = TrainingFragment.newInstance();
                break;
            case 1:
                fragment = ExercisesFragment.newInstance();
                break;
            case 2:
                fragment = ProgressFragment.newInstance();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return TABS_COUNT;
    }
}