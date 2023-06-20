package com.cat.proxy;

public class Arry<T> {

    public T name;

    public Object a[];

    public Arry(T t){
        this.name = t;
    }
    public Arry(){
        a = new Object[10];
    }
}
