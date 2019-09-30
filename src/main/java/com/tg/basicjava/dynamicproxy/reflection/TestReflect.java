package com.tg.basicjava.dynamicproxy.reflection;

import org.junit.Test;

/**
 * @Author: gh
 * @Date: 2019/9/30 11:55
 * @Description:
 */
public class TestReflect {

    @Test
    public void reflect(){
        ClazzReflect cr = new ClazzReflect();
        cr.getClazzInfo(new OriginalClazz());
    }
}
