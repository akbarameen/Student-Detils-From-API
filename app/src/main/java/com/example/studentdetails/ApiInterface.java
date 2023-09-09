package com.example.studentdetails;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("gettestingdata")
    Call<Pojo> getStudents();
}
