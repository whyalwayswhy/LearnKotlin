package com.example.learnkotlin.stage3
//TODO with内置函数 with可以嵌套
fun main() {
    //与 run函数基本一致
    val str = "why love ty"
    //具名操作  with只会返回最外层的with的结果
    with(with(str, ::getStrLen), ::printLen)
    //匿名操作
    with(with(str) {
        length
    }) {
        println("with匿名操作得到的字符串长度是:$this")
    }
}

fun getStrLen(str: String) = str.length

fun printLen(len: Int) = println("with具名操作得到的字符串长度是:$len")