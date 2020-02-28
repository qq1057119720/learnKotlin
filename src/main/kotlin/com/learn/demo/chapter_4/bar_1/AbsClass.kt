package com.learn.demo.chapter_4.bar_1

/**
 * @author Lgx
 * @date 2020/2/20 5:44 下午
 * @content 抽象类的定义
 */
//固定写法 abstract class [类名称]
abstract class AbsClass {
    //抽象方法
    abstract fun absMethod()
    //可以被复写的方法
    open fun overridable(){

    }
    //不可以复写的方法
    fun nonOverridable(){

    }
}