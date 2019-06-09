package ua.edu.nau.PersonalFitnesAssistant.ui.main;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import ua.edu.nau.PersonalFitnesAssistant.R;
import ua.edu.nau.PersonalFitnesAssistant.adapters.WorkoutDayArrayAdapter;
import ua.edu.nau.PersonalFitnesAssistant.model.WorkoutDay;
import ua.edu.nau.PersonalFitnesAssistant.model.WorkoutPlan;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TrainingFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TrainingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TrainingFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private static WorkoutDayArrayAdapter adapter;

    private OnFragmentInteractionListener mListener;
    private Context mContext;
    private ListView listView;
    private WorkoutPlan workoutPlan;
    private ArrayList<WorkoutDay> workoutDays;

    public TrainingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment TrainingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TrainingFragment newInstance() {
        TrainingFragment fragment = new TrainingFragment();
        Bundle args = new Bundle();
        //args.putString(ARG_PARAM1, param1);
        //args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
        if (getActivity() != null)
            mContext = getActivity().getApplicationContext();

        //Creating stub data for debug
        workoutPlan = new WorkoutPlan(1L, "Bulking");

        workoutDays = new ArrayList<>();
        workoutDays.add(new WorkoutDay(1L, "Chest, Arms", 120, 1));
        workoutDays.add(new WorkoutDay(1L, "Legs, Back", 120, 2));
        workoutDays.add(new WorkoutDay(1L, "Shoulders, Core", 120, 3));


    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_training, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        listView = view.findViewById(R.id.listView_workout_days);
        adapter = new WorkoutDayArrayAdapter(mContext, workoutDays);
        listView.setAdapter(adapter);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android TrainingFragment lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
