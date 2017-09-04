package com.example.administrator.myapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Administrator on 2017/9/1.
 */
class MyAdapter(var list: List<User>) : RecyclerView.Adapter<MyAdapter.MyHolder>() {
    override fun onBindViewHolder(holder: MyHolder?, position: Int) {

        holder?.usernameTv?.text=list[position].username
    }

    override fun getItemCount(): Int {
      return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {
        return MyHolder(LayoutInflater.from(parent?.context).inflate(R.layout.item, parent, false))
    }
    class MyHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var usernameTv: TextView = view.findViewById(R.id.itemTv) as TextView
    }
}