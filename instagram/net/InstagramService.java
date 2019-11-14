package com.example.instagram.net;


import com.example.instagram.model.InstaUser;
import com.example.instagram.model.MediaRecent;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface InstagramService {


    @GET("v1/users/self")
    Call<InstaUser> getSelf(@Query("access_token")String token);

    @GET("v1/users/self/media/recent/")
    Call<MediaRecent> getRecentMedia(@Query("access_token")String token);
}