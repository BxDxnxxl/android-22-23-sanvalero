package com.example.myapplication;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPersonaje extends RecyclerView.Adapter<AdaptadorPersonaje.ViewHolderPersonaje> {
    @NonNull
    ArrayList<PersonajeVo> listaPersonajes;

    public AdaptadorPersonaje( ArrayList<PersonajeVo> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    @Override
    public ViewHolderPersonaje onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_personajes,null,false);
        return new ViewHolderPersonaje(view);
    }

    @Override
    public void onBindViewHolder( ViewHolderPersonaje holder, int position) {
            holder.etiNombre.setText(listaPersonajes.get(position).getNombre());
        holder.etiInformacion.setText(listaPersonajes.get(position).getInfo());
        holder.foto.setImageResource(listaPersonajes.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }

    public class ViewHolderPersonaje extends RecyclerView.ViewHolder {

        TextView etiNombre, etiInformacion;
        ImageView foto;

        public ViewHolderPersonaje( View itemView) {
            super(itemView);
            etiNombre = (TextView) itemView.findViewById(R.id.idNombre);
            etiInformacion = (TextView) itemView.findViewById(R.id.idInfo);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);
        }
    }


}
