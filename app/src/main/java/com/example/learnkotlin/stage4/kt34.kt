package com.example.learnkotlin.stage4
//TODO 构造函数中的默认参数
class Kt34(var name: String = "why") {

    init {
        //写在init里的函数 次构造函数工作的时候也会调用
        println("调用了主构造函数生成对象")
    }

    //次构造函数必须要调用主构造函数 否则会不通过 因为需要主构造统一管理次构造
    constructor(name: String = "why", age: Int = 12, msg: String = "ty"): this(name) {
        println("次构造函数必须要调用主构造函数$name+$age+$msg")
    }
}

fun main() {
    // 优先调用主构造函数
    val p = Kt34()
}