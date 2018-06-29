package com.icontech.recyclerviewstaggered;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context context;
    private ArrayList<String>images= new ArrayList<>();
    private ArrayList<String>imagenames= new ArrayList<>();

    public RecyclerViewAdapter(Context context, ArrayList<String> images, ArrayList<String> imagenames) {

        this.context = context;
        this.images = images;
        this.imagenames = imagenames;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_view,parent,false);
    ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        RequestOptions requestOptions=new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background);
        Glide.with(context)
                .load(images.get(position))
                .apply(requestOptions)
                .into(holder.imageview);

        holder.textView.setText(imagenames.get(position));
    }

    @Override
    public int getItemCount() {
        return imagenames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageview;
        TextView textView;


        public ViewHolder(View itemView) {
            super(itemView);

            imageview= itemView.findViewById(R.id.imageview);
            textView=itemView.findViewById(R.id.textview);

        }
    }
}
