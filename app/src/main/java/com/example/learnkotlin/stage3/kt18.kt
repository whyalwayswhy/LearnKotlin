package com.example.learnkotlin.stage3
//TODO run内置函数
/**
 * run 里面持有的是调用者的this 返回值是最后一行的结果
 */
fun main() {
    var str = "why is ok"
    val r1: Boolean = str.run {
        //this是str本身
        true
    }
    println(r1)

    //这里是匿名函数配合run
    str.run {

    }

    //具名函数配合run函数
//    str.run (具名函数)
    val str1 = str
        .run(::isLong)
        .run(::showText)
        .run(::mapText)
    println(str1)
    /**
     * 链式函数
     * 还可以这样写 打印也调用系统的具名函数
     */
    str
        .run(::isLong)
        .run(::showText)
        .run(::mapText)
        .run(::println)
    //使用let写一遍  两者实现一样的效果
    str
        .let(::isLong)  // it 和 this 功能类似
        .let(::showText)
        .let(::mapText)
        .let(::println)
    /**
     * 匿名函数调用
     */
    str = "tytytytyty"
    str
        .run { str.length > 5 }
        .run { if (this) "字符串很长" else "字符串不长" }
        .run { "[$this]" }
        .run { println(this) }
}


//isLong具名函数 返回boolean
fun isLong(str: String) = str.length > 5
//返回string
fun showText(isLong: Boolean) = if (isLong) "字符串很长" else "字符串不长"
//
fun mapText(getShow: String) = getShow