package com.example.learnkotlin.stage1

fun main() {
    val number = 148

    //range 范围 从那里到哪里
    //kotlin的if是表达式 有返回值的
    if (number in 10..59) {
        println("不及格")
    } else if (number in 0..9) {
        println("不及格且分数很差")
    } else if (number !in 60..100) {
        println("成绩非法")
    }else {
        println("成绩及格")
    }

    //when语句也是表达式 功能强大的switch
    //Any是Java中的Object类型  Unit是个类 无返回类型 代替了Java中的void关键字

}