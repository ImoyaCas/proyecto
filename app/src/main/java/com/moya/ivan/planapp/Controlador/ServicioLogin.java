package com.moya.ivan.planapp.Controlador;

import com.moya.ivan.planapp.Modelo.Planer;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ivan on 19/04/2016.
 */
public interface ServicioLogin {

    @GET("php/login.php")
    Call<Planer> getUser(@Query("username") String user, @Query("password") String pass);
}