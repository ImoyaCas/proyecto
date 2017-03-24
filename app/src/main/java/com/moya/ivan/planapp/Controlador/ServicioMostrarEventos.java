package com.moya.ivan.planapp.Controlador;

import com.moya.ivan.planapp.Modelo.Plan;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ivan on 10/05/2016.
 */
public interface ServicioMostrarEventos {
    @GET("php/mostrarEventos.php")
    Call<List<Plan>> getEventos();

}
