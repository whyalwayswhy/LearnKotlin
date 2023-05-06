package com.example.learnkotlin.stage4

import android.app.Activity
import java.util.*

//TODO kotlin中的数组类型
/**
 * IntArray
 * DoubleArray
 * LongArray
 * ShortArray
 * FloatArray
 * BooleanArray
 * Array              arrayOf  对象数组
 */
fun main() {
    // intArrayOf
    val intArray = intArrayOf(1 , 2, 3)
    //.contentToString 将数组中的内容转换成String的形式
    println(intArray.contentToString())
    println(intArray[0])
    //数组越界的话
    println(intArray.elementAtOrElse(5) {-1})
    println(intArray.elementAtOrNull(5) ?: "越界了")

    //集合转数组
    val charArray = listOf('a', 'b', 'c').toCharArray()
    println(charArray.contentToString())

    //对象数组
//    val activityArray = arrayOf(Activity(), Activity())
    val myIntArray = arrayOf(1 , 2, 3, 4, 5)
    println(myIntArray.contentToString())

}