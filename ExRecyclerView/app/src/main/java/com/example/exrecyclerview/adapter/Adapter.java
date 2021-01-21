package com.example.exrecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exrecyclerview.R;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista,parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titulo.setText("Título de um filme qualquer");
        holder.titulo.setText("FICÇÃO");
        holder.ano.setText("2020");
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView titulo;
        TextView ano;
        TextView genero;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.txtTitulo);
            ano = itemView.findViewById(R.id.txtAno);
            genero = itemView.findViewById(R.id.txtGenero);
        }
    }
}