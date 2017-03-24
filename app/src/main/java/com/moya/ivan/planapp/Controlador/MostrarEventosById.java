package com.moya.ivan.planapp.Controlador;

import com.moya.ivan.planapp.Modelo.Planer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ivan on 11/05/2016.
 */
public interface MostrarEventosById {
    @GET("php/mostrarEventosById.php")
    Call<List<Planer>> getEventosById(@Query("idUsuario") int idUsuario);
}
