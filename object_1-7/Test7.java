package com.vsu.finalizer_7;

/**������
 * ����ʹ���ս᷽��-finalizer
 * Created by vsu on 2017/11/09.
 *
 * ��������˼�ǣ����㾡����Ҫ��������и���finalize������Ȼ����������дһЩ�ͷ����������Դ����䡣
 *
 * ΪʲôҪ���⸲�ǲ�ʹ��finalize������
 *      finalize�������ܱ�֤���ܱ���ʱ��ִ�С�
 *      finalize�������������ᱻִ�С�
 *      System.gc��System.runFinalization����������ֻ��������finalize���������õļ��ʡ�
 *      Ψһ�ܱ�֤finalize������ִ�еķ�����������System.runFinalizersOnExit��Runtime.runFinalizersOnExit���������������Ѿ������á�
 *      ���ǲ�ʹ���ս᷽����������ص�������ʧ��
 *
 * ������е���Դȷʵ��Ҫ���ͷţ�����Ӧ����ô����
 *      �ڵ��������Լ������public���ε���ֹ������ʱ����ú�try��finallyһ��ʹ��
 *
 *  ʲôʱ��ʹ���ս᷽���Ǻ����ģ�
 *      ���ս᷽���䵱����ȫ����
 *          ����ȫ�����������ǵ������ṩ��public���ε��ս᷽�������ⲿ���ǵ��õ�ʱ���ṩһ�ְ�ȫ����
 *      �ڱ��ضԵ��岢��ӵ�йؼ���Դ��ǰ����(ע�Ƿ���Ϊ�ؼ���Դ�ɱ�������������ʹ��)��finalize()����ִ�����������ʵĹ��ߡ�
 *
 *  ��ʹ���ս᷽����ʱ������Ӧ��ע��Щʲô��
 *      ֻ��Ҫע��һ�㣬�Ǿ���ȷ��super.finalize()����һ���ᱻִ�С�
 *          ȷ����һ���ᱻִ�еķ�ʽ�����֣�
 *              ʹ��try-finally��������İ�ȫ��һ������
 *              ʹ�á��ս᷽��������
 *      ��������Ϊ��ȫ��������Ϊ����ֹ�ǹؼ��ı�����Դ�������벻Ҫʹ���ս᷽����
 */

public class ReadMe {
}