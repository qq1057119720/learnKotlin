package com.learn.demo.chapter_3.bar_4

/**
 * @author Lgx
 * @date 2020/2/16 4:09 下午
 * @content 集合框架
 */
class Collection {
}

fun main(){
    //不可变list
    var intList= listOf<Int>(1,2,3)
    //可变list
    var intMutableList= mutableListOf<Int>()
    intMutableList.add(1)

//    intMutableList +=1


    //不可变map
    var intMap= mapOf<Int,Int>(1 to 2,1 to 2)
    var intMutableMap= mutableMapOf<Int,String>()
    intMutableMap.put(1,"10")

    //直接使用arraylist
    var arraylist= arrayListOf<Int>()
    //添加数据
    arraylist.add(1)
    //读取数据
    arraylist.get(1)
    arraylist[0]
    //直接使用map
    var hashmap= hashMapOf<String,Any>()
    //添加Map元素
    hashmap.put("1","1")
    //读写map元素
    hashmap.get("1")
    hashmap["1"]

    //Pair





}