/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import studentmanagement.Student;
import java.util.Scanner;

/**
 *
 * @author nhan
 */
public class SortingVer2 {
    
    public static void main(String[] args) {
//        selectionSort();
//        selectionStudentArraySort();
            inputStudentList();
    }
    public static void selectionSort(){
    
    
        int[] arr = new int[] {1000, -1000, 50, 30, -20, 3, -3000};
        System.out.println("The array after sorting..");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        for(int i = 0; i < arr.length -1; i++){
            
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            
            
            }
            
            }
        }
        
        
        System.out.println("\nThe array before sorting");
        for (int i : arr) {
            System.out.print(i + " ");
            
        }
    }
    
    
    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        int yob, count;
        String id, name;
        double gpa;
        System.out.println("How many student do you want to input? ");
        count = Integer.parseInt(sc.nextLine());
        
        
        Student arr[] = new Student[count];
        
        //
        for (int i = 0; i <count; i++) {
            System.out.println("Input student #" + (i+1) + "/" + count);
            
            System.out.print("Input id: ");
            id = sc.nextLine();
            System.out.print("Input name: ");
            name = sc.nextLine();
            System.out.print("Input year of birth: ");
            yob = Integer.parseInt(sc.nextLine());
            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());
            arr[i] = new Student(id, name, yob, gpa);
        }
        System.out.println("THe student is");
        for (Student student : arr) {
            student.showProfile();
        }
    
    }
    
    public static void selectionStudentArraySort(){
        Student arr[] = new Student[]{
                
                new Student("SE9", "Le Thanh Nhan", 19, 9),
                new Student("SE9", "Le Thanh Nhan", 19, 6),
                new Student("SE9", "Le Thanh Nhan", 19, 8),
                new Student("SE9", "Le Thanh Nhan", 19, 2),
                new Student("SE9", "Le Thanh Nhan", 19, 7)
                };
//        arr[0] = new Student("SE9", "Le Thanh Nhan", 19, 9);
//        arr[1] = new Student("SE9", "Le Thanh Nhan", 19, 6);
//        arr[2] = new Student("SE9", "Le Thanh Nhan", 19, 8);
//        arr[3] = new Student("SE9", "Le Thanh Nhan", 19, 2);
//        arr[4] = new Student("SE9", "Le Thanh Nhan", 19, 7);

        System.out.println("The student list before sort");
        for (Student student : arr) {
            student.showProfile();
            
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
        
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                
                }
                    
            
            }
        }
        
        
        System.out.println("The array after sorting");
        
        for (int i = 0; i < arr.length; i++) {
            
            arr[i].showProfile();
        }
        
        
    
    }
    
}
