package com.example.appingles.Modelos;

import com.google.gson.annotations.SerializedName;

public class Question {

 public String message;
 public BodyQuestion data;

    public String getMessage() {
        return message;
    }

    public BodyQuestion getData() {
        return data;
    }

    //public BodyQuestion[] getQuestion() {
      //  return question;
    //}
}
