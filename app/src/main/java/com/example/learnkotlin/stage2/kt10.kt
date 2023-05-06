package com.example.learnkotlin.stage2
//TODO 在函数中定义一个函数 即一个函数有一个参数是一个函数  替代Java中的接口内容 kotlin函数内联
fun main() {
    //第一种方式
    loginAPI("WHY","123") {msg: String, code: Int ->
        println("msg:$msg, code:$code")
    }
    //第二种方式 被不推荐
    loginAPI("why","123", {msg: String, code: Int ->
        println("msg:$msg, code:$code")
    })
    //第三种方式 指明responseResult==
    //感觉这种方式更友好 清楚
    loginAPI("TYY","123", responseResult = {msg: String, code: Int ->
        println("msg:$msg, code:$code")
    })
}
/**
 * 模拟数据库SQLServer
 */

const val USER_NAME = "WHY"
const val USER_PWD = "123"

//登录API
//使用了lambda作为参数后都需要声明成内联的形式
/**
 * 如果此函数不适用内联的话 在调用端会生成多个对象完成lambda调用造成性能的损耗
 * 使用内联 相当于C++里的 宏定义#define 会把代码替换到调用处 没有生成对象的性能损耗 减少函数开辟 对象开辟的损耗
 * @param userName String
 * @param userPwd String
 * @param responseResult Function2<String, Int, Unit>
 */
inline fun loginAPI(userName: String, userPwd: String, responseResult: (String, Int) -> Unit) {
    if (userName == null || userPwd == null) {
        TODO("用户名或密码为null") //Nothing类型
    }
    //做前端校验
    if (userName.length > 2 && userPwd.length > 2) {
        if (webServiceLoginAPI(userName,userPwd)) {
            //登录成功的返回处理
            responseResult("login success", 200)
        } else {
            //登录失败的逻辑处理
            responseResult("login fail", 400)
        }
    } else {
        TODO("用户名和密码不合格")
    }
}

//此函数没用使用lambda作为参数不需要声明成内联的形式
//否则使用了lambda作为参数后都需要声明成内联的形式
/**
 * 登录的API暴露者 服务器层面
 * @param name String
 * @param pwd String
 * @return Boolean
 */
 fun webServiceLoginAPI(name: String, pwd: String): Boolean {
    return name == USER_NAME && pwd == USER_PWD
}