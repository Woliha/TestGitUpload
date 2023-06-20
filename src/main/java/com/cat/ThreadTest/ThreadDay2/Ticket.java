package com.cat.ThreadTest.ThreadDay2;

import com.cat.Annotion.Student;

public class Ticket extends Thread{

    public static int tickets = 0;

    static Student s = new Student();

    @Override
    public void run() {

       while (true){
           synchronized (s){
               if (tickets<100){
                   try {
                       sleep(500);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   tickets++;
                   System.out.println(this.getName() + "卖出票:" + tickets);
               }else {
                   break;
               }
           }
       }






    }
}
