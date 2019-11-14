package com.example.instagram;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.model.Data;
import com.example.instagram.model.Example;
import com.example.instagram.model.InstaUser;
import com.example.instagram.model.MediaRecent;
import com.example.instagram.net.InstagramRecyclerViewAdapter;
import com.example.instagram.net.InstagramService;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static androidx.constraintlayout.widget.Constraints.TAG;


public class ProfileFragment extends Fragment {
    private TextView mPosts,mFollowers,mDisplayName,mUsername,mDescription,mFollowing,website,tvPost,FullName,counts;
    private ProgressBar mProgressBar;
    private  CircularImageView mProfilePhoto;
    private Toolbar toolbar;
    //private ImageView profileMenu;
    private Object BottomNavigationView;
    private Context mContext;
    List<Data> dataList;
    InstaUser profileInfo;
    MediaRecent postInfo;

    Example example;
    private LayoutInflater inflater;
    private ViewGroup container;
    private Bundle savedInstanceState;
    RecyclerView recyclerView;
    InstagramRecyclerViewAdapter instagramRecyclerViewAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        mDisplayName = (TextView) view.findViewById(R.id.display_name);
        FullName =(TextView)view.findViewById(R.id.fullname);
        mUsername = (TextView) view.findViewById(R.id.username);
        mDescription = (TextView) view.findViewById(R.id.description);
        mProfilePhoto = (CircularImageView) view.findViewById(R.id.profile_photo);
        mPosts = (TextView) view.findViewById(R.id.tvPost);
        mFollowers = (TextView) view.findViewById(R.id.tvFollower);
        mFollowing = (TextView) view.findViewById(R.id.tvFollowing);
        mProgressBar = (ProgressBar) view.findViewById(R.id.profileProgressBar);
        toolbar = (Toolbar) view.findViewById(R.id.profilToolBar);
//        website = (TextView) view.findViewById(R.id.)
        tvPost = (TextView) view.findViewById(R.id.tvPost);
      //  counts = (TextView) view.findViewById()


        recyclerView =  view.findViewById(R.id.rv);
        dataList = new ArrayList<>();
        instagramRecyclerViewAdapter = new InstagramRecyclerViewAdapter(mContext,dataList);




      // profileMenu = (ImageView) view.findViewById(R.id.profileMenu);
        BottomNavigationView = view.findViewById(R.id.bottom_navigation);
        mContext = getActivity();
        Log.d(TAG, "onCreateView: started");
        // setupToolbar();
         TextView editProfile = (TextView) view.findViewById(R.id.textEditProfile);
         editProfile.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Log.d(TAG, "onClick: navigating to "+ mContext.getString(R.string.edit_profile_fragment));
                 Intent intent = new Intent(getActivity(),AccountSettingsActivity.class);
                 intent.putExtra(getString(R.string.calling_activity),getString(R.string.profile_activity));
                 startActivity(intent);
             }
         });

         getSelfProfile();
         getSelfPost();
        return view;
    }

    private void getSelfProfile() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.instagram.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        InstagramService service = retrofit.create(InstagramService.class);
        String accessToken = "3882118403.db5d51b.fc5c171b241442589d326259d36b9a4c";
        Call<InstaUser> self = service.getSelf(accessToken);
        self.enqueue(new Callback<InstaUser>() {
            @Override
            public void onResponse(Call<InstaUser> call, Response<InstaUser> response) {
//                dataList = example.getDataList();
                Log.d("Tag", "onResponse: "+response.body());
                profileInfo = response.body();
                initView();
                Toast.makeText(mContext, "Success", Toast.LENGTH_SHORT).show();
//                instagramRecyclerViewAdapter = new InstagramRecyclerViewAdapter(mContext,dataList);
//                RecyclerView.LayoutManager layoutManager = new GridLayoutManager(mContext,3,GridLayoutManager.VERTICAL,false);
//                recyclerView.setLayoutManager(layoutManager);
//                recyclerView.setAdapter(instagramRecyclerViewAdapter);

            }

                         @Override
                         public void onFailure(Call<InstaUser> call, Throwable t) {

                         }


                         private void getSelfPost() {
                             Retrofit retrofit = new Retrofit.Builder()
                                     .baseUrl("https://api.instagram.com")
                                     .addConverterFactory(GsonConverterFactory.create())
                                     .build();
                             InstagramService service = retrofit.create(InstagramService.class);
                             String accessToken = "3882118403.db5d51b.fc5c171b241442589d326259d36b9a4c";
                             Call<MediaRecent> self = service.getRecentMedia(accessToken);
                             self.enqueue(new Callback<MediaRecent>() {
                                 @Override
                                 public void onResponse(Call<MediaRecent> call, Response<MediaRecent> response) {
//                dataList = example.getDataList();
                                     Log.d("Tag", "onResponse: "+response.body());
                                     postInfo = response.body();
                                     postView();
                                     Toast.makeText(mContext, "Success", Toast.LENGTH_SHORT).show();
//                instagramRecyclerViewAdapter = new InstagramRecyclerViewAdapter(mContext,dataList);
//                RecyclerView.LayoutManager layoutManager = new GridLayoutManager(mContext,3,GridLayoutManager.VERTICAL,false);
//                recyclerView.setLayoutManager(layoutManager);
//                recyclerView.setAdapter(instagramRecyclerViewAdapter);

                                 }



                                 @Override
            public void onFailure(Call<InstaUser> call, Throwable t) {
                Toast.makeText(getActivity(), "network failure", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initView() {
        mUsername.setText(profileInfo.getData().getUsername());
     // mDisplayName.setText((CharSequence)profileInfo.getData().get());
        FullName.setText (profileInfo.getData().getFullName());
       mDescription.setText((CharSequence) profileInfo.getData().getData());//ison

        mFollowers.setText((CharSequence)profileInfo.getData().getData());
        mPosts.setText((CharSequence) profileInfo.getData().getData());
        mFollowing.setText((CharSequence) profileInfo.getData().getData());
        tvPost.setText((CharSequence) profileInfo.getData().getData());
    }


//private void setupToolbar() {
  //  ((ProfileActivity) getActivity()).setSupportActionBar(toolbar);
    //profileMenu.setOnClickListener((new View.OnClickListener(){
//   @Override
  //         public void onClick(View v) {

    //   Log.d(TAG, "onClick: navigating to account settings.");
      // Intent intent = new Intent(mContext, AccountSettingsActivity.class);
       //startActivity(intent);
   //}

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }
    //});
//}

    @Override
    public void onStart() {
        super.onStart();
        //mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        //if(mAuthListener != null)
        //{
        //mAuth.removeAuthStateListener(mAuthListener);
    }
    }
//}
