package com.learn.demo

fun main(args:Array<String>){
    println(add(3,2))

    var i={x:Int,y:Int->x+y}
    println(i(2,4))

    var j:(Int,Int)->Int={x,y ->x+y}
    println(j(2,4))

}

/**
 * ���Ƿ�������ȥд������
 * ���ţ���������
 * ��tm���������
 * �����ĺ���
 *
 */
fun add(x:Int,y:Int):Int=x+y