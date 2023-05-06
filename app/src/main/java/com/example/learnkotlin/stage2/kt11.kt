package com.example.learnkotlin.stage2
//TODO kotlin的函数引用  函数类型的对象
fun main() {
    //lambda属于函数类型的对象
    //kotlin中调用函数类型的对象要使用双冒号 :: 把普通函数变成函数类型的对象
    val obj = ::methodResponseResult
    login("WHY", "123", ::methodResponseResult)

}

/**
 * 相当于这个函数对 下面的lambda表达式进行了实现
 * @param msg String
 * @param code Int
 */
fun methodResponseResult(msg: String, code: Int) {
    println("登录情况是：msg:$msg,code:$code")
}

inline fun login(name: String, pwd: String, responseResult: (String, Int) -> Unit) {
    if (USER_NAME == name && USER_PWD == pwd) {
        //登录成功的返回处理
        responseResult("login success", 200)
    } else {
        //登录失败的逻辑处理
        responseResult("login fail", 400)
    }
}