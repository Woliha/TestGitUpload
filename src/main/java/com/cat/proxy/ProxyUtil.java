package com.cat.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

public class ProxyUtil {

    public static Star CreateProxy(final JiGe jiGe){
        Star o = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("sing".equals(method.getName())){
                            System.out.println("唱歌");
                        }
                        if ("dance".equals(method.getName())){
                            System.out.println("跳舞");
                        }
                        Object invoke = method.invoke(jiGe, args);
                        System.out.println("结束");
                        return invoke;
                    }
                }
        );

        return o;
    }

}
