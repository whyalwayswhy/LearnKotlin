package com.example.learnkotlin.stage4

class A(var name: String) {

    constructor() : this("default"){

    }



}

fun main() {
    val a = A()
    println(a.name)
}