package com.vsu.multiparameter_constructor_2;

/**�ڶ���
 * �����������������ʱҪ�����ù�����
 * ��̬�����͹������и���ͬ�ľ����ԣ����Ƕ����ܺܺõ���չ�������Ŀ�ѡ����
 *
 * �����Ĺ��������߾�̬�����о��ж��������Builderģʽ���ǲ����ѡ���ر��Ǵ��������ʱ��ѡ��ʱ��Ҳ��JavaBeans���Ӱ�ȫ
 * Created by vsu on 2017/11/04.
 */


/**
 * @Author: vsu
 * @Descriptioon: �ص�������ģʽ
 * @Date: 2017/11/04
 *
 * �ص�������ģʽ�����������ӵĹ�����
 * demo1(int)
 * demo2(int, String)
 * demo3...
 *
 * ȱ�㣺
 *   �ص�������ģʽ���У����ǵ���������ʱ���ͻ��˴�����ѱ�д�����������Ķ�
 */


/**
 * @Author: vsu
 * @Descriptioon: JavaBeansģʽ
 * @Date: 2017/11/04
 *
 * ����һ���޲ι���������������Ȼ�����setter����������ÿ����Ҫ�Ĳ���
 * setInt(int)
 * setString(String)
 * set....
 *
 * ȱ�㣺
 *   ��Ϊ������̱��ֵ����������У��ڹ��������JavaBean���ܴ��ڲ�һ�µ�״̬
 *   ���޷�����ͨ�����鹹������������Ч������֤һ����
 *   JavaBeansģʽ��ֹ�˰������ɲ��ɱ�Ŀ���(15��)�������Ҫ����Ա���������Ŭ����ȷ�������̰߳�ȫ
 *
 */


/**
 * @Author: vsu
 * @Descriptioon: Builderģʽ��һ����ʽ
 * @Date: 2017/11/04
 *
 * ��ֱ��������Ҫ�Ķ��󣬶����ÿͻ����������б�Ҫ�Ĳ������ù��������߾�̬�������õ�һ��builder����
 * Ȼ��ͻ�����builder�����ϵ���������setter�ķ�����������ÿ����صĿ�ѡ������
 * ��󣬿ͻ��˵����޲ε�build���������ɲ��ɱ�Ķ���
 *
 *ȱ�㣺
 *    Ϊ�˴������󣬱����ȴ������Ĺ�����
 *    ���ص�������ģʽ���߳������ֻ���кܶ������ʱ���ʹ��
 *
 */

//builderģʽ
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
