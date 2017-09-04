package com.example.administrator.myapplication

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.OrientationHelper
import com.google.gson.Gson
import kotlinx.android.synthetic.main.kotlin_act.*
import com.github.salomonbrys.kotson.*

/**
 * Created by Administrator on 2017/9/1.
 */
class KotlinAct2 : Activity() {

    var listdata = ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_act)
        listdata.add(User("lill"))
        listdata.add(User("aaa"))
        listdata.add(User("vvv"))
        listdata.add(User("vfff"))
//        listdata = JSON.parseObject("[{ 'username': 'Isaac' },{ 'username': 'Tad' },{ 'username': 'Frank' }]", object : TypeReference<ArrayList<User>>() {

//        })
        var str = "[{ 'username': 'Isaac' },{ 'username': 'Isaac1' }]";
        var gson = Gson();
        //解析对象
        var user = gson.fromJson<User>("{ 'username': 'Isaac' }", User::class.java)
        //解析数组
        val list1 = gson.fromJson<List<User>>(str)
//        listdata.add(user);
        listdata.addAll(list1)
        //生成json串
        println(gson.toJson(listdata))
        recycler?.layoutManager = LinearLayoutManager(this, OrientationHelper.VERTICAL, false)
        recycler?.adapter = MyAdapter(listdata)
    }
}
