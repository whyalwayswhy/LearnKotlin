package com.example.learnkotlin.stage4

import android.os.Build
import androidx.annotation.RequiresApi

//TODO kotlin中mutator函数 removeIf
// mutator 突变
@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    val list = mutableListOf("why", "ty", "aaa","aa","a")
    //运算符重载  // mutator特性和+= 一样
    list += "bbb"
    list += "ccc"
    println(list)
    list -= "ccc"
    println(list)

    //removeIf 如果包含"a"的都移除
    list.removeIf { it.contains("a") }
    println(list)
}