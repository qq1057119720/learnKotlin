package com.learn.demo.chapter_3.bar_1

/**
 * ������������
 * @author Lgx
 * @date 2020/2/15 5:12 ����
 * @content
 */
class BaseType {
    /**
     * ��������
     */
    //�����ɶ�д����
    var b:String ="Hello Kotlin"
    //�����ɶ����� ����java��final
    val a:String ="HELLO KOTLIN"
    val a1=a
    //��Kotlin�п��Բ���������ֱ�����¶��壬���������Զ������Ƶ�
    var c=1
    var d="Hello"

    /**
     * ��ֵ����ת��
     */

    //������toLong()����ת���������Ǻǣ�
    val e:Int=10
    var f:Long=e.toLong()

    /**
     * �Ƚ�����
     */
    fun main(){
        //==�Ƚ����ݵ�ͬ��java��equal
        print(a==b)
        //===�Ƚ϶����Ƿ���ͬһ������
        print(a1===a)
    }

}