package com.tg.basicjava.gof.decorator;

/**
 * @Author: gh
 * @Date: 2019/10/8 10:57
 * @Description:
 * 【装饰器模式---抽象装饰器类】
 * 对被装饰对象代表的设计模式进行分类
 */
public abstract class PatternDecorator implements PatternComponent{
    PatternComponent pc;

    public PatternDecorator(PatternComponent pc) {
        this.pc = pc;
    }

    @Override
    public void patternName() {
        pc.patternName();
    }
}
