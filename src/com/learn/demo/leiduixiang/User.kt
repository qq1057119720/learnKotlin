package com.learn.demo.leiduixiang

class User {
    var name: String = ""
        get
        set
    var sex: Int = 0
        get
        set
    constructor(name:String){
        this.name=name

    }
    constructor(name: String,sex:Int){
        this.name=name
        this.sex=sex
    }

    fun toStrings(){
        println("name:"+name)
    }
    fun getUserSex():Int{
        return sex;
    }

}
fun main(a:Array<String>){
    var user=User("张三")
    user.toStrings()
    var user2=User("李四",12)
    println("user的年龄是："+user2.sex)
}