package com.learn.demo.chapter_3.bar_4

/**
 * @author Lgx
 * @date 2020/2/16 4:09 ����
 * @content ���Ͽ��
 */
class Collection {
}

fun main(){
    //���ɱ�list
    var intList= listOf<Int>(1,2,3)
    //�ɱ�list
    var intMutableList= mutableListOf<Int>()
    intMutableList.add(1)

//    intMutableList +=1


    //���ɱ�map
    var intMap= mapOf<Int,Int>(1 to 2,1 to 2)
    var intMutableMap= mutableMapOf<Int,String>()
    intMutableMap.put(1,"10")

    //ֱ��ʹ��arraylist
    var arraylist= arrayListOf<Int>()
    //�������
    arraylist.add(1)
    //��ȡ����
    arraylist.get(1)
    arraylist[0]
    //ֱ��ʹ��map
    var hashmap= hashMapOf<String,Any>()
    //���MapԪ��
    hashmap.put("1","1")
    //��дmapԪ��
    hashmap.get("1")
    hashmap["1"]

    //Pair





}