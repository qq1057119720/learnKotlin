package com.learn.demo

import java.util.*

fun main(args:Array<String>){
    var lists= listOf<String>("鸡蛋","大米","冰淇淋")
    for ((i,e) in lists.withIndex()){
        println("$i  $e")

    }
    var lists2= arrayListOf<String>();
    lists2.add("awhwoi")
    lists2.add("2nwskjhs")
    for ((i,e) in lists2.withIndex()){
        println("$i  $e")

    }
    var map1=TreeMap<String,String >()
    map1.put("wiuwu","wwiowjio")
    map1.put("wiuwu","wwiowjio")
    map1.put("wiuwu","wwiowjio")
    map1.put("wiuwu","wwiowjio")

    map1["ajai"]="wwwww"
    println(map1["ajai"])

}