package com.vsu.singleton_3;

/** ������
 * ��˽�й���������ö������ǿ��singleton����
 * singletonָ������ʵ����һ�ε��࣬singletonͨ��������������Щ������Ψһ��ϵͳ��������細�ڹ����������ļ�ϵͳ
 * Created by vsu on 2017/11/05.
 */


/**
 * @Author: vsu
 * @Descriptioon: 1.5��ǰ ��ʽһ  ��̬��Ա  ���ã����ܱ�֤ȫ��ֻ��һ������
 * @Date: 2017/11/05
 */
class Elvis1{
    public static final Elvis1 INSTANCE = new Elvis1();

    private Elvis1(){}

    public  void leaveTheBuilding(){
        System.out.println("Elvis1");
    }
}


/**
 * @Author: vsu
 * @Descriptioon: 1.5��ǰ ��ʽ��  ��̬����  ���ã����ܱ�֤ȫ��ֻ��һ������
 * @Date: 2017/11/05
 */
class Elvis2{
    public static final Elvis2 INSTANCE = new Elvis2();

    private Elvis2(){}

    //
    public static Elvis2 getInstance(){
        return INSTANCE;
    }

    public  void leaveTheBuilding(){
        System.out.println("Elvis2");
    }
}


/**
 * @Author: vsu
 * @Descriptioon: 1.5֮��  ��ʽ��  ��Ԫ��ö������
 * @Date: 2017/11/05
 */
enum Elvis3{
    INSTANCE;

    public void leaveTheBuilding(){
        System.out.println("Elvis3");
    }
}


public class ReadMe {

    public static void main(String[] args) {
        // 1
        Elvis1 elvis1 = Elvis1.INSTANCE;
        elvis1.leaveTheBuilding();

        // 2
        Elvis2 elvis2 = Elvis2.getInstance();
        elvis2.leaveTheBuilding();

        // 3
        Elvis3 elvis3 = Elvis3.INSTANCE;
        elvis3.leaveTheBuilding();
    }

}
