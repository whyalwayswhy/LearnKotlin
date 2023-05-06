package com.example.learnkotlin.stage4
//TODO 定义类与field关键字  计算属性与防范竞态条件
/**
 * 成员变量会编辑为属性
 * @property name String
 * @property info String
 * @property value String
 */
class Kt31 {
    var name = "why"
    /**
     *上面这行代码背后做的事情
     * @NotNull
     * private String name = "why";
     * 会自动生成一个setName()方法 调用Kt31.name时候就调用这个setName()方法
     * public void setName(String name) {
     *    this.name = name;
     * }
     *
     */

    var info = "why love ty"
        get() = field.capitalize()
        //field 相当于java中的 this.属性 表示当前字段的意思
        set(value) {
            field = "[$value]"
        }

    var value = "abc"
        //默认存在的代码 不写也有 写了之后知识覆盖
        get() = field
        set(value)  {
            field = value
        }
    //设置成val属性的 不会给其设置set函数 所以无法更改
    val number: Int = 0

    //属于计算属性
    val num: Int
        get() = (1..100).shuffled().first() //从1到100取出第一个随机值

    //防范竞态条件  当你调用这个成员时 这个成员可能为null也靠嫩恶搞为空时 必须采用防范竞态条件
    var msg: String? = null
        get() = field?.also {
            "msg内容是:$it"
        } ?: "null,请检查代码"



}

fun main() {
    Kt31().name = "ty"
    println(Kt31().name)
    var temp = Kt31()
    temp.info = "love"
    //重写了set方法后 可以看到打印出来的结果不太一样了
    println(temp.info)
    println(temp.msg)
}

