package com.vsu.comparable_12;

/**第十二条
 * 考虑实现comparable接口
 * Created by vsu on 2017/11/14.
 */


import java.util.*;

/**
 * @Author: vsu
 * @Description: compareTo
 * @Date: 2017/11/14
 *
 * 一个类，如果实现了Comparable接口，我们可以很容易的将它在数组或是集合中进行排序。
 * comparaTo()方法传入该类的另外一个实例，返回一个int值，这个方法每执行一次都是对传入的对象和和本生对象进行比较。
 * 返回的int值如果是一个正值（不包括零）则在数组或是集合中交换两个实例的位置，否则位置保持不变。
 *
 * 为什么要考虑实现Comparable接口:
 *      实现了Comparable接口的类，可以很好的和集合类或是一些泛型算法很好的协作，你可以付出很小的代价实现强大的功能。
 *
 * 什么时候应该考虑是想Comparable接口
 *      你写的类是一个值类
 *      类中有很明显的内在排序关系，如字母排序、按数值顺序或是时间等。
 *      前面两者是并且关系
 *
 * 如何很好的实现Comparable接口
 *      满足对称性
 *      满足传递性
 *      建议comparaTo方法和equals()方法保持一致。即对象A.comparaTo(B)等于0，则建议A.equals(B)等于true。
 *      对于实现了Comparable接口的类，尽量不要继承它，而是采取复合的方式。
 */

public class ReadMe {

    public static class Test implements Comparable<Test>{

        private int age;
        private String name;

        public Test(int age, String name){
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Test o) {
            return this.age - o.age;
        }

        public String toString(){
            return age + " " + name;
        }

        public static void main(String[] args) {

            List<Test> list = new ArrayList<>(Arrays.asList(
                    new Test(2, "qwe"),
                    new Test(3, "werq"),
                    new Test(1, "afwr")));

            Collections.sort(list);
            System.out.println(list);//[1 afwr, 2 qwe, 3 werq]
            System.out.println();

            Test[] array = new Test[]{new Test(7, "wrrw"),
                                        new Test(9, "safd"),
                                         new Test(8, "wrwqr")};
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));//[7 wrrw, 8 wrwqr, 9 safd]
        }
    }
}
