package com.learn.demo.chapter_4.bar_2

/**
 * @author Lgx
 * @date 2020/2/21 5:26 下午
 * @content 扩展类
 */
class ExSimple (var name:String,var age:Int){

}

/**
 * 扩展函数

扩展函数可以在已有类中添加新的方法，不会对原类做修改，扩展函数定义形式：

fun receiverType.functionName(params){
body
}

receiverType：表示函数的接收者，也就是函数扩展的对象
functionName：扩展函数的名称
params：扩展函数的参数，可以为NULL
 例如

 */
fun ExSimple.printMsg(){
    print(name+"--")
}

fun ExSimple.printMsg(school:String){
    print("$name $school")
}

fun  main(){
    var exSimple=ExSimple("小芳",21)
    print(exSimple.printMsg("北京大学"))
}