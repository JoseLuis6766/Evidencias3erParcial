package com.example.room_sqlite_kotlin_android_studio

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DaoUsuario {
    @Query("SELECT * FROM usuario")
    suspend fun obtenerUsuarios(): List<Usuario>

    @Query("SELECT * FROM Usuario WHERE usuario=:usuario")
    suspend fun obtenerUsuario(usuario: String)

    @Insert
    suspend fun agregarUsuario(usuario: Usuario)

    @Query("UPDATE Usuario SET nombre=:nombre, contrasena=:contrasena WHERE usuario=:usuario")
    suspend fun actualizarUsuario(nombre:String, usuario: String, contrasena: String)

    @Query("DELETE FROM Usuario WHERE usuario=:usuario")
    suspend fun borrarUsuario(usuario: String)

}