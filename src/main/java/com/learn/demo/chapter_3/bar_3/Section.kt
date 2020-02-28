package com.learn.demo.chapter_3.bar_3

/**
 *
 * @author Lgx
 * @date 2020/2/16 3:55 ����
 * @content ����
 *
 *
 */
class Section {
}

fun main() {
    /**
     * ������
     */
    //[1,10]
    var intRange: IntRange = 1..10
    //['a','z']
    var stringRange: CharRange = 'a'..'z'
    var longRange: LongRange = 1L..100L

    //����������
    var floatRange = 1f..2f

    /**
     * ������
     */
    //[1,10)
    var intRangeExclusive = 1 until 10
    /**
     * ��������
     */
    //[10,1]
    var intRangeReverse = 10 downTo 1
    var stringRangeReverse = 'z' downTo 'a'
    /**
     * ���䲽��
     */
//    [1,3,5...9]
    var intRangeWithStep = 1..10 step 2

    //���������ϵ
    if (1 in intRange){
        println(" ����")
    }
    if (2 !in intRange){
        print("������")
    }
    //ѭ����ӡ
    intRange.forEach { i-> println(i) }
    for (i in intRange){
        println(i)
    }
    //
    var array= intArrayOf(1,3,5,7)
    //������������
    for (i in array.indices){
        println(array[i])
    }






}