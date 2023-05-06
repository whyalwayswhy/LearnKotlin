package com.example.learnkotlin.stage4
//TODO set集合 可变set集合
fun main() {
    //自动过滤重复的元素
    val set = setOf("a", "b", "c", "a")
    println(set)
    //    set[0] 不能这样通过下标索引 java中也同样不行
    println(set.elementAt(0)) //有越界崩溃的可能
    //kotlin中有相应方法
    println(set.elementAtOrElse(3) {"越界了"})
    //配合空合并操作符一起使用
    println(set.elementAtOrNull(55) ?: "空合并操作符提醒你越界了")

    val mSet = mutableSetOf("a", "b", "c", " a")
    println(mSet)
    mSet += "d"
    mSet -= "e"
    println(mSet)
}