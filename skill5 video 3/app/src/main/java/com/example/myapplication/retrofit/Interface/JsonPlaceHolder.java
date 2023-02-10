package com.example.myapplication.retrofit.Interface;

import android.telecom.Call;

import com.example.myapplication.retrofit.model.Posts;

import java.util.List;

import retrofit2.Callback;
import retrofit2.http.GET;

public interface JsonPlaceHolder {
    @GET("posts")
    Callback<List<Posts>>getPosts();

}
