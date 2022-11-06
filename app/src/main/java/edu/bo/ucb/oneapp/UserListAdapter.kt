package edu.bo.ucb.oneapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UserListAdapter(val items: ArrayList<Usuario>, val context: Context): RecyclerView.Adapter<UserListAdapter.UserListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_user, parent, false)
        return UserListViewHolder(v)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: UserListViewHolder, position: Int) {
        val usuario = items.get(position)
        holder.itemView.txtName.text = usuario.nombre
        holder.itemView.txtEmail.text = usuario.correo
    }

    class UserListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}
