package com.example.learnkotlin.stage4

// TODO 可变map集合
fun main() {
    val map = mutableMapOf("why" to 1, "ty" to 2)
    map += "yy" to 3
    println(map)
    map -= "yy"
    println(map)
    map.put("yy",3) //与[]是等价的
    map["yy"] = 4 //更改元素
    println(map)

    //getOrPut 方法 如果map中没有相应的元素就将其添加进去{}后面的是对应的key 再获取它的key
    val temp = map.getOrPut("wyp" ) {5}
    println(temp)
    println(map)
    //如果是有的情况 则直接拿到对应键值对的值
    println(map.getOrPut("why") {2})
}