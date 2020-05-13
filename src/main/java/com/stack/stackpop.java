package com.stack;

class stackpop extends stackpushpop2 implements Runnable
{
    public void run()
    {
        if(top<0)
            System.out.println("The Stack is Empty");
        else
        {
            for(index=1;index<=10;index++)
            {
                index= mystack[top--];
                System.out.println(index);
            }
        }
    }
}


