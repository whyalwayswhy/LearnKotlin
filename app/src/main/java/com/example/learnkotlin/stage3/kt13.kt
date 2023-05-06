package com.example.learnkotlin.stage3

import java.lang.Exception

//TODO kotlin可空性特点 安全调用操作符  let函数完成安全调用  非空断言操作符  空合并操作符 异常处理与自定义异常
//TODO 先决条件函数
/**
 * 如果百分百保证变量是有值的 可以使用断言！！
 */
fun main() {
    //1.kotlin默认是不可空类型 不能赋null
    var name: String
//    name = null

    //2.声明时候指定为可空类型
    var name1: String?
    name1 = "aaa"
    name1 = ""

    var name2: String? = "why"
//    name2.uppercase() //name是可空类型的 想要使用name必须给出不久措施
    name2?.uppercase() //如果name2是null 那么？后面的代码就不执行
    name2!!.uppercase() //断言操作符  如果name2是null 会报错

    /**
     * let函数 只有在不为空的时候才会操作
     */
    val temp = name1?.let {
        // it == name本身
        // 如果执行到这 it一定不为null
        if (it.isBlank()) {
            "Default"
        } else {
            "[$it]"
        }
    }
    println(temp)

    var str: String? = null
    //?:空合并操作符  如果str为空的话执行?:后面的操作 如果不为null则会执行?:之前的内容
    println(str ?: "我是null")

    /**
     * let + 空合并操作符
     * ?.let{}实现 不为空时的操作
     * ?: 实现为空时候的操作
     */
    println(str?.let { "[$it]" } ?: "我是null")

    try {
        var msg: String? = "a"
        checkException(msg)
        println(msg!!.length)
    }catch (e: Exception) {
        e.printStackTrace()
    }

    var value: String? = null
    println(value)
    //先决条件函数 节省代码量
//    checkNotNull(value)
//    requireNotNull(value)
    var value1: Boolean = false
    //如果是false会抛异常
    require(value1)


}

fun checkException(msg: String?) {
    msg ?: throw CustomException()
}

class CustomException: IllegalArgumentException("代码不严谨")
