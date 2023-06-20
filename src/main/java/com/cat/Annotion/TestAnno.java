package com.cat.Annotion;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAnno {

    @TestAnnotation
    public void Test1(){
        System.out.println("====Test1====");
    }

    public void Test2(){
        System.out.println("====Test2====");
    }

    @TestAnnotation
    public void Test3(){
        System.out.println("====Test3====");
    }

    public void Test4(){
        System.out.println("====Test4====");
    }

    public TestAnno() throws InvocationTargetException, IllegalAccessException {
        Class c = TestAnno.class;
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method m:declaredMethods) {
            if(m.isAnnotationPresent(TestAnnotation.class)){
                m.invoke(this);
            }

        }
    }
}
