/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * modified by 
 * @author Davinder
 */
public class StudentList {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student [] studentList = new Student[4];//change size before running
       Student s1 = new Student();
       s1.setName("Liz Dancy");
       studentList[0]=s1;
       
       Student s2 = new Student();
       s2.setName("John Smith");
       studentList[1] = s2;

       Student s3 = new Student();
       s3.setName("Alice Johnson");
       studentList[2] = s3;

       Student s4 = new Student();
       s4.setName("Michael Brown");
       studentList[3] = s4;

       //fill in 4 student names before running
       for(Student s: studentList)
       {
           System.out.println(s.getName());
       }
    }
    
}