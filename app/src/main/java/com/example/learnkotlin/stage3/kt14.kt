package com.example.learnkotlin.stage3

import android.app.Activity

//TODO kotlin中的substring  split分隔符操作  replace替换操作

const val INFO = "why love i and you"
//不需要导包是因为有默认导入的包
fun main() {
    var activity: Activity = Activity()  //引入Activity就导入了一个包
    var list1 = mutableListOf<String>()
    //获取第一个'i'出现的下标
    val indexOf = INFO.indexOf('i')
    //以下两种写法等价
    println(INFO.substring(0, indexOf))
    println(INFO.substring(0 until indexOf))//kotlin一般用这种方法

    val jsonText = "why,ty,yy"
    //list自动类型推断成 list == List<String>
    val list = jsonText.split(",")
    println("分割后的集合为$list")
    //解构
    val (v1, v2, v3) = list
    println("解构后的元素为$v1")

    val pwd = "ABCDFEALJGLSJKGLWGJWEKJ"
    println("加密前的密码是：$pwd")
    //加密操作 把字符替换成数字
    val newPwd = pwd.replace(Regex("[AKMN]")){
        when(it.value) {
            //拿到每一个字符
            "A" -> "9"
            "K" -> "8"
            "M" -> "7"
            "N" -> "6"
            else -> it.value
        }
    }
    println("加密后的密码是:$newPwd")

    //进行解密
    val oldPwd = newPwd.replace(Regex("[9876]")){
        when(it.value) {
            "9" -> "A"
            "8" -> "K"
            "7" -> "M"
            "6" -> "N"
            else -> it.value
        }
    }
    println("解密后的密码是：$oldPwd")

}