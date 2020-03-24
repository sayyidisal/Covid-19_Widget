package com.trisuliswanto.covid19.MyRetrofit;

/**
 * Created by macbookair on 5/19/17.
 */

import com.trisuliswanto.covid19.Models.ResponseCovid19;
import com.trisuliswanto.covid19.Models.ResponseCovid19id;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("indonesia")
    Call<List<ResponseCovid19>> get_covid19_indonesia();

    @GET("summary")
    Call<ResponseCovid19id> get_covid19id_indonesia();

}
