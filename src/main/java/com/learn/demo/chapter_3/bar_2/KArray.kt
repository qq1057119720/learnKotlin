package com.learn.demo.chapter_3.bar_2

/**
 * 数组
 * @author Lgx
 * @date 2020/2/15 5:26 下午
 * @content
 */
class KArray {
    /**
     * 创建数组
     */
}
fun main(){
    val array1= intArrayOf(1,2,3)
    val array2=IntArray(4){it}
    array1.size
    val array3= arrayOf("Hello","World")

    println(array3[0]+array3[1])

    //数组遍历
    for (element in array3){
        println(element)
    }
    //函数式
    array3.forEach { element-> println(element) }

    //判断元素是否包含在数组里面
    if(1 in array1){
        println("1 in array1")
    } 
    //判断元素不包含在数组里面
    if (4 !in array1){
        println("4 not in array1")
    }

}