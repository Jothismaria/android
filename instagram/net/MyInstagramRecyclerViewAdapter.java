package com.example.instagram.net;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;
import com.example.instagram.model.Counts;

import java.util.List;

public class MyInstagramRecyclerViewAdapter extends RecyclerView.Adapter<MyInstagramRecyclerViewAdapter.ViewHolder> {

    private final List<Counts> mValues;

    public MyInstagramRecyclerViewAdapter(List<Counts> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_profile, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Counts model = mValues.get(position);
        holder.mpost.setText(model.getMedia());
        holder.mtxtfollowing.setText(model.getFollows());
        holder.mtxtfollower.setText(model.getFollowedBy());

    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mpost;
        public final TextView mtxtpost;
        public final TextView mtvfollower;
        public final TextView mtxtfollower;
        public final TextView mtvfollowing;
        public final TextView mtxtfollowing;
        public final TextView meditprofile;

        public Counts mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mpost = (TextView) view.findViewById(R.id.tvPost);
            mtxtpost = (TextView) view.findViewById(R.id.textPost);
            mtvfollower = (TextView) view.findViewById(R.id.tvFollower);
            mtxtfollower = (TextView) view.findViewById(R.id.textFollowers);
            mtvfollowing = (TextView) view.findViewById(R.id.tvFollowing);
            mtxtfollowing = (TextView) view.findViewById(R.id.textFollowing);
            meditprofile = (TextView) view.findViewById(R.id.textEditProfile);





        }
    }
}
