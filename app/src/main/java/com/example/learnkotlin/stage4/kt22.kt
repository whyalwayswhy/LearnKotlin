package com.example.learnkotlin.stage4
// TODO list集合  可变list集合
fun main() {

    val list: List<String> = listOf<String>("why", "ty")
    //类型推断 泛型不用写
    val list1: List<String> = listOf("why", "ty")
    //类型推断 类型也不用写
    val list2 = listOf("why", "ty")

    //取值方式  使用运算符重载实现的
    // [] == get() 使用索引
    println(list[0])

    //写kotlin 不会出现空指针异常和下标越界异常

    //防止崩溃的异常
    println(list.getOrElse(1){"越界了"}) //没越界
    println(list.getOrElse(2){"越界了"}) //越界

    //getOrNull()操作加空合并操作符
    println(list.getOrNull(1) ?: "操作越界")
    println(list.getOrNull(2) ?: "操作越界")

    //mutableListOf
    val mList = mutableListOf("why", "ty")
    mList.add("yy")
    println(mList)
    mList.remove("yy")
    println(mList)

    //可变集合到可变集合
    val mList1 = mList.toMutableList()
    mList1.add("111")
    println(mList1)

    //可变集合到不可变集合
    val mList2 = mList.toList()
    //没有add方法了
//    mList2.add

}