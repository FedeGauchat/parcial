package com.example.parcialactivity;


import androidx.room.PrimaryKey;
import androidx.room.Entity;

@Entity

public class TablaDB {
    @PrimaryKey(autoGenerate = true);
    Long id;

    String tvValor;
    String etTexto;
    boolean rbEleccionGuardar;
    boolean rbEleccionMostrar;

}

