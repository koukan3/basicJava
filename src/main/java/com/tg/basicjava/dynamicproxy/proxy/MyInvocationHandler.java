package com.tg.basicjava.dynamicproxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author: gh
 * @Date: 2019/9/30 14:55
 * @Description:
 */
public class MyInvocationHandler implements InvocationHandler {
    Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 轻松扩展类似逻辑进行诊断、限流等
        System.out.println("my invocation handler...");
        System.out.println(args==null?null:Arrays.asList(args));
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
