/** 第一条
 * 考虑用静态工厂方法代替构造器
 * Created by vsu on 2017/11/03.
 */


/**
 * @Author: vsu
 * @Descriptioon: 考虑用静态工厂方法代替构造器
 * @Date: 2017/11/03
 *
 * 优势：
 *   1 有名称，当一个类需要多个带有相同签名的构造器时。
 *   2 不必在每次调用时都创建一个新对象，能够重复的调用返回相同的对象
 *   3 可以返回原返回类型的任何子类型的对象
 *   4 在创建参数化类型实例的时候，它们是代码变得更加简洁
 *
 * 缺点：
 *   1 类如果不含公有的或者受保护的构造器，就不能被子类化
 *   2 它们与其他的静态方法实际上没有任何区别
 *
 * 惯用名称：
 *   valueOf
 *   of
 *   getInstance
 *   newInstance
 *   getType
 *   newType
 */
public class ReadMe {

    /*构造方法创建对象
    public Boolean(String s){
        this(toBoolean(s));
    }
    Boolean bTrue = new Boolean("true");
    */

    /*静态工厂方法创建对象
    public static Boolean valueOf(String s){
        return toBoolean(s) ? TRUE : FALSE；
    }
    Boolean bTrue = Boolean.valueOf("true");
     */

    /*代码更简洁
    Map<String, Integer> map = new HashMap<String, Integer>();

    public static<K, V> HashMap<K, V> newInstance(){
        return new HashMap<K, V>();
    }
    Map<String, Integer> map = HashMap.newInstance();
     */
