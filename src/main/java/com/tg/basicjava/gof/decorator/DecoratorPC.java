package com.tg.basicjava.gof.decorator;

/**
 * @Author: gh
 * @Date: 2019/10/8 10:56
 * @Description:
 * 【装饰器模式---具体装饰对象类】
 * 定义设计模式
 */
public class DecoratorPC implements PatternComponent {

    @Override
    public void patternName() {
        System.out.println("this is the decorator...");
    }
}
