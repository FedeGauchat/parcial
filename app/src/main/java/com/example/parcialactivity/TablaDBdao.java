package com.example.parcialactivity;


import androidx.room.Query;

import java.util.List;

@Dao
public interface TablaDBdao {

    @Insert
    void insertar(Pedido pedido);

    @Query("SELECT * FROM plato")
    List<> buscarTodos();
}
