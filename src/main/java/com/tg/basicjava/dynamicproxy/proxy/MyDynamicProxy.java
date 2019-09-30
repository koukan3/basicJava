package com.tg.basicjava.dynamicproxy.proxy;

import java.lang.reflect.Proxy;

/**
 * @Author: gh
 * @Date: 2019/9/30 14:57
 * @Description: 动态代理,代理可以看做是对调用目标的一个包装，对目标代码的调用是通过代理完成。
 */
public class MyDynamicProxy {
    public static void main(String[] args) {
        HelloImpl helloImpl = new HelloImpl();
        MyInvocationHandler handler = new MyInvocationHandler(helloImpl);
        Hello helloProxy = (Hello)Proxy.newProxyInstance(helloImpl.getClass().getClassLoader(),
                helloImpl.getClass().getInterfaces(), handler);
        helloProxy.sayHello("tg");
        helloProxy.sayBye();
    }
}
