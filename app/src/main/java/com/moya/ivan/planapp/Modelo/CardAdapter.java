package com.moya.ivan.planapp.Modelo;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.moya.ivan.planapp.R;

import java.util.List;

/**
 * Created by ivan on 7/3/17.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.EventoViewHolder> {

    private List<Plan> items;

    public static class EventoViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public ImageView imagen;
        public TextView nombre, descripcion;
        //public Button ir;
        CardView cv;


        public EventoViewHolder(View v) {
            super(v);
            cv = (CardView) itemView.findViewById(R.id.card_view);
            imagen = (ImageView) v.findViewById(R.id.img);
            nombre = (TextView) v.findViewById(R.id.nombre);
            descripcion = (TextView) v.findViewById(R.id.descripcion);
            //  ir = (Button) v.findViewById(R.id.ir);
        }
    }

    public CardAdapter(List<Plan> items) {
        this.items = items;
        // this.act = act;
        //   Log.i("seguimiento", "1id " + id);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public EventoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview, viewGroup, false);
        EventoViewHolder evh = new EventoViewHolder(v);
        //  Log.i("seguimiento", "2id " + id);
        return evh;
    }

    @Override
    public void onBindViewHolder(final EventoViewHolder viewHolder, final int pos) {

        // id = items.get(pos).getId();

        viewHolder.imagen.setImageResource(R.drawable.logo);
        viewHolder.nombre.setText(items.get(pos).getNombre());
        viewHolder.descripcion.setText(items.get(pos).getDescripcion());

       /* viewHolder.ir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                nombreMonum = items.get(pos).getNombre();
                lat = items.get(pos).getLatitud();
                lon = items.get(pos).getLongitud();

                Intent i = new Intent(act, MapsActivity.class);

                Log.i("seguimiento", "nombre " + nombreMonum);
                Log.i("seguimiento", "latitud " + lat);
                Log.i("seguimiento", "longitud " + lon);

                i.putExtra("latitud", lat);
                i.putExtra("longitud", lon);
                i.putExtra("nombre", nombreMonum);

                act.startActivity(i);
                Toast.makeText(act, R.string.toast_mapa, Toast.LENGTH_LONG).show();
            }
        });*/
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    /**
     * @param id, de tipo int
     * @return un objeto drawable segun el id

    public int asignarImg(int id) {
    int drawable = 0;
    if (id == 1) {
    drawable = R.drawable.villa;
    } else if (id == 2) {
    drawable = R.drawable.castillo;
    } else if (id == 3) {
    drawable = R.drawable.iglesia;
    } else if (id == 4) {
    drawable = R.drawable.gabino;
    } else if (id == 5) {
    drawable = R.drawable.casamuseo;
    } else if (id == 6) {
    drawable = R.drawable.banuelo;
    } else if (id == 7) {
    drawable = R.drawable.fuentealta;
    } else if (id == 8) {
    drawable = R.drawable.monea;
    } else if (id == 9) {
    drawable = R.drawable.cruz;
    } else if (id == 10) {
    drawable = R.drawable.baja;
    }
    return drawable;
    }*/
}

