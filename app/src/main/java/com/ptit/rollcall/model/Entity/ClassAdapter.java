package com.ptit.rollcall.model.Entity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ptit.rollcall.R;

import java.util.ArrayList;

public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.ViewHolder>{
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;
        public TextView idTextView;
        public TextView tStartView;
        public TextView tEndView;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.class_name);
            idTextView = (TextView) itemView.findViewById(R.id.class_id);
            tStartView = (TextView) itemView.findViewById(R.id.class_tStart);
            tEndView = (TextView) itemView.findViewById(R.id.class_tEnd);
        }
    }

    private ArrayList<Classs> mClass;

    public ClassAdapter(ArrayList<Classs> _class){
        mClass = _class;
    }
    @Override
    public ClassAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View classView = inflater.inflate(R.layout.class_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(classView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ClassAdapter.ViewHolder viewHolder, int position) {
        Classs cl = mClass.get(position);

        TextView nView = viewHolder.nameTextView;
        TextView idView = viewHolder.idTextView;
        TextView tSView = viewHolder.tStartView;
        TextView tEView = viewHolder.tEndView;

        idView.setText(String.valueOf(cl.getId()));
        nView.setText(cl.getName());
        tSView.setText(cl.getTimeStart().toString());
        tEView.setText(cl.getTimeEnd().toString());

    }

    @Override
    public int getItemCount() {
        return mClass.size();
    }

}
