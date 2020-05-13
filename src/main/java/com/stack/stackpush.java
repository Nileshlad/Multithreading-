package com.stack;

class stackpush  extends stackpushpop2 implements Runnable
{

    public void run()
    {
        if(top==10000)
            System.out.println("The Stack is full");
        else
            for(index=1;index<=10;index++)
            {

                mystack[++top]= index;
            }
    }
}