package com.example.learnkotlin.stage1

fun main() {
    method1(24,"why")
    //赋值的话会覆盖
    action1("ty",24)
    action1("ty")
    //调用具名函数赋值的时候
    loginAction(age = 11, phoneNumber = "1123", userPwd = "123", userName = "why")
}

/**
 * 函数默认都是public
 * 现有输入再有输出
 */
private fun method1(age: Int, name: String) : Int {
    println("你的姓名是${name}年龄是${age}")
    return 1
}

/**
 * kotlin函数可以给默认值
 * @param name String
 * @param age Int 这里设置了默认值为77
 */
private fun action1(name: String, age: Int = 77) {
    println("你的姓名是${name}年龄是${age}")
}

/**
 * kotlin里面的具名函数
 * @param userName String
 * @param userPwd String
 * @param phoneNumber String
 * @param age Int
 */
private fun loginAction(userName: String, userPwd: String, phoneNumber: String, age: Int) {
    println("userName:${userName};userPwd:${userPwd};phoneNumber:${phoneNumber}:;age:${age};")
}