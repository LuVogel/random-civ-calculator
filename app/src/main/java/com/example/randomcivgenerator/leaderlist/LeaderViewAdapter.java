package com.example.randomcivgenerator.leaderlist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.randomcivgenerator.R;
import com.example.randomcivgenerator.logic.activities.InfoActivity;

import java.util.ArrayList;

/**
 * Custom Adapter for our Leader Activity. Handles where to get image and name of Leader
 */
public class LeaderViewAdapter extends ArrayAdapter<LeaderView> {



    public LeaderViewAdapter(@NonNull Context context, ArrayList<LeaderView> arrayList) {
        super(context, 0, arrayList);
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentItemView = convertView;

        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_leader_view, parent, false);
        }

        LeaderView currentLeaderPosition = getItem(position);

        ImageView leaderImage = currentItemView.findViewById(R.id.leaderImage_view);
        assert currentLeaderPosition != null;
        leaderImage.setImageResource(currentLeaderPosition.getImageId());

        TextView leaderTextView = currentItemView.findViewById(R.id.leader_names);
        leaderTextView.setText(currentLeaderPosition.getLeaderName());
        ImageButton infoBox = currentItemView.findViewById(R.id.info_text_button);

        CheckBox checkBox = currentItemView.findViewById(R.id.leaderView_checkbox);
        checkBox.setChecked(false);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) {
                    currentLeaderPosition.setDeleteHint('o');
                } else {
                    currentLeaderPosition.setDeleteHint('x');
                }



            }
        });

        infoBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), InfoActivity.class);
                intent.putExtra("leader_info", currentLeaderPosition);
                v.getContext().startActivity(intent);

            }
        });




        return currentItemView;
    }





}
