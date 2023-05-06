package com.example.learnkotlin.stage1

/**
 * 编译时常量只能是常用的基本数据类型
 * String Int Double Float Long Short Byte Char Boolean
 * 反编译后可以看到对应java代码
 * kotlin语言只有一种数据类型  都是引用类型  编译器会在java字节码中修改成基本类型
 */

/**
 * 可以定义编译时候
 */
const val PI = 3.14
const val PI1 = 3.141
const val PI2 = 3.145


/**
 * 编译时常量只能在函数之外定义
 */
fun main() {

    //修饰符const不适用于 局部变量
    //因为函数内部定义的变量 只有在运行时才能调用函数进行赋值 不存在编译时常量这种说法了
//    const val PI = 3.14   这里是局部变量

    val info = "why"  //这个不是常量 是只读类型的变量
}