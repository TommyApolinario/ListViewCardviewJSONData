package com.ejemplo1.listviewcardviewjsondata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var usuarios: List<Usuario> = listOf(
        Usuario(1, "elwe123csm@gmail.com", "Manuel" , "Navarro", "https://reqres.in/img/faces/1-image.jpg"),
        Usuario(2, "janet.weaver@reqres.in", "Janet" , "Navarro", "https://reqres.in/img/faces/2-image.jpg"),
        Usuario(3, "emma.wong@reqres.in", "Emma" , "Navarro", "https://reqres.in/img/faces/3-image.jpg"),
        Usuario(4, "eve.holt@reqres.in", "Eve" , "Navarro", "https://reqres.in/img/faces/4-image.jpg"),
        Usuario(5, "charles.morris@reqres.in", "Charles" , "Navarro", "https://reqres.in/img/faces/5-image.jpg"),
        Usuario(6, "tracey.ramos@reqres.in", "Tracey" , "Navarro", "https://reqres.in/img/faces/6-image.jpg"),


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()


    }
    fun initRecycler(){
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = UsuarioAdapter(usuarios)
        recyclerView.adapter = adapter

    }
}