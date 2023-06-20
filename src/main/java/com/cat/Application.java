package com.cat;

import com.cat.Annotion.Student;
import com.cat.Annotion.Test1;
import com.cat.Annotion.TestAnno;
import com.cat.ThreadTest.HongBao.HongBaoThread;
import com.cat.ThreadTest.TestThread;
import com.cat.ThreadTest.Thread3.TestThread3;
import com.cat.ThreadTest.ThreadDay2.Ticket;
import com.cat.proxy.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Application {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ExecutionException, InterruptedException {

//        int a = 3;
//        double b = a;
//
//        double c = 100.26;
//        c = c * 100;
//        int d = (int)c - 2500;
//        double e = d;
//        e = e/100;
//        System.out.println(e);
        /**
         * 练习多线程抢红包
         */
        HongBaoThread hb1 = new HongBaoThread();
        HongBaoThread hb2 = new HongBaoThread();
        HongBaoThread hb3 = new HongBaoThread();
        HongBaoThread hb4 = new HongBaoThread();
        HongBaoThread hb5 = new HongBaoThread();

        hb1.start();
        hb2.start();
        hb3.start();
        hb4.start();
        hb5.start();
        /**
         * 测试3个出票口卖100张票
         */
//        Ticket ticket1 = new Ticket();
//        Ticket ticket2 = new Ticket();
//        Ticket ticket3 = new Ticket();
//        ticket1.setName("买票口1");
//        ticket2.setName("买票口2");
//        ticket3.setName("买票口3");
//        ticket1.start();
//        ticket2.start();
//        ticket3.start();


        /**
         * 带有返回值的多线程测试
         */
//        TestThread3 testThread3 = new TestThread3();
//        FutureTask<Integer> futureTask = new FutureTask<>(testThread3);
//        Thread thread = new Thread(futureTask);
//        thread.start();
//        System.out.println(futureTask.get());
//        thread.getPriority();

        /**
         * 多线程测试
         */
//        TestThread testThread1 = new TestThread();
//        TestThread testThread2 = new TestThread();
//        testThread1.setName("公猫");
//        testThread2.setName("母猫");
//        testThread1.start();
//        testThread2.start();

//        TestAnno testAnno = new TestAnno();


//        JiGe jiGe = new JiGe("鸡哥");
//        Star star = ProxyUtil.CreateProxy(jiGe);
//
//        star.sing("鸡你太美");
//
//        Arry arry = new Arry(jiGe);
//        System.out.println(arry.name.toString());
//
//
//        JiGe2 jiGe2 = new JiGe2();
//
//        Class c = jiGe.getClass();
//        Field field = c.getDeclaredField("name");
//        field.setAccessible(true);
//        String o = (String) field.get(jiGe);
//        System.out.println(o);
//
//        Method method = c.getMethod("dance");
//        method.invoke(jiGe);
//
//
//        //-------------------------------------------------------
//
//        Student student = new Student();
//        Class s = student.getClass();
//        Annotation declaredAnnotation = s.getDeclaredAnnotation(Test1.class);
//        Test1 t = (Test1) declaredAnnotation;
//        System.out.println(t.name());
//        System.out.println(Arrays.toString(t.atr()));
//        System.out.println(t.num());
////        System.out.println(t.num());
////        String name = t.name();
////        System.out.println(name);
//////        Test1 test1 = (Test1) s.getDeclaredAnnotation(Test1.class);
////        System.out.println(test1.name());
    }
}
