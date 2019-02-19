package com.example.rupeshl.qasim;

import retrofit2.Call;
import retrofit2.http.GET;




public interface ApiInterface {
    @GET("aislogin/getallinfantrecordswithvillage?village=0&Registration_no=0&anm_id=101812")
    Call<AnmolData> getData();

}