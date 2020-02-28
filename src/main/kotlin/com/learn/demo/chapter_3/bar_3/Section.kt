package com.learn.demo.chapter_3.bar_3

/**
 *
 * @author Lgx
 * @date 2020/2/16 3:55 下午
 * @content 区间
 *
 *
 */
class Section {
}

fun main() {
    /**
     * 闭区间
     */
    //[1,10]
    var intRange: IntRange = 1..10
    //['a','z']
    var stringRange: CharRange = 'a'..'z'
    var longRange: LongRange = 1L..100L

    //不可数区间
    var floatRange = 1f..2f

    /**
     * 开区间
     */
    //[1,10)
    var intRangeExclusive = 1 until 10
    /**
     * 倒闭区间
     */
    //[10,1]
    var intRangeReverse = 10 downTo 1
    var stringRangeReverse = 'z' downTo 'a'
    /**
     * 区间步长
     */
//    [1,3,5...9]
    var intRangeWithStep = 1..10 step 2

    //区间包含关系
    if (1 in intRange){
        println(" 包含")
    }
    if (2 !in intRange){
        print("不包含")
    }
    //循环打印
    intRange.forEach { i-> println(i) }
    for (i in intRange){
        println(i)
    }
    //
    var array= intArrayOf(1,3,5,7)
    //遍历索引区间
    for (i in array.indices){
        println(array[i])
    }






}