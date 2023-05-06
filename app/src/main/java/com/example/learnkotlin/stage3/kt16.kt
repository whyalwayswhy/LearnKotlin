package com.example.learnkotlin.stage3

import java.io.File

//TODO apply内置函数
/**
 * apply返回的永远是调用者本身 里面this是其本身
 */
fun main() {
    val info = "Wang Haoyu"
    //普通的方式
    println("info字符串的长度是:${info.length}")
    println("info字符串最后一个字母是:${info[info.length-1]}")
    println("info字符串全部转成小写是:${info.lowercase()}")

    println("------------------")
    //使用apply内置函数的方式完成
    /**
     * apply 始终返回info本身
     */
    val infoNew: String = info.apply {
        //大部分情况下 匿名函数都会持有一个it，但是apply函数不会持有it 持有当前的this == info本身
        println("apply匿名函数里面打印的:$this")
        println("apply中info字符串的长度是:${length}")
        println("apply中info字符串最后一个字母是:${this[length-1]}")
        println("apply中info字符串全部转成小写是:${lowercase()}")
    }
    println("-----------")
    println(infoNew)

    /**
     * apply函数的写法用途如下：
     * info.apply特点：apply函数始终返回"info本身！！！"，所以可以链式调用
     */
    info.apply {
        println(this.length)
    }.apply {
        println(this[length-1])
    }.apply {
        println(this.lowercase())
    }

    //apply应用例子
    val file = File("D:\\a.txt")
    //普通写法
    file.setExecutable(true)
    file.setReadable(true)
    println(file.readLines())

    //apply写法
    file.apply {
        setExecutable(true)
    }.apply {
        setReadable(true)
    }.apply {
        println(file.readLines())
    }

}