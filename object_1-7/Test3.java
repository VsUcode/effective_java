package com.vsu.singleton_3;

/** 第三条
 * 用私有构造器或者枚举类型强化singleton属性
 * singleton指仅仅被实例化一次的类，singleton通常被用来代表那些本质上唯一的系统组件，比如窗口管理器或者文件系统
 * Created by vsu on 2017/11/05.
 */


/**
 * @Author: vsu
 * @Descriptioon: 1.5以前 方式一  静态成员  不好，不能保证全局只有一个对象
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
 * @Descriptioon: 1.5以前 方式二  静态工厂  不好，不能保证全局只有一个对象
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
 * @Descriptioon: 1.5之后  方式三  单元素枚举类型
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
