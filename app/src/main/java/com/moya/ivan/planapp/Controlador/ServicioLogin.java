package com.moya.ivan.planapp.Controlador;

import com.moya.ivan.planapp.Modelo.LoginBody;
import com.moya.ivan.planapp.Modelo.Planer;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by ivan on 19/04/2016.
 */
public interface ServicioLogin {

    @POST("controller/login.php")
    Call<Planer> login(@Body LoginBody loginBody);

    @POST("controller/splash.php")
    Call<Planer> getUserInicio(@Query("id") int id);

    /*@GET("login.php")
    Call<Planer> getUser(@Query("email") String email, @Query("password") String pass);*/
}
