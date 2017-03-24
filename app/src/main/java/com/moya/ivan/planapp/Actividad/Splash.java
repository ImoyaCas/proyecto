package com.moya.ivan.planapp.Actividad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.moya.ivan.planapp.R;

/**
 * Created by ivan on 15/04/2016.
 */
public class Splash extends Activity {

    private final int DURACION_SPLASH = 5000; // 4 segundos
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        imagen = (ImageView) findViewById(R.id.imagenSplash);
        Animation animacion = AnimationUtils.loadAnimation(Splash.this, R.anim.fadein);
        imagen.startAnimation(animacion);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                // Cuando pasen los 4 segundos, pasamos a la actividad principal de la aplicación
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, DURACION_SPLASH);
    }

    protected void onPause() {
        super.onPause();
        finish();
    }
}