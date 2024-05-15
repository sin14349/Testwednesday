/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author davin
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String message="hello";
     char[]msg = new char[message.length()];
     for(int i=0;i<message.length();i++)
     {
         msg[i]=message.charAt(i);
         
    }
     for (int i=msg.length-1;i>=0;i--)
     {
         System.out.print(msg[i]);
     }// TODO code application logic here
    }
    
}
