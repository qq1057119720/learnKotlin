package com.learn.demo.chapter_3.bar_5

/**
 * @author Lgx
 * @date 2020/2/16 4:30 下午
 * @content 函数
 * fun 函数名(参数名：参数类型)：返回值类型{
函数体

}
注意：返回值类型可以为空  其中：Unit 代表没有返回值 可以不写

函数式计算机处理数据的业务单元
 */
class LFunction {
    fun test(arg:Int,name:String):Unit{

    }
}
//函数
fun test(arg:Int,name:String):Unit{

}

/**
 * 变长参数
 */
fun varargTest(vararg name:String){
    for (n in name){
        println(n)
    }
}

/**
 * 多返回值
 * 这个东西……呵呵
 *
 */
fun multiReturnValues():Triple<Int,Int,Int>{
    return Triple(1,1,1)
}
fun main(){
    //函数引用
    var x:(Int,String)->Unit=::test
    var y:LFunction.(Int,String)->Unit=LFunction::test
    varargTest("1","2","3")
}