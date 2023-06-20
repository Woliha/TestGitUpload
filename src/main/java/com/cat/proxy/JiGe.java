package com.cat.proxy;

public class JiGe implements Star{
    private String name;
    public String age;

    public JiGe(){}

    public JiGe(String name){
        this.name=name;
    }

    @Override
    public String sing(String name) {
        System.out.println(this.name+"正常唱"+name);
        return "谢谢";
    }

    @Override
    public void dance() {
        System.out.println(this.name+"正在跳舞");
    }

    @Override
    public String toString() {
        return "JiGe{" +
                "name='" + name + '\'' +
                '}';
    }
}
