package com.example.learnkotlin.stage4

// TODO 主构造函数里定义属性 (更通用的方法！)
// TODO 次构造函数
//可以直接使用 一步到位
class Kt33(var name: String) {

    init {
        //写在init里的函数 次构造函数工作的时候也会调用
        println("调用了主构造函数生成对象")
    }

    //这样主动定义一个 无参构造函数 进行类的无参构造时就不会报错了
    constructor():this("") {

    }

    //次构造函数必须要调用主构造函数 否则会不通过 因为需要主构造统一管理次构造
    constructor(name: String, age: Int, msg: String): this(name) {
        println("次构造函数必须要调用主构造函数$name+$age+$msg")
    }


}

fun main() {
//    val m = Kt33() 这时候空构造函数会报错
//    因为有了次构造方法 会覆盖原来生成的默认构造方法 所以不能使用无参构造了
    /**
     * 给构造函数默认值后 又可以无参调用了 真是神奇
     */
    val m = Kt33()
    val p = Kt33("why")
//    println(p.toString())
    //调用次构造函数了 所以有输出
    val p1 = Kt33("why",12,"ty")
}