package com.vsu.avoid_needless_object_5;

/**������
 * ���ⴴ������Ҫ�Ķ���
 * Created by vsu on 2017/11/07.
 */



/**
 * @Author: vsu
 * @Descriptioon: 1 һ����˵����������ö����������ÿ����Ҫ��ʱ��ʹ���һ����ͬ���ܵ��¶������÷�ʽ�ȿ��٣������С���������ǲ��ɱ�ģ�����ʼ�տ��Ա�����
 * @Date: 2017/11/07
 *
 *  ������ String s = new String("aaa");
 * ������  String s = "aaa";
 */


/**
 * @Author: vsu
 * @Descriptioon: 2 ����ͬʱ�ṩ�˾�̬���������͹������Ĳ��ɱ��࣬ͨ��ѡǰ�ߣ��Ա��ⴴ������Ҫ����
 * @Date: 2017/11/07
 */
class Test1{
    public static void main(String[] args) {
        //ʹ�ù�����
        Integer a1 = new Integer(1);
        Integer a2 = new Integer(1);

        //ʹ�þ�̬��������
        Integer a3 = Integer.valueOf(2);
        Integer a4 = Integer.valueOf(2);

        System.out.println(a1 == a2); //false
        System.out.println(a3 == a4); //true
    }
}


/**
 * @Author: vsu
 * @Descriptioon: 3 �������ò��ɱ�Ķ���֮�⣬Ҳ����������Щ��֪�����޸ĵĿɱ����
 * @Date: 2017/11/07
 */

/* ����
class DBUtilBad {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/imooc";
    private static final String UNAME = "root";
    private static final String PWD = "root";
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // 1.������������
            Class.forName("com.mysql.jdbc.Driver");
            // 2.������ݿ������
            conn = DriverManager.getConnection(URL, UNAME, PWD);
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return conn;
    }
}

//����
class DBUtilBad {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/imooc";
    private static final String UNAME = "root";
    private static final String PWD = "root";

    private static Connection conn = null;

    static{
        try {
            // 1.������������
            Class.forName("com.mysql.jdbc.Driver");
            // 2.������ݿ������
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
 * @Descriptioon: 4 ��һ�ִ������������·����������Զ�װ�䣨autoboxing��
 * @Date: 2017/11/07
 */
class Test2{

    public void runLongTime(){
        long start = System.currentTimeMillis();

        Long sum = 0L; //ÿ�ζ�����һ������
        for(long i = 0; i<Integer.MAX_VALUE; i++){
            sum += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(sum); //2305843005992468481
        System.out.println("��������ʱ��" + (end - start) + "����");//��������ʱ��7785����
    }

    public void runShortTime(){
        long start = System.currentTimeMillis();

        long sum = 0;
        for(long i = 0; i<Integer.MAX_VALUE; i++){
            sum += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(sum); //2305843005992468481
        System.out.println("��������ʱ��" + (end - start) + "����");//��������ʱ��967����
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
