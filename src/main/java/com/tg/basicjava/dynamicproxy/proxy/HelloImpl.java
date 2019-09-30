package com.tg.basicjava.dynamicproxy.proxy;

/**
 * @Author: gh
 * @Date: 2019/9/30 14:54
 * @Description:
 */
public class HelloImpl implements  Hello {
    @Override
    public void sayHello(String name) {
        System.out.printf("say hello to %s...\n",name);
    }

    @Override
    public void sayBye() {
        System.out.println("good bye");
    }
}
