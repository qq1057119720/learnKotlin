package com.learn.demo

import java.io.IOException
import java.lang.Exception

fun main(a:Array<String>){
    println("请输入第一个数字")
    var num1String= readLine()
    println("请输入第二个数字")
    var num2String= readLine()
    var num1=num1String!!.toInt()
    var num2=num2String!!.toInt()
    println("${num1}+${num2}="+(num1+num2))
    try {

    }catch (e:Exception){

    }finally {

    }

}