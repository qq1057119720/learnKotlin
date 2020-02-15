package com.learn.demo

fun main(args:Array<String>){
    println(add(3,2))

    var i={x:Int,y:Int->x+y}
    println(i(2,4))

    var j:(Int,Int)->Int={x,y ->x+y}
    println(j(2,4))

}

/**
 * 我是反感这样去写函数，
 * 慢着，函数……
 * 这tm是面向对象
 * 哪来的函数
 *
 */
fun add(x:Int,y:Int):Int=x+y