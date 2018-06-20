package com.example.shlokpatel.myinstagram;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    ArrayList<my_feed> arrayList=new ArrayList<>();
    Context context;

    public RecyclerViewAdapter(ArrayList<my_feed> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater lif=LayoutInflater.from(context);
        View inflatedView=lif.inflate(R.layout.feed,parent,false);
        return new MyViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        my_feed current=arrayList.get(position);
        Glide.with(context).asBitmap().load(current.getCircleImage()).into(holder.circleImageView);
        Glide.with(context).asBitmap().load(current.getMainImage()).into(holder.imageView);
        holder.textView.setText(current.getUserName());
        holder.imageButton1.setImageResource(current.getBtn1());
        holder.imageButton2.setImageResource(current.getBtn2());
        holder.imageButton3.setImageResource(current.getBtn3());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        CircleImageView circleImageView;
        TextView textView;
        ImageView imageView;
        ImageButton imageButton1,imageButton2,imageButton3;
        public MyViewHolder(View itemView) {
            super(itemView);
            circleImageView=itemView.findViewById(R.id.profile_image);
            textView=itemView.findViewById(R.id.name);
            imageView=itemView.findViewById(R.id.image);
            imageButton1=itemView.findViewById(R.id.like);
            imageButton2=itemView.findViewById(R.id.comment);
            imageButton3=itemView.findViewById(R.id.share);
        }
    }
}
