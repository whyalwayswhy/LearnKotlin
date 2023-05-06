package com.example.learnkotlin.stage2
//TODO kotlin函数的函数类型与隐式返回  函数参数的学习  it关键字 匿名函数的类型推断 lambda表达式
fun main() {

    //lambda表达式最后一行是用来返回的
    //匿名函数不用写return 最后一行就是用来return的

    //首先 函数输入输出的声明
    val methodAction : () -> String
    //然后 对上面的函数进行实现
    methodAction = {
        val inputValue = 111
        //匿名函数不用写return 默认最后一行为return
        "ok"
    }
    //最后 调用这个函数
    println(methodAction())

    /**
     * 因为是匿名函数 这里用val修饰 如果是具名函数 就是fun关键字了
     * 匿名函数有多个参数 要把它们全部写出来
     */
    //也可以一次性 用lambda表达式的形式写出来
    val methodAction1 : (Int, Int, Int) -> String = {num1, num2, num3 ->
        var a = num1 + num2 + num3
        "ok1"
    }
    //以下两者调用是等价的
    println(methodAction1.invoke(1,2,3))
    println(methodAction1(1,2,3))
    /**
     * 如果只有一个参数 不需要写 会自动添加一个it
     */
    val methodAction2 : (String) -> String = { "$it ok1" }
    //调用它
    println(methodAction2("why"))


    /**
     * 匿名函数 类型推断为String 不显示写出返回值
     * 如果有冒号:必须指定 参数类型 和返回类型
     * 如果这样写 变量名 = 类型推断返回类型
     */
    val method = {n1: Double, n2: Int, n3: Float ->
        "$n1$n2$n3"
    }// 推断返回类型为字符串
    println(method(1.1, 1, 1.1f))

    /**
     * 匿名函数其实就是lambda表达式
     */
    //num1 num2是lambda表达式的入参 返回值是lambda表达式的返回值
    val add = {num1: Int, num2: Int ->
        num1 + num2
    }

    val upCase = {str1: String ->
        str1.uppercase()
    }
    println(upCase("why"))

    //如果有多个返回类型的话 就返回Any类型



}