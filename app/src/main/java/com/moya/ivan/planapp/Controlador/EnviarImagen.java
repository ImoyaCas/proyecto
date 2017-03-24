package com.moya.ivan.planapp.Controlador;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by ivan on 18/05/2016.
 */
public interface EnviarImagen {

    @POST("php/subirUrl.php")
    Call<String> setUrlImg(@Query("idUsuario") int idUsuario, @Query("nombreImg") String nombreImg);
}
