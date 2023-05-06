package com.example.learnkotlin.stage4

import android.os.Build
import androidx.annotation.RequiresApi

//TODO map集合的遍历
@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    val map = mapOf("why" to 1, "ty" to 2)
    //第一种方式 forEach
    map.forEach{
        //这里的it是 Entry 包含k 和 V
        println("K:${it.key}, V:${it.value}")
    }
    println()
    //第二种方式
    //可以覆盖 entry对象 也可以覆盖key和value
    map.forEach { entry ->
        println("K:${entry.key}, V:${entry.value}")
    }
    //key 和 value用一个括号括起来
    map.forEach{ (key, value) -> //把默认的it给覆盖
        println("K:$key, V:$value")
    }
    println()
    //第三种方式 使用for循环
    for (entry in map) {
        //entry 对象是map里面的一个键值对
        println("K:${entry.key}, V:${entry.value}")
    }
}