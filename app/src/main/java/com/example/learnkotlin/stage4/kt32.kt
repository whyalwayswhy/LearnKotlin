package com.example.learnkotlin.stage4
// TODO kotlin构造函数的学习

//主构造函数 以下划线来开头命名
//下划线的变量都是输入的临时数据，需要接收下来 成为变量才能用
//需要二次转换接收
class Kt32(_name: String, _age: Int, _msg: String) {

    var name = _name
        get() = field
        private set(value) {
            field = value
        }

    val age = _age
        get() = if (field < 0) -1 else field

    val msg = _msg

    fun show() {
        println(name)
        println(age)
        println(msg)
    }
}

fun main() {
    var temp = Kt32(_name = "why", _age = 12, _msg = "msg")
    println(temp.name)
//    temp.name = "aaa" 被私有化了无法调用
    temp.show()

}

