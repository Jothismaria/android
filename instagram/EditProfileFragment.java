package com.example.instagram;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.instagram.UniversalImageLoader;
import com.mikhaellopez.circularimageview.CircularImageView;
import com.nostra13.universalimageloader.core.ImageLoader;

public class EditProfileFragment extends Fragment {
    private static final String TAG = "EditProfileFragment";
    private TextView Name, mFollowers, website, Username, changeProfilePhoto, mDescription, mFollowing;
    private TextView mChangeProfilePhoto;
    private CircularImageView profilephoto;
    private Button signout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_signout);
        Log.d(TAG, "onCreate: edit fragment started");
        signout = (Button) findViewById(R.id.signout);
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signout.setText(" ");

            }
        });
    }

    private Object findViewById(int signout) {
        return signout;
    }

    private void setContentView(int activity_profile) {
    }
//  @Nullable
  //  @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_editprofile, container, false);
//
//        Name = (TextView) view.findViewById(R.id.name);
//        Username = (TextView) view.findViewById(R.id.username);
//        website = (TextView) view.findViewById(R.id.website);
//        changeProfilePhoto = (TextView) view.findViewById(R.id.changeProfilePhoto);
//        profilephoto = (CircularImageView) view.findViewById(R.id.profile_photo);
//
//        // setProfileImage();
//        //back arrow
////        ImageView backarrow = (ImageView) view.findViewById(R.id.backArrow);
////        backarrow.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                getActivity().finish();
////            }
////
////        });
////        return view;
// //   }

    private void setProfileImage() {
        Log.d(TAG, "setmProfileImage: setting profile image.");
        String imgURL = "www.instagram.com/p/Bmd0zEbBjLsWYMp2VgU73Ur2N85uhpAaUW0xQo0/";
        UniversalImageLoader.setImage(imgURL, profilephoto, null, "https://");
    }
//    private void saveProfileSettings(){
//        final String Name = Name.getText().toString();
//        final String username = Username.getText().toString();
//        final String description = mDescription.getText().toString();
    //}

}
