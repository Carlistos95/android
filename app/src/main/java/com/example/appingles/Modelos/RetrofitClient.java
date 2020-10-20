package com.example.appingles.Modelos;

import com.example.appingles.Interfaces.Questions;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL = "http://18.219.62.118:4000";
    private static RetrofitClient mInstance;
    private Retrofit retrofit;

    private RetrofitClient(){
        retrofit = new Retrofit.Builder()
                       .baseUrl(BASE_URL)
                       .addConverterFactory(GsonConverterFactory.create())
                       .build();
    }

    public static  synchronized  RetrofitClient getInstance(){

        if(mInstance == null){
            mInstance = new RetrofitClient();

        }

        return  mInstance;
    }

    public Questions getQuestion(){
        return retrofit.create(Questions.class);
    }

}
