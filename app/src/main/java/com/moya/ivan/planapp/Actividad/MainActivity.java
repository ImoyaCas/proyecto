package com.moya.ivan.planapp.Actividad;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.moya.ivan.planapp.Controlador.ServicioMostrarEventos;
import com.moya.ivan.planapp.Modelo.CardAdapter;
import com.moya.ivan.planapp.Modelo.Plan;
import com.moya.ivan.planapp.Modelo.Planer;
import com.moya.ivan.planapp.Modelo.RestClient;
import com.moya.ivan.planapp.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    int id;
    Fragment fragment = null;
    boolean FragmentTransaction = false;
    public static List<Plan> planes;
    static RecyclerView card;
    static CardAdapter myadaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        planes = new ArrayList<>();

        card = (RecyclerView)findViewById(R.id.mycard);
        card.setLayoutManager(new LinearLayoutManager(this));
       // Log.i("baliza", "antes de allPlanes");
        allPlanes();



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        View header = navigationView.getHeaderView(0);
        TextView nombrevista = (TextView) header.findViewById(R.id.nombreVista);
        TextView emailvista = (TextView) header.findViewById(R.id.emailVista);

        nombrevista.setText(Planer.nombrePLVista);
        emailvista.setText(Planer.emailPLVista);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
/*
    public void showTimePickerDialog(View v) {
        EditText time = (EditText) v.findViewById(R.id.hora);
        DialogFragment newFragment = new TimePickerFragment(time);
        newFragment.show(getSupportFragmentManager(), "timePicker");

    }

    public void showDatePickerDialog(View v) {
        EditText time = (EditText) v.findViewById(R.id.fecha);
        DatePickerFragment newFragment = new DatePickerFragment(time);
        newFragment.show(getFragmentManager(), "datePicker");
    }
    */

    public static void allPlanes() {
        //Log.i("baliza", "dentro de allplanes");
        RestClient restClient = new RestClient();
        Retrofit retrofit = restClient.getRetrofit();
        //Log.i("baliza", "antes de enviar servicio");
        ServicioMostrarEventos servicio = retrofit.create(ServicioMostrarEventos.class);
        Call<List<Plan>> respuesta = servicio.getEventos();
        planes = new ArrayList<>();
        respuesta.enqueue(new Callback<List<Plan>>() {

            @Override
            public void onResponse(Call<List<Plan>> call, Response<List<Plan>> response) {
                //Log.i("baliza", "allPlanes : estoy aqui");
                planes = response.body();
                myadaptador = new CardAdapter(planes);
                card.setAdapter(myadaptador);
            }

            @Override
            public void onFailure(Call<List<Plan>> call, Throwable t) {
                Log.i("baliza", "allPlanes : " + t.getMessage());
            }
        });
    }
}