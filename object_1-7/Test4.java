package com.vsu.utility_class_4;

/** 第四条
 * 通过私有构造器强化不可实例化的能力
 * Created by vsu on 2017/11/06.
 */


/**
 * @Author: vsu
 * @Descriptioon: 有时候，你可能需要编写只包含静态方法和静态域的类，直接使用，不希望被实例化
 *                 企图做成抽象类来强制该类不可实例化是行不通的，可以被继承
 *                 因此只需要让这个类包含私有构造器
 * @Date: 2017/11/06
 */
class UtilityClass{

    private UtilityClass(){
        //添加 throw new AssertionError()，是避免在UtilityClass实例化UtilityClass类。
        throw new AssertionError();
    }


    //示例  1
    public static UtilityClass getInstance(){
        return new UtilityClass();
    }
    /* 报错
    Exception in thread "main" java.lang.AssertionError
    at com.vsu.utility_class_4.UtilityClass.<init>(ReadMe_r.java:20)
    at com.vsu.utility_class_4.UtilityClass.getInstance(ReadMe_r.java:26)
    at com.vsu.utility_class_4.ReadMe_r.main(ReadMe_r.java:36)
    */
}

// 示例 2 直接避免继承
//class SubUtilityClass extends UtilityClass{
//
//}


public class ReadMe {

    public static void main(String[] args) {
        UtilityClass utilityClass = UtilityClass.getInstance();
    }
}
