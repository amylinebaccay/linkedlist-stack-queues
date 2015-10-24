/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sqls;

/**
 *
 * @author Daisy
 */
import java.io.*;
public class Stack {
    int size;   
    int[] a;   
    int top;   
       
    public Stack(int value){   
        size=value;   
        a=new int[size];   
        top=-1;   
    }   
    public void push(int value){   
        a[++top]=value;   
    }   
    public int pop(){   
        return  a[top--];   
    }   
    public int peek(){   
        return a[top];   
    }   
    public boolean isfull(){   
        return (top==size-1);   
    }   
    public boolean isempty(){   
        return(top==-1);   
    }   
}
