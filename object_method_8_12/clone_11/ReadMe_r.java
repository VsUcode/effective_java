package com.vsu.clone_11;

/**第十一条
 * 谨慎的覆盖clone
 * Created by vsu on 2017/11/13.
 */


/**
 * @Author: vsu
 * @Description:
 * @Date: 2017/11/13
 *
 *
 *  Cloneable接口的目的是作为对象的一个mixin接口，这表明这样的对象允许克隆(clone)。遗憾的是，它并没有成功地达到这个目的。其主要的缺陷在于，缺少一个clone方法，object的clone方法是受保护的
 *  如果不借助于反射(reflection)，就不能仅仅因为一个对象实现了Clonable接口，就可以调用clone方法。即使是反射的调用也可能失败，因为不能保证该对象一定具有可访问的clone方法。尽管存在这样那样的缺陷，这项设施仍然被广泛的使用着
 *
 *  既然Cloneable确定了Object中受保护的Clone方法实现的行为：如果一个类实现了Cloneable，Object的clone的方法就返回该对象的逐域拷贝，否则就会抛出CloneNotSupportedException异常。
 *     这是接口的一种极端非典型的用法，也不值得效仿。通常情况下，实现接口是类为了表明类可以为它的客户做些什么。然而对于Cloneable接口，它改变了超类中受保护的方法的行为。
 *  如果实现Cloneable接口是要对某个类起到作用，类和它的所有超类都必须遵守一个相当复杂的，不可实施的，并且基本上没有文档说明的协议。由此可以得到一种语言之外的机制：无需调用构造器就可以创建对象。
 *  -----------------------待写---------------------
 */


public class ReadMe_r {
}
