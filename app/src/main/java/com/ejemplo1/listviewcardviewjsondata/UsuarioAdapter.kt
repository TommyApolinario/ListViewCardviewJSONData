package com.ejemplo1.listviewcardviewjsondata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_usuario.view.*

class UsuarioAdapter(val usuario:List<Usuario>):RecyclerView.Adapter<UsuarioAdapter.UsuarioHolder>(){

    class UsuarioHolder(val view: View): RecyclerView.ViewHolder(view){
        fun render(usuario: Usuario){
        view.txtName.text = usuario.first_name + " " + usuario.last_name
            view.txtMail.text = usuario.email
            view.txtAvatar.text = usuario.avatar
            Picasso.get().load(usuario.avatar).into(view.imgAvatar)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return UsuarioHolder(layoutInflater.inflate(R.layout.item_usuario, parent, false))
    }

    override fun onBindViewHolder(holder: UsuarioHolder, position: Int) {
        holder.render(usuario[position])
    }

    override fun getItemCount(): Int = usuario.size
}

