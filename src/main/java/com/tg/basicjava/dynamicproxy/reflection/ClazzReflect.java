package com.tg.basicjava.dynamicproxy.reflection;

import java.io.Console;
import java.lang.reflect.Field;

/**
 * @Author: gh
 * @Date: 2019/9/30 11:53
 * @Description: 类的反射
 */
public class ClazzReflect {

    public void getClazzInfo(Object clazz){
        Class<?> c = clazz.getClass();
        System.out.println(c.toString());
        Field[] fields = c.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
    }
}
