package com.vsu.multiparameter_constructor_2;

/**第二条
 * 遇到多个构造器参数时要考虑用构建器
 * 静态工厂和构造器有个共同的局限性：它们都不能很好地扩展到大量的可选参数
 *
 * 如果类的构造器或者静态工厂中具有多个参数，Builder模式就是不错的选择，特别是大多数参数时可选的时候，也比JavaBeans更加安全
 * Created by vsu on 2017/11/04.
 */


/**
 * @Author: vsu
 * @Descriptioon: 重叠构造器模式
 * @Date: 2017/11/04
 *
 * 重叠构造器模式：参数逐渐增加的构造器
 * demo1(int)
 * demo2(int, String)
 * demo3...
 *
 * 缺点：
 *   重叠构造器模式可行，但是当有许多参数时，客户端代码很难编写，并且难以阅读
 */


/**
 * @Author: vsu
 * @Descriptioon: JavaBeans模式
 * @Date: 2017/11/04
 *
 * 调用一个无参构造器来创建对象，然后调用setter方法来设置每个必要的参数
 * setInt(int)
 * setString(String)
 * set....
 *
 * 缺点：
 *   因为构造过程被分到几个调用中，在构造过程中JavaBean可能处于不一致的状态
 *   类无法仅仅通过检验构造器参数的有效性来保证一致性
 *   JavaBeans模式阻止了把类做成不可变的可能(15条)，这就需要程序员付出额外的努力来确保他的线程安全
 *
 */


/**
 * @Author: vsu
 * @Descriptioon: Builder模式的一种形式
 * @Date: 2017/11/04
 *
 * 不直接生成想要的对象，而是让客户端利用所有必要的参数调用构造器或者静态工厂，得到一个builder对象，
 * 然后客户端在builder对象上调用类似于setter的方法，来设置每个相关的可选参数，
 * 最后，客户端调用无参的build方法来生成不可变的对象。
 *
 *缺点：
 *    为了创建对象，必须先创建他的构建器
 *    比重叠构建器模式更冗长，因此只在有很多参数的时候才使用
 *
 */

//builder模式
public class ReadMe {

    private final int num1;
    private final int num2;
    private final int num3;
    private final int num4;
    private final int num5;
    private final int num6;

    public static class Builder{
        private final int num1;
        private final int num2;

        private int num3 = 0;
        private int num4 = 0;
        private int num5 = 0;
        private int num6 = 0;

        public Builder(int num1, int num2){
            this.num1 = num1;
            this.num2 = num2;
        }

        public Builder setNum3(int num3){
            this.num3 = num3;
            return this;
        }

        public Builder setNum4(int num4){
            this.num4 = num4;
            return this;
        }

        public Builder setNum5(int num5){
            this.num5 = num5;
            return this;
        }

        public Builder setNum6(int num6){
            this.num6 = num6;
            return this;
        }

        // 1
        public ReadMe build(){
            return new ReadMe(this);
        }
    }

    // --1
    private ReadMe(Builder builder){
        num1 = builder.num1;
        num2 = builder.num2;
        num3 = builder.num3;
        num4 = builder.num4;
        num5 = builder.num5;
        num6 = builder.num6;
    }

    public static void main(String[] args) {
        ReadMe readMe =
                      new ReadMe.Builder(10, 20).setNum3(30).setNum4(40).setNum5(50).setNum6(60).build();
        System.out.println(readMe.num1 + readMe.num2);
    }

}
