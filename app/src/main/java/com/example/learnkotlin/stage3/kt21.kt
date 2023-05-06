package com.example.learnkotlin.stage3
//TODO takeIf内置函数  takeUnless函数
fun main() {
    val result = checkPermissionAction("why","123")
    println(result)

    //takeUnless和takeIf效果相反  经常和isNullOrBlank() 与?: 一起使用

}

//前端
fun checkPermissionAction(name: String, pwd: String): String {
    // takeIf 函数如果内部的是true就会返回调用者本身 如果是false就会返回null
    //takeIf + 空合并操作符
    return name.takeIf { permissionSystem(name,pwd) } ?: "权限不够"
}


// 权限系统
private fun permissionSystem(name: String, pwd: String): Boolean {
    return name == "root" && pwd == "123"
}