package com.example.casetracer;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {

    public static Retrofit retrofit=null;
    public static APIinterface getAPIInterface()
    {
        if(retrofit==null)
        {
            retrofit=new Retrofit.Builder().baseUrl(APIinterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(APIinterface.class);
    }


}
