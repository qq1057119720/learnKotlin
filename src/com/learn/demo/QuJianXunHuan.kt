package com.learn.demo

fun main(args:Array<String>){

//    var nums=1..100

    var nums=1 until  100//µÈÓÚ[1,100)
    for (num in nums){
        print("${num},")
    }
}