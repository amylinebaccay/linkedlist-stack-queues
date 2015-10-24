/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqls;

import java.io.IOException;

/**
 *
 * @author Daisy
 */
public class StackApp {
     public static void main(String[] args)throws IOException{   
        int max=10;   
        Stack s=new Stack(max);   
        s.push(10);   
        s.push(20);   
        s.push(30);   
        s.push(40);   
           
        while(!s.isempty())   
        {   
            int value=s.pop();   
            System.out.println(value);   
        }   
    }   
}
