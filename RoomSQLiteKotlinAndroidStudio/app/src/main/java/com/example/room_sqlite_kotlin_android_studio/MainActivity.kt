package com.example.room_sqlite_kotlin_android_studio

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val room = Room.databaseBuilder(this, DBPruebas::class.java, "usuario").build()

        lifecycleScope.launch {
            room.daoUsuario().agregarUsuario(Usuario("Sergio Peralta", "xcheko51x", "12345"))
            room.daoUsuario().agregarUsuario(Usuario("Laura Perez", "laurap", "laura12345"))
            room.daoUsuario().agregarUsuario(Usuario("Sergio Leal", "pedrol", "pedro232"))

            var usuarios = room.daoUsuario().obtenerUsuarios()
            for(item in usuarios){
                println("${item.nombre}, ${item.usuario}, ${item.contrasena}")
            }

        }

    }
}