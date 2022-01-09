package com.example.test.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.NewsDetailsActivity;
import com.example.test.R;
import com.example.test.model.NewsModel;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> implements View.OnClickListener {

    Context context;
    ArrayList<NewsModel> data;

    public NewsAdapter(Context context, ArrayList<NewsModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View root = LayoutInflater.from(context).inflate(R.layout.item_news, parent, false);

        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.title.setText(data.get(position).getTitle());
        holder.category.setText(data.get(position).getCategory());

        holder.title.setBackgroundResource(data.get(position).getImag());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onClick(View v) {
        Intent i= new Intent(context, NewsDetailsActivity.class);
//        i.putExtra("news", getLayoutPosition());
        context.startActivity(i);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView category;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.tvTitle);
            category = itemView.findViewById(R.id.tvCategory);

        }
    }
}
