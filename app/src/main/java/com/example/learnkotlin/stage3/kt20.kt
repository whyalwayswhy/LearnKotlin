package com.example.learnkotlin.stage3
//TODO also内置函数
fun main() {
    var str = "ALSDJLKSAJGLSJGLSJDLGJSKLG"

    /**
     * also的返回值是其本身 内部调用的是it
     */
    val r: String = str.also {
        true
    }

    //also返回值是其本身 所以可以链式调用
    str.also {
        println(it)
    }.also {
        println(it.lowercase())
    }
}