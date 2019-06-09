package ua.edu.nau.PersonalFitnesAssistant.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import ua.edu.nau.PersonalFitnesAssistant.R;
import ua.edu.nau.PersonalFitnesAssistant.model.WorkoutDay;

public class WorkoutDayArrayAdapter extends ArrayAdapter<WorkoutDay> {
    Context mContext;
    private List<WorkoutDay> dataSet;

    public WorkoutDayArrayAdapter(@NonNull Context context, @NonNull List<WorkoutDay> objects) {
        super(context, R.layout.workout_days_list_item, objects);
        this.dataSet = objects;
        this.mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        WorkoutDay workoutDay = getItem(position);
        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.workout_days_list_item, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.workoutDayNameText);
            viewHolder.txtNumOfExercises = (TextView) convertView.findViewById(R.id.numOfExercisesText);
            viewHolder.txtTime = (TextView) convertView.findViewById(R.id.approximateTimeText);

            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        if (workoutDay != null) {
            viewHolder.txtName.setText(workoutDay.getName());
            viewHolder.txtNumOfExercises.setText(workoutDay.getNumOfExercises());

            String timeString = mContext.getString(R.string.approximate_time_text, workoutDay.getApproximateTime());
            viewHolder.txtTime.setText(timeString);
        }
        return result;
    }

    // View lookup cache
    private static class ViewHolder {
        TextView txtName;
        TextView txtNumOfExercises;
        TextView txtTime;
    }
}
