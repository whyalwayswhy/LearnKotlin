package com.example.learnkotlin.stage1
// TODO kotlin中的反引号函数名特点
fun main() {
    //第一种情况
    测试登录("why")

    //第三种情况
    //in和is在kotlin里面是关键字 在java里面是普通的函数 调用的话用反引号括起来
    //kt.`is`

    //第三种情况
    //混淆的map文件
}

private fun `测试登录`(name: String) {
    println("用户名是${name}")
}