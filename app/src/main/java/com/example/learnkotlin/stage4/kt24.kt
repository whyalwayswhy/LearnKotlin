package com.example.learnkotlin.stage4
// TODO list的遍历   结构语法过滤元素
fun main() {
    val list = listOf("a", "b", "c")

    //第一种方式
    for (i in list) {
        print("普通for循环输出:$i  ")
    }
    println()
    //第二种方式
    list.forEach {
        print("forEach输出:$it  ")
    }
    println()
    //第三种方式
    list.forEachIndexed {index: Int, s: String ->
        print("forEachIndexed输出:下标:$index 元素:$s  ")
    }

    /**
     * 解构语法
     */
    var (v1, v2, v3) = list
    // _下划线用来过滤赋值的  可以节约一些性能
    val (_, n1, n2) = list
}