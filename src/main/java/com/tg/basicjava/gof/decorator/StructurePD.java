package com.tg.basicjava.gof.decorator;

/**
 * @Author: gh
 * @Date: 2019/10/8 11:04
 * @Description:
 ** 【装饰器模式---具体装饰器类】
 *  对被装饰对象代表的设计模式进行分类
 */
public class StructurePD extends PatternDecorator {

    public StructurePD(PatternComponent pc) {
        super(pc);
    }

    @Override
    public void patternName() {
        super.patternName();
        categoryPatternName();
    }
    private void categoryPatternName(){
        System.out.println("Structure pattern model...");
    }
}
