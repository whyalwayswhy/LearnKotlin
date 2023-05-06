package com.example.learnkotlin.stage1

fun main() {
    show(-1)
}

/**
 * Unit是一个单例类 相当于Java中的void
 * @return Unit
 */
private fun doWork() : Unit {

}


private fun show(number: Int) {
    when(number) {
        //不是注释提示  是Nothing类型
        -1 -> TODO("没有这个分数")
        in 0..59 -> println("不及格")
        in 60..100 -> println("及格")

    }
}