package com.learn.demo.chapter_3.bar_5

/**
 * @author Lgx
 * @date 2020/2/16 4:30 ����
 * @content ����
 * fun ������(����������������)������ֵ����{
������

}
ע�⣺����ֵ���Ϳ���Ϊ��  ���У�Unit ����û�з���ֵ ���Բ�д

����ʽ������������ݵ�ҵ��Ԫ
 */
class LFunction {
    fun test(arg:Int,name:String):Unit{

    }
}
//����
fun test(arg:Int,name:String):Unit{

}

/**
 * �䳤����
 */
fun varargTest(vararg name:String){
    for (n in name){
        println(n)
    }
}

/**
 * �෵��ֵ
 * ������������Ǻ�
 *
 */
fun multiReturnValues():Triple<Int,Int,Int>{
    return Triple(1,1,1)
}
fun main(){
    //��������
    var x:(Int,String)->Unit=::test
    var y:LFunction.(Int,String)->Unit=LFunction::test
    varargTest("1","2","3")
}