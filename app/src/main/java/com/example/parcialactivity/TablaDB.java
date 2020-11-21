package com.example.parcialactivity;


import androidx.annotation.NonNull;
import androidx.room.PrimaryKey;
import androidx.room.Entity;

@Entity(tableName ="tablaDB")

public class TablaDB {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "idTabla")
    Long id;

    String tvValor;
    String etTexto;
    boolean rbEleccionGuardar;
    boolean rbEleccionMostrar;

}

