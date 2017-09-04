package com.example.administrator.myapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.stream.Collectors


class MainActivity : AppCompatActivity() {


    var listdata=ArrayList<User>();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloTv.text = "你好"
        listdata.add(User("lill"))
        listdata.add(User("aaa"))
        listdata.add(User("vvv"))
        listdata.add(User("vfff"))
        listView.adapter = MyAdapter(this,listdata.stream().filter { it.username.contains("v")}.collect(Collectors.toList()))
        listView.onItemClickListener= AdapterView.OnItemClickListener { adapterView, view, i, l ->Toast.makeText(this,"人${l}",Toast.LENGTH_LONG).show()
        var i=Intent(this,KotlinAct2::class.java)
            startActivity(i);
        }
    }

    class MyAdapter(var context: Context,var list:List<User>) : BaseAdapter() {

        override fun getItem(p0: Int): Any {
            return list[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getCount(): Int {
            return list.size
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var view = View.inflate(context, R.layout.item, null)
            var itemTv: TextView = view.findViewById(R.id.itemTv) as TextView
            itemTv.text = list[p0].username
            return view
        }

    }
    data class User(var username:String)

}
