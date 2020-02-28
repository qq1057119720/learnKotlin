package com.learn.demo.chapter_3.bar_6

import java.lang.Exception

/**
 * @author Lgx
 * @date 2020/2/16 5:44 下午
 * @content
 */
class Arithmometer {
}
fun main(args:Array<String>){
    if (args.size<3){
        showHelp()
        return
    }
    var operatorMap= mapOf(
            "+" to ::addition,
            "-" to ::subtraction,
            "*" to ::multiplication,
            "/" to ::division

    )

    var op=args[1]

    val opFuns=operatorMap[op]?:return showHelp()

    println("Input:"+args.joinToString())

   try {
       println("Output:"+opFuns(args[0].toInt(),args[2].toInt()))
   }catch (e:Exception){
       println("非法参数")
   }


}
fun addition( arg0:Int, arg1:Int):Int{
    return  arg0+arg1
}

fun subtraction( arg0:Int, arg1:Int):Int{
    return  arg0-arg1
}
fun multiplication( arg0:Int, arg1:Int):Int{
    return  arg0*arg1
}
fun division( arg0:Int, arg1:Int):Int{
    return  arg0/arg1
}

fun  showHelp(){
    println("""
        示例：
        input：3*4
        output：12
    """.trimIndent())
}