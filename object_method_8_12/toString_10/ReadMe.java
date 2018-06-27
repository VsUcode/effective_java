package com.vsu.toString_10;

/** 第十条
 * 覆盖toString
 * Created by vsu on 2017/11/12.
 */
public class ReadMe {

    /**
     * @Author: vsu
     * @Description: 不覆盖tostring
     * @Date: 2017/11/12
     */
    public static class A{

        private String name;
        private int age;

        public A(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void show(){
            System.out.println(name + age);
        }
    }


    /**
     * @Author: vsu
     * @Description: 覆盖tostring
     * @Date: 2017/11/12
     */
    public static class B{

        private String name;
        private int age;

        public B(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String toString(){
            return "[name: " + name + ", age: " + age + "]";
        }
    }


    public static class Test{

        public static void main(String[] args) {
            System.out.println(new A("qqq", 12));
            //com.vsu.toString_10.ReadMe_r$A@4554617c

            new A("aa", 13).show();
            //aa12

            System.out.println(new B("qqq", 12));
            //[name: qqq, age: 12]
        }
    }
}
