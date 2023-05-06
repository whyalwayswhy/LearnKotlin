package com.example.learnkotlin.stage3

import kotlin.math.roundToInt

//TODO ==和===  字符串遍历   数字类型的安全转换函数  double转int
/**
 * == 内容的比较 相当于Java的equals
 * === 引用的比较
 */
fun main() {
    val name1 = "why"
    val name2 = "why"
    //等于java中的equals
    println(name1 == name2)
    //"why"生成在字符串常量池里了 所以是true
    println(name1 === name2)

    val str = "ABCDEFGHIGKLMNOPQRSTUVWXYZ"
    str.forEach {
        //不写的话默认是it
        print("当前的字符是:$it")
    }
    str.forEach { c->
        //不写的话默认是it
        print("当前的字符是:$c")
    }

    /**
     * 字符串有整形相关的转换用 toIntOrNull()这个函数
     */
    var number: Int = "666".toInt()
    //Double类型无法直接转换成Int类型
//    var number2: Int = "666.6".toInt()
    //可以通过toIntOrNull 让不能转换时返回null
    var number2: Int? = "666.6".toIntOrNull()
    println(number2 ?: "字符串不为整形")

    //只保留整数位
    println(2.5.toInt())
    //四舍五入
    println(2.5.roundToInt())
    println(2.4.roundToInt())
    //保留几位小数点后数字 得到的是个字符串
    val res = "%.3f".format(2.5433)
    println(res)
}