package com.learn.demo.chapter_4.bar_1

/**
 * @author Lgx
 * @date 2020/2/17 4:43 下午
 * @content 类
 */
//class SimpleClass(var x:Int) {
//}
//类实现接口的方式是 [类名称]:[接口名称]
//类继承抽象类的方式是[类名称]:[抽象类构造器]
class SimpleClass :SimpleInf,AbsClass(){
    //kotlin中属性必须给初始值

    /**
     * 在kotlin中属性是property
     * 包括了java中属性以及属性(filed)的get，set方法
     *
     * 等价于java的
     * String x;
     * String getX(){
     *  return x;
     * }
     * void getX(String x){
     * this.x=x
     * }
     */
    var age:Int=0
    var name:String=""
    //固定的实现写法
    override fun simpleMethod() {

    }

    override fun absMethod() {

    }
}

fun main(){
    /**
     * 属性的引用
     */
    var simpleAge=SimpleClass::age
    var simpleClass=SimpleClass()

    var simpleName=simpleClass::name

    simpleName.set("张三")
    simpleAge.set(simpleClass,10)

    println(simpleName.name+"----"+simpleAge.get(simpleClass))

}