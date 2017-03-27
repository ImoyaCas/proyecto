package com.moya.ivan.planapp.Actividad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.moya.ivan.planapp.Controlador.ServicioCrearEvento;
import com.moya.ivan.planapp.Modelo.Planer;
import com.moya.ivan.planapp.Modelo.RestClient;
import com.moya.ivan.planapp.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by ivan on 27/3/17.
 */

public class CrearPlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_plan);

        final EditText nombre;
        final EditText lugar;
        final EditText descripcion;
        final EditText precio;
        final EditText plazas;
        final EditText fecha;
        final EditText hora;

        TextView nombreUser, emailUser;

        nombre = (EditText) findViewById(R.id.nombreEvento);
        lugar = (EditText) findViewById(R.id.lugarEvento);
        descripcion = (EditText) findViewById(R.id.descripcionEvento);
        precio = (EditText) findViewById(R.id.precioEvento);
        plazas = (EditText) findViewById(R.id.plazasEvento);
        fecha = (EditText) findViewById(R.id.fecha);
        hora = (EditText) findViewById(R.id.hora);

        nombreUser = (TextView) findViewById(R.id.txt_nombre_user_crear_plan);
        emailUser = (TextView) findViewById(R.id.txt_email_user_crear_plan);

        nombreUser.setText(Planer.nombrePLVista);
        emailUser.setText(Planer.emailPLVista);

        Button crear = (Button) findViewById(R.id.crear);
        crear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//Obtengo valores de los edittext
                String nombre1 = nombre.getText().toString();
                String lugar1 = lugar.getText().toString();
                String descripcion1 = descripcion.getText().toString();
                String precio1 = precio.getText().toString();
                Integer plazas1 = Integer.parseInt(plazas.getText().toString());
                String fecha1 = fecha.getText().toString();
                String hora1 = hora.getText().toString();

                int idUsuario = Planer.idPLVista;
                System.out.print("Valor de idUser: " + Planer.idPLVista + "Y el otro: " + idUsuario);
                Double precio2 = Double.valueOf(precio1);
                Log.i("variable fecha1 =", "" + fecha1 + fecha1);
                Log.i("variable hora1 =", "" + hora1 + hora1);
                RestClient restClient = new RestClient();
                Retrofit retrofit = restClient.getRetrofit();

                ServicioCrearEvento servicio = retrofit.create(ServicioCrearEvento.class);
                final Call<String> respuesta = servicio.setUser(nombre1, lugar1, descripcion1, precio2, plazas1, idUsuario, fecha1, hora1);
                respuesta.enqueue(new Callback<String>() {

                    @Override
                    public void onResponse(Call<String> call, Response<String> response) {

                        nombre.setText("");
                        lugar.setText("");
                        descripcion.setText("");
                        precio.setText("");
                        plazas.setText("");
                        fecha.setText("");
                        hora.setText("");
                        Toast.makeText(CrearPlan.this, "Evento creado", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<String> call, Throwable t) {
                        Toast.makeText(CrearPlan.this, "El evento no se ha creado", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}