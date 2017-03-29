package com.moya.ivan.planapp.Actividad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.moya.ivan.planapp.Controlador.ServicioLogin;
import com.moya.ivan.planapp.Modelo.Planer;
import com.moya.ivan.planapp.Modelo.RestClient;
import com.moya.ivan.planapp.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by ivan on 15/04/2016.
 */
public class Splash extends Activity {

    private final int DURACION_SPLASH = 5000; // 4 segundos
    private static final String MY_PREFS_NAME = "DatosInicioPlaner";
    ImageView imagen;
    int idName;
    Planer planer;
    Gson gson;
    static boolean conectado = false;
    static boolean verificarConectado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        imagen = (ImageView) findViewById(R.id.imagenSplash);
        Animation animacion = AnimationUtils.loadAnimation(Splash.this, R.anim.fadein);
        imagen.startAnimation(animacion);

        RestClient restClient = new RestClient();
        Retrofit retrofit = restClient.getRetrofit();

        idName = getValuePreference(Splash.this);
        Log.i("baliza", "sharedPreference: " + idName);

        ServicioLogin servicio = retrofit.create(ServicioLogin.class);
        final Call<Planer> respuesta = servicio.getUserInicio(idName);
        respuesta.enqueue(new Callback<Planer>() {
            @Override
            public void onResponse(Call<Planer> call, Response<Planer> response) {
                planer = new Planer();
                planer = response.body();
               /* Planer.nombrePLVista = planer.getUsername();
                Planer.emailPLVista = planer.getEmail();
                Planer.idPLVista = planer.getId();
                Planer.urlImgPLVista = planer.getAvatar();*/
            }

            @Override
            public void onFailure(Call<Planer> call, Throwable t) {

            }

        });

        new Handler().postDelayed(new Runnable() {
            public void run() {
                // Cuando pasen los 4 segundos, pasamos a la actividad principal de la aplicación

                Log.i("baliza", "estado: " + planer.comprobarEstado(planer.getEstado()));
                if (planer.comprobarEstado(planer.getEstado())) {
                    gson = new Gson();
                    Intent intent = new Intent(Splash.this, MainActivity.class);
                    String myjson = gson.toJson(planer);
                    Log.i("baliza", "json splash:" + myjson);
                    intent.putExtra("myjson", myjson);
                    conectado = true;
                    startActivity(intent);
                    finish();
                }else {
                    Intent intent = new Intent(Splash.this, MainActivity.class);
                    Log.i("baliza", "else splash");
                    conectado = false;
                    verificarConectado = false;
                    startActivity(intent);
                    finish();
                }

            }
        }, DURACION_SPLASH);
    }

    protected void onPause() {
        super.onPause();
        finish();
    }

    public int getValuePreference(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        return preferences.getInt("idPlaner", 0);
    }
}