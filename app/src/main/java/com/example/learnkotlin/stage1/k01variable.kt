package com.example.learnkotlin.stage1

fun main() {

    /**
     * var 可读可改
     */
    var string: String = "hello world"
    println(string)

    /**
     * 基本类型 和java对应
     * String Int Double Float Long Short Byte Char Boolean
     */

    /**
     * val 只读不可更改
     */
    val age: Int = 24
    //age = 25  //不可修改
    println(age)

    /**
     * kotlin中的类型推断
     * 可以根据后面的内容自动推算出前面变量的类型
     */
    //自动推导为char类型
    var char1 = 'a'



}