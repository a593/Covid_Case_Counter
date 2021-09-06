package com.example.casetracer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIinterface {
    String BASE_URL="https://corona.lmao.ninja/v2/";

    @GET("countries")
    default Call<List<ModelClass>> getcountrydata() {
        return null;
    }

}
