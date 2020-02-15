package com.learn.demo

fun main(args: Array<String>) {
    println(muban("中山公园","人民大会堂"))
    heat("aa")
}
//字符串模板${对象名称}
fun muban(name:String,name2:String):String{
    var temple="""
        今天天气清凉，万里无云，我们去${name}${name2}游玩，
        首先映入眼帘的是，${name}${name.length}个鎏金大字.

        """
    return temple
}
//后面加问号标识传递的参数可以
fun heat(s:String?){
    //定义一个数组
    var ints=1..99 //表示闭区间
    //开区间前闭后开
    var ints2=1 until 100//
  when(s){
      "aa"-> println("你好世界")
  }
}