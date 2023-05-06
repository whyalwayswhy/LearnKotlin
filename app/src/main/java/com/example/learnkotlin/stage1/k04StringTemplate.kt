package com.example.learnkotlin.stage1

//字符串模板 不需要写加号
fun main() {
    val garden = "公园"
    val time = 6

    println("今天去${garden}去玩了${time}个小时")

    //kotlin的if是表达式 使用更加灵活
    val isLogin = true
    println("服务器响应：${if (isLogin) "登录成功" else "登录失败"}")
}