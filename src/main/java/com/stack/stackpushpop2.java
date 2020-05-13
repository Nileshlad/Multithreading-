package com.stack;

public class stackpushpop2 {
    int index;
    int top= -1;
    int mystack[]=new int[10000];
    public static void main(String[] args)
    {


        stackpush pp= new stackpush();
        stackpop po= new stackpop();
        Thread p= new Thread(pp);
        Thread o= new Thread(po);
        p.start();
        o.start();

    }
}