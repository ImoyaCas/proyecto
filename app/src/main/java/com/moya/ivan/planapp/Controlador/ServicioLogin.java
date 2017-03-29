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
    Call<Planer> getUser(@Query("email") String email, @Query("password") String pass);

    @GET("php/splash.php")
    Call<Planer> getUserInicio(@Query("id") int id);
}
