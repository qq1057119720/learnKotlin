package com.learn.demo.chapter_4.bar_3

/**
 * @author Lgx
 * @date 2020/2/28 4:37 下午
 * @content 空类型安全
 */
class  NullType{

}

fun main() {
    //定义一个可空的类型
    var nullable:String?="hello"
    //强制转换不可空，不建议使用
    var lenth=nullable!!.length
    //正常使用方式 ?:elvis 表达式，表示如果前面不成立则为后面，类似java 三目运算法
    var lenth1:Int=nullable?.length?:0

    //String 是String?的子类
    //通过里氏替换原则可以得出这个结论
    var a:String="hehe"
    var b:String?="haha"
    //type mismatch
//    a=b
    b=a


}