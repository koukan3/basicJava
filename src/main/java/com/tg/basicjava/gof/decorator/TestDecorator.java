package com.tg.basicjava.gof.decorator;

/**
 * @Author: gh
 * @Date: 2019/10/8 11:06
 * @Description:
 *  测试类
 */
public class TestDecorator {
    public static void main(String[] args) {
        PatternComponent singleton_pc = new SingletonPC();
        //singleton_pc = new ActionPD(singleton_pc);
        singleton_pc = new CreatePD(singleton_pc);
        singleton_pc.patternName();
        PatternDecorator pd = new StructurePD(new DecoratorPC());
        pd.patternName();
    }
}
