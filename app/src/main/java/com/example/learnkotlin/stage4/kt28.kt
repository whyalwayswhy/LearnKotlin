package com.example.learnkotlin.stage4

import android.os.Build
import androidx.annotation.RequiresApi

//TODO map集合 map键值对的获取
@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    //map的初始化  to后面的括号不是必须的
    val map = mapOf("key" to ("value"), "key1" to "value1")
    println(map)
    //使用pair的方式初始化map 和C++中较为类似
    val map1 = mapOf(Pair("why","ty"), Pair("ty","why"))
    println(map1)

    /**
     * 读取map中的值
     * 推荐使用方式二 和方式三
     */
    //方式一：[] 找不到会返回null
    println(map1["why"])  //通过key得到value值
    println(map1["xx"])  //找不到返回null

    //方式二： getOrDefault
    println(map1.getOrDefault("yy","没有这个key"))
    println(map1)

    //方式三：getOrElse  Else可以写在外面 而且不限类型
    println(map1.getOrElse("yy") {1})
    println(map1.getOrElse("yy") {1.1f})

    //方式四：与java一样的get()方式  与[]一样
    println(map1.get("why"))
    println(map1.get("yy"))
    //getValue() 会报异常的
    println(map1.getValue("yy"))

}