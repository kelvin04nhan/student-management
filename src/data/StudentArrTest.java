/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import studentmanagement.Student;

/**
 *
 * @author nhan
 */
public class StudentArrTest {
    public static void main(String[] args) {
//        playWithStudentArr();
//        playWithOjectStudent();
         draw();
        
    }
    public static void playWithStudentArr(){
        Student kelvin = new Student("PM123", "Nhan", 2004, 3.5);
        kelvin.showProfile();
    
    
    }
    public static void playWithOjectStudent(){
        Student student[] = new Student[10];
        student[0] = new Student("PM345", "Le Thanh Nhan", 2004, 3.5);
        student[1] = new Student("PM567", "Dat", 2004, 3.6);
        student[2] = new Student("IT123", "KELVIN", 2005, 3.7);
        String newName = student[0].getName().toUpperCase();
        System.out.println(newName);
        for(int i = 0; i <= student.length; i++){
            student[i].showProfile();
        
        }
        
        
    }
    
    
    public static void draw2() {  
    int number = 5;
    for (int i = 0; i <= number; i++) {
        for (int j = 0; j <= number; j++) {
            if (i == 0 || i == number || j == 0 || j == number) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        // Move to the next line after the inner loop is done
        System.out.println();
    }
}
    public static void draw(){
        int number = 5;
        for(int i = 1; i <= number; i++){
        
            for (int j = 1; j <= number; j++) {
            
                if(i == 1 || i == number || j == 1|| j == number){
                
                    System.out.print("*");
                
                
                } else {
                
                    System.out.print(" ");
                }
            
            }
            System.out.println();
        
        }
    }

}
