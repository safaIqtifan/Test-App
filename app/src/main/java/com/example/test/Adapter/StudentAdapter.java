package com.example.test.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test.R;
import com.example.test.model.Student;
import com.example.test.model.StudentData;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {

    Context context;
    ArrayList<StudentData> data;

    public StudentAdapter(Context context, ArrayList<StudentData> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return data.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View root = convertView;
        if (root == null)
            root = LayoutInflater.from(context).inflate(R.layout.list_item, null, false);

        final TextView tvId = root.findViewById(R.id.title);
        final TextView tvName = root.findViewById(R.id.subTitle);
        final ImageView tvAverage = root.findViewById(R.id.imageView);

        tvId.setText(String.valueOf(data.get(position).getId()));
        tvName.setText(data.get(position).getName());
        tvAverage.setImageResource(data.get(position).getImage());
        return root;
    }
}
