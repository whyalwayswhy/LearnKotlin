package com.example.learnkotlin.stage2
//TODO 匿名函数与lambda表达式
fun main() {
    //统计字符串长度
    val len = "why".count()
    println(len)

    //统计字符串中有几个等于'w'的字符
    val len1 = "why".count() {
        // it 等价于 "why"组成的函数
        it =='w'
    }
    println(len1)



}