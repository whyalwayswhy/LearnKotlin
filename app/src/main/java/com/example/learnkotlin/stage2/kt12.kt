package com.example.learnkotlin.stage2
//TODO kotlin函数类型作为返回类型  匿名函数与具名函数
fun main() {

    val r = show("why")
    //获取到这个匿名函数
    val noNameMethod = show1("show")
    //再去调用匿名函数
    println(noNameMethod("why",11))

    //匿名函数
    showInfo("why",24) {
        //这里就是匿名函数 只有一个参数的时候使用it
        println("$it")
    }

    //具名函数
    showInfo("ty", 25, ::showInfoImpl)

}

fun show(info: String): String {
    return info
}

/**
 * 返回值是一个匿名函数
 * @param info String
 * @return (String, Int) -> String
 */
fun show1(info: String): (String, Int) -> String {
    return { name: String, age: Int ->
        "${name}返回了一个匿名函数$age"
    }
}

inline fun showInfo(name: String, age: Int, showResult: (String) -> Unit) {
    val str = "匿名显示：name:$name,age:$age"
    showResult(str)
}

fun showInfoImpl(result: String) {
    println("具名显示：$result")
}