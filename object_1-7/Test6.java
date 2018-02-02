package com.vsu.remove_obsolete_reference_6;

/** 第六条
 * 消除过期的对象引用
 * Created by vsu on 2017/11/08.
 */



/**
 * @Author: vsu
 * @Descriptioon: 引用 = null;
 * @Date: 2017/11/08
 *
 * 内存泄漏：对于被引用的对象，就算我们已经不在使用它了，但是java的回收机制是不会回收他们的
 * 内存泄露的另外几个常见来源是缓存，监听器及其他回调
 *
 * 处理方式：
 *     起一个后台线程来完成，或者给缓存添加新条目时顺便清理
 *     LinkedHashMap类可以利用他的removeEldestEntry方法实现，对于更复杂的缓存，必须直接使用java.lang.ref
 *     确保回调立即被当做垃圾回收的最佳方法是 只保存他们的弱引用，例如，只将他们保存成WeakHashMap中的键
 *         （只有当所要的缓存项的生命周期是由该键的外部引用而不是由值决定时，WeakHashMap才有用处）
 */

public class ReadMe {
}
