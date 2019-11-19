package com.ptit.rollcall.model.Entity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ptit.rollcall.R;

import java.util.ArrayList;

public class MemberAdapter extends RecyclerView.Adapter<MemberAdapter.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView idTextView;
        public TextView fnameView;
        public TextView lnameView;
        public TextView dobView;
        public TextView genderView;

        public ViewHolder(View itemView) {
            super(itemView);
            idTextView = (TextView) itemView.findViewById(R.id.mem_id);
            fnameView = (TextView) itemView.findViewById(R.id.mem_fname);
            lnameView = (TextView) itemView.findViewById(R.id.mem_lname);
            dobView = (TextView) itemView.findViewById(R.id.mem_dob);
            genderView = (TextView) itemView.findViewById(R.id.mem_gender);
        }
    }

    private ArrayList<Member> mMember;

    public MemberAdapter(ArrayList<Member> member){
        mMember = member;
    }
    @Override
    public MemberAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View classView = inflater.inflate(R.layout.member_item, parent, false);

        MemberAdapter.ViewHolder viewHolder = new MemberAdapter.ViewHolder(classView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MemberAdapter.ViewHolder viewHolder, int position) {
        Member mb = mMember.get(position);

        TextView idView = viewHolder.idTextView;
        TextView fView = viewHolder.fnameView;
        TextView lView = viewHolder.lnameView;
        TextView dobView = viewHolder.dobView;
        TextView gen = viewHolder.genderView;

        idView.setText(String.valueOf(mb.getId()));
        fView.setText(mb.getFirtName());
        lView.setText(mb.getLastName());
        dobView.setText(mb.getDateOfBirth().toString());
        if(mb.gender().equals("Male")) gen.setText("Male");
        else gen.setText("Female");
    }

    @Override
    public int getItemCount() {
        return mMember.size();
    }

}
