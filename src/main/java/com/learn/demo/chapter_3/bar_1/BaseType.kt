package com.learn.demo.chapter_3.bar_1

/**
 * 基本数据类型
 * @author Lgx
 * @date 2020/2/15 5:12 下午
 * @content
 */
class BaseType {
    /**
     * 声明变量
     */
    //声明可读写变量
    var b:String ="Hello Kotlin"
    //声明可读变量 类似java中final
    val a:String ="HELLO KOTLIN"
    val a1=a
    //在Kotlin中可以不声明类型直接如下定义，编译器会自动类型推导
    var c=1
    var d="Hello"

    /**
     * 数值类型转换
     */

    //必须用toLong()才能转换……（呵呵）
    val e:Int=10
    var f:Long=e.toLong()

    /**
     * 比较内容
     */
    fun main(){
        //==比较内容等同于java的equal
        print(a==b)
        //===比较对象是否是同一个对象
        print(a1===a)
    }

}