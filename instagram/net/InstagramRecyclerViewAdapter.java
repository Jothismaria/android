package com.example.instagram.net;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;
import com.example.instagram.model.Data;
import com.squareup.picasso.Picasso;

import java.util.List;
// Create the basic adapter extending from RecyclerView.Adapter
// Note that we specify the custom ViewHolder which gives us access to our views
public class InstagramRecyclerViewAdapter extends RecyclerView.Adapter<InstagramRecyclerViewAdapter.ViewHolder> {

    Context mcontext;

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    private List<Data> mValues;
    // Pass in the InstagramRecyclerViewAdapter array into the constructor
    public InstagramRecyclerViewAdapter(Context context,List<Data> items) {
        mcontext=context;
        mValues = items;
    }


    @Override
    public InstagramRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_data, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InstagramRecyclerViewAdapter.ViewHolder holder, int position) {
          Data model = mValues.get(position);
//        holder.mpost.setText(model.getUsername());
//        holder.mtxtfollowing.setText(model.getProfilePicture());
//        holder.mtxtfollower.setText(model.getFullName());
        Picasso.with(mcontext).load(model.getProfilePicture()).into(holder.iv_profile);

        Log.d("Result", "ProfilePicture: "+model.getProfilePicture());




    }

    @Override
    public int getItemCount() {
        return mValues != null ? mValues.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public  View mView;
        ImageView iv_profile;
        public  TextView mpost;
        public  TextView mtxtpost;//wasfinalall
        public  TextView mtvfollower;
        public  TextView mtxtfollower;
        public  TextView mtvfollowing;
        public  TextView mtxtfollowing;
        public  TextView meditprofile;
        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View view)
        // Stores the View in a public final member variable that can be used
        // to access the context from any ViewHolder instance.
        {
            super(view);
            mView = view;

            mpost = (TextView) view.findViewById(R.id.tvPost);
            iv_profile =  view.findViewById(R.id.pimage);
            mtxtpost = (TextView) view.findViewById(R.id.textPost);
            mtvfollower = (TextView) view.findViewById(R.id.tvFollower);
            mtxtfollower = (TextView) view.findViewById(R.id.textFollowers);
            mtvfollowing = (TextView) view.findViewById(R.id.tvFollowing);
            mtxtfollowing = (TextView) view.findViewById(R.id.textFollowing);
            meditprofile = (TextView) view.findViewById(R.id.textEditProfile);

        }

    }
}
