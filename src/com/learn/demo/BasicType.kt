package com.learn.demo
//变量的取值范围
fun main(a:Array<String>){
    val maxByte=Byte.MAX_VALUE
    val minByte=Byte.MIN_VALUE


    val maxInt=Int.MAX_VALUE
    val minInt=Int.MIN_VALUE


    val maxLong=Long.MAX_VALUE
    val minLong=Long.MIN_VALUE


    println("byte 的最大值："+maxByte+"\n"+
    "byte 的最小值："+minByte+"\n"
    +"int 的最大值："+maxInt+"\n"
    +"int 的最小值："+minInt+"\n"
            +"Long 的最大值："+maxLong+"\n"
    +"Long 的最小值："+minLong)

}
