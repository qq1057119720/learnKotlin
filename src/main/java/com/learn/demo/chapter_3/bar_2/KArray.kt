package com.learn.demo.chapter_3.bar_2

/**
 * ����
 * @author Lgx
 * @date 2020/2/15 5:26 ����
 * @content
 */
class KArray {
    /**
     * ��������
     */
}
fun main(){
    val array1= intArrayOf(1,2,3)
    val array2=IntArray(4){it}
    array1.size
    val array3= arrayOf("Hello","World")

    println(array3[0]+array3[1])

    //�������
    for (element in array3){
        println(element)
    }
    //����ʽ
    array3.forEach { element-> println(element) }

    //�ж�Ԫ���Ƿ��������������
    if(1 in array1){
        println("1 in array1")
    } 
    //�ж�Ԫ�ز���������������
    if (4 !in array1){
        println("4 not in array1")
    }

}