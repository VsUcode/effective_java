package com.vsu.finalizer_7;

/**第七条
 * 避免使用终结方法-finalizer
 * Created by vsu on 2017/11/09.
 *
 * 本条的意思是，让你尽量不要在你的类中覆盖finalize方法，然后在在里面写一些释放你的类中资源的语句。
 *
 * 为什么要避免覆盖并使用finalize方法？
 *      finalize方法不能保证它能被及时的执行。
 *      finalize方法甚至都不会被执行。
 *      System.gc和System.runFinalization这两个方法只是能增加finalize方法被调用的几率。
 *      唯一能保证finalize方法被执行的方法有两个，System.runFinalizersOnExit和Runtime.runFinalizersOnExit但是这两个方法已经被弃用。
 *      覆盖并使用终结方法会造成严重的性能损失。
 *
 * 如果类中的资源确实需要被释放，我们应该怎么做？
 *      在调用我们自己定义的public修饰的终止方法的时候最好和try—finally一起使用
 *
 *  什么时候使用终结方法是合理的？
 *      用终结方法充当“安全网”
 *          “安全网”的作用是当我们提供的public修饰的终结方法被在外部忘记调用的时候提供一种安全保障
 *      在本地对等体并不拥有关键资源的前提下(注是否因为关键资源可被本地其他进程使用)，finalize()正是执行任务的最合适的工具。
 *
 *  在使用终结方法的时候我们应该注意些什么？
 *      只需要注意一点，那就是确保super.finalize()方法一定会被执行。
 *          确保它一定会被执行的方式有两种：
 *              使用try-finally（像上面的安全网一样）；
 *              使用“终结方法守卫”
 *      除非是作为安全网或者是为了终止非关键的本地资源，否则请不要使用终结方法。
 */

public class ReadMe {
}
