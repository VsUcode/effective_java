package com.vsu.utility_class_4;

/** ������
 * ͨ��˽�й�����ǿ������ʵ����������
 * Created by vsu on 2017/11/06.
 */


/**
 * @Author: vsu
 * @Descriptioon: ��ʱ���������Ҫ��дֻ������̬�����;�̬����ֱ࣬��ʹ�ã���ϣ����ʵ����
 *                 ��ͼ���ɳ�������ǿ�Ƹ��಻��ʵ�������в�ͨ�ģ����Ա��̳�
 *                 ���ֻ��Ҫ����������˽�й�����
 * @Date: 2017/11/06
 */
class UtilityClass{

    private UtilityClass(){
        //��� throw new AssertionError()���Ǳ�����UtilityClassʵ����UtilityClass�ࡣ
        throw new AssertionError();
    }


    //ʾ��  1
    public static UtilityClass getInstance(){
        return new UtilityClass();
    }
    /* ����
    Exception in thread "main" java.lang.AssertionError
    at com.vsu.utility_class_4.UtilityClass.<init>(ReadMe_r.java:20)
    at com.vsu.utility_class_4.UtilityClass.getInstance(ReadMe_r.java:26)
    at com.vsu.utility_class_4.ReadMe_r.main(ReadMe_r.java:36)
    */
}

// ʾ�� 2 ֱ�ӱ���̳�
//class SubUtilityClass extends UtilityClass{
//
//}


public class ReadMe {

    public static void main(String[] args) {
        UtilityClass utilityClass = UtilityClass.getInstance();
    }
}
