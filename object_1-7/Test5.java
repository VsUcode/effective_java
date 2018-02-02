package com.vsu.avoid_needless_object_5;

/**第五条
 * 避免创建不必要的对象
 * Created by vsu on 2017/11/07.
 */



/**
 * @Author: vsu
 * @Descriptioon: 1 一般来说，最好能重用对象而不是在每次需要的时候就创建一个相同功能的新对象。重用方式既快速，又流行。如果对象是不可变的，它就始终可以被重用
 * @Date: 2017/11/07
 *
 *  反例： String s = new String("aaa");
 * 正例：  String s = "aaa";
 */


/**
 * @Author: vsu
 * @Descriptioon: 2 对于同时提供了静态工厂方法和构造器的不可变类，通常选前者，以避免创建不必要对象
 * @Date: 2017/11/07
 */
class Test1{
    public static void main(String[] args) {
        //使用构造器
        Integer a1 = new Integer(1);
        Integer a2 = new Integer(1);

        //使用静态工厂方法
        Integer a3 = Integer.valueOf(2);
        Integer a4 = Integer.valueOf(2);

        System.out.println(a1 == a2); //false
        System.out.println(a3 == a4); //true
    }
}


/**
 * @Author: vsu
 * @Descriptioon: 3 除了重用不可变的对象之外，也可以重用那些已知不会修改的可变对象。
 * @Date: 2017/11/07
 */

/* 反例
class DBUtilBad {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/imooc";
    private static final String UNAME = "root";
    private static final String PWD = "root";
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // 1.加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获得数据库的连接
            conn = DriverManager.getConnection(URL, UNAME, PWD);
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return conn;
    }
}

//正例
class DBUtilBad {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/imooc";
    private static final String UNAME = "root";
    private static final String PWD = "root";

    private static Connection conn = null;

    static{
        try {
            // 1.加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获得数据库的连接
            conn = DriverManager.getConnection(URL, UNAME, PWD);
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
         return conn;
    }
}
*/

/**
 * @Author: vsu
 * @Descriptioon: 4 有一种创建多余对象的新方法，称作自动装箱（autoboxing）
 * @Date: 2017/11/07
 */
class Test2{

    public void runLongTime(){
        long start = System.currentTimeMillis();

        Long sum = 0L; //每次都创建一个对象
        for(long i = 0; i<Integer.MAX_VALUE; i++){
            sum += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(sum); //2305843005992468481
        System.out.println("程序运行时间" + (end - start) + "毫秒");//程序运行时间7785毫秒
    }

    public void runShortTime(){
        long start = System.currentTimeMillis();

        long sum = 0;
        for(long i = 0; i<Integer.MAX_VALUE; i++){
            sum += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(sum); //2305843005992468481
        System.out.println("程序运行时间" + (end - start) + "毫秒");//程序运行时间967毫秒
    }

    public static class Test1{
        public static void main(String[] args) {
            Test2 test2 = new Test2();
            test2.runLongTime();
        }
    }

    public static class Test3{
        public static void main(String[] args) {
            Test2 test2 = new Test2();
            test2.runShortTime();
        }
    }

}


public class ReadMe {
}
