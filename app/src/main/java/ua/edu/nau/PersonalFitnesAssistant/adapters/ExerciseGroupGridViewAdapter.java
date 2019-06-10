package ua.edu.nau.PersonalFitnesAssistant.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import ua.edu.nau.PersonalFitnesAssistant.R;
import ua.edu.nau.PersonalFitnesAssistant.model.ExerciseGroup;

public class ExerciseGroupGridViewAdapter extends ArrayAdapter<ExerciseGroup> {

    Context mContext;
    private List<ExerciseGroup> dataSet;

    public ExerciseGroupGridViewAdapter(@NonNull Context context, @NonNull List<ExerciseGroup> objects) {
        super(context, R.layout.exercise_group_grid_item, objects);
        mContext = context;
        dataSet = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ExerciseGroup exerciseGroup = getItem(position);
        ExerciseGroupGridViewAdapter.ViewHolder viewHolder;

        final View result;

        if (convertView == null) {
            viewHolder = new ExerciseGroupGridViewAdapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.exercise_group_grid_item, parent, false);

            viewHolder.txtGroupName = (TextView) convertView.findViewById(R.id.txtExerciseGroup);
            viewHolder.imgGroupIcon = (ImageView) convertView.findViewById(R.id.imgExerciseGroup);

            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ExerciseGroupGridViewAdapter.ViewHolder) convertView.getTag();
            result = convertView;
        }

        if (exerciseGroup != null) {
            viewHolder.txtGroupName.setText(exerciseGroup.getName());
            viewHolder.imgGroupIcon.setImageResource(exerciseGroup.getImageResourceId());
        }
        return result;
    }


    // View lookup cache
    private static class ViewHolder {
        TextView txtGroupName;
        ImageView imgGroupIcon;
    }
}
