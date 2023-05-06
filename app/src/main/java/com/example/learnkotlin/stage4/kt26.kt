package com.example.learnkotlin.stage4
//TODO kotlin集合转换与快捷函数
fun main() {

    val list = mutableListOf("a", "a", "b", "c")
    println(list)
    //list转set 去重
    val set = list.toSet()
    println(set)
    //list转list去重
    println(list.toSet().toList())
    //快捷函数 distinct去重  内部也是转变成set再转成list去重
    println(list.distinct())
}