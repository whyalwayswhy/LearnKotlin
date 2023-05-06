package com.example.learnkotlin.stage3
//TODO let内置函数
/**
 * apply函数的匿名函数持有的是this 返回的是自己本身
 *
 *
 * let函数返回的是最后一行 里面it是其本身
 * let函数返回类型根据匿名函数最后一行的返回结果来决定的
 * let匿名函数里面持有的是it 对于集合来说 it等于集合本身
 */
fun main() {
    //普通方式 对集合第一个元素相加
    val list = listOf(1,2,3,4,5)
    val firstValue1 = list.first()
    val result1 = firstValue1 + firstValue1
    println(result1)
    //let方式 对集合第一个元素相加
    val result2 = listOf(1,2,3,4,5).let {
        //打印结果[1, 2, 3, 4, 5]
//        println(it)
        //匿名函数的最后一行作为返回值
        it.first() + it.first()
        true
    }
    println(result2)

    //普通方式 对值判null 并返回
    println(getMethod(null))
    println(getMethod("why"))
    //let方式 对值判null 并返回
    println(getMethod1("ty"))
}

//一行写法
//fun getMethod(value: String?): String = value ?: "传递的值是null"
fun getMethod(value: String?) = value ?: "传递的值是null"

//let方式 加 空合并操作符
fun getMethod1(value: String?): String {
    return value?.let {
        "欢迎！传递的值是$it"
    } ?: "传递的值是null"
}
//简化版本
fun getMethod2(value: String?) = value?.let { "欢迎！传递的值是$it" } ?: "传递的值是null"
