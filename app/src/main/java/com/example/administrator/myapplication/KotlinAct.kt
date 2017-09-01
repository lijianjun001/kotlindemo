package com.nirvana.ylmc.activitys

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ListView
import com.example.administrator.myapplication.R

/**
 * Created by Administrator on 2017/8/31.
 */
class KotlinAct : Activity(), View.OnClickListener {
    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when (v?.id) {

            in 1..10 -> {
            }
            10 -> {
            }

        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    data class User(var username:String)

     fun initView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

         var a=User("aaa")

         a.username;

         println("${a.username}")
         val map = mapOf("a" to 1, "b" to 2, "c" to 3)
         for ((k, v) in map) {
             println("$k -> $v")
         }

        val items = listOf("apple", "banana", "kiwi")
        var index = 0
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }
        for (item in items) {

        }
        loop@ for (i in items.indices) {

        }
        loop@ for (i in 1..100) {
            for (j in 1..100) {
                if (i == 10) break@loop
            }
        }
        when {
            "orange" in items -> println("juicy")
            "apple" in items -> println("apple is fine too")
            else -> println("apple is fine too")
        }



        for (x in 1..5) {
            print(x)
        }


        items.filter { it.endsWith("e") }.map { it.length }.toList();
    }

    fun maxOf(a: Int, b: Int) = if (a > b) a else b
    fun findViewById() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun lenthOfStr(s: String, a: Int) = s.length + a;
}