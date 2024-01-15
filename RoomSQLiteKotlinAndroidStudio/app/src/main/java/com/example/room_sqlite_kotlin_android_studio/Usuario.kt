package com.example.room_sqlite_kotlin_android_studio

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class Usuario {

    @PrimaryKey
    var usuario: String
    var nombre: String? = null
    var contrasena: String? = null

    constructor(nombre: String, usuario: String, contrasena: String){
        this.nombre = nombre
        this.usuario = usuario
        this.contrasena = contrasena

    }
}