package com.learn.demo

fun main(args: Array<String>) {
    println(checkAge(9))
    saveLog(1)
}

fun jia(a: Int,b:Int):Int{
    return a+b
}

fun jian(a: Int,b:Int):Int{
    return a-b
}
fun cheng(a: Int,b:Int):Int{
    return a*b
}
fun chu(a:Int,b:Int):Int{
    if (b==0){
        return 0
    }else{
        return a/b
    }
}
fun sayHello(name:String):String{
    return "你好："+name
}
fun checkAge(age:Int):Boolean{
    if (age>0&&age<18){
        return false
    }else{
        return true
    }
}
fun saveLog(logLevel:Int){
    if (logLevel==1){
        println("打印日志")
    }
}