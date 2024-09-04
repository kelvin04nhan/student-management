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
public class Sorting {
    public static void main(String[] args) {
        System.out.println("Hihihi");
//        sortPrimitiveArrayVer2();
//        sortStudentList();
//        inputStudentList();
    }
    
    
    public static void inputStudentList(){
        // can: mang Student, can vien trung gina chua data tu ban phim
        // scanner, new,, gan mang
        Scanner sc = new Scanner(System.in);
        int count, yob;
        String id, name;
        double gpa;
        Student arr[];
        System.out.print("How many students do you want to input? ");
//        count = sc.nextInt(); // aw don, troi lenh
        count = Integer.parseInt(sc.nextLine());
        
        arr = new Student[count];
        
        for (int i = 0; i < count; i++) {
            System.out.println("Input student #" + (i + 1) + "/" + count);
            System.out.print("Input id: ");
            id  = sc.nextLine(); // ToDO: chan viec bo trang enter (*)

            System.out.print("Input name: ");
            name  = sc.nextLine(); // ToDO: chan viec bo trang enter (*)


            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());


            System.out.print("Input gpa: ");   
            gpa = Double.parseDouble(sc.nextLine()); // chong troi lenh

            arr[i] = new Student(id, name, yob, gpa);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    public static void sortStudentList() {
//        Student arr[] = new Student[5];
//        arr[0] = new Student("SE1", "CHIN", 19, 9.0);
//        arr[1] = new Student("SE9", "SAU", 16, 6.0);
//        arr[0] = new Student("SE7", "BAY", 18, 7.0);
//        arr[0] = new Student("SE3", "BA", 19, 3.0);
//        arr[0] = new Student("SE5", "NAM", 19,5.0);


        Student arr[] = new Student[]{
                                        new Student("SE1", "CHIN", 19, 9.0),
                                        new Student("SE9", "SAU", 16, 6.0),
                                        new Student("SE7", "BAY", 18, 7.0),
                                        new Student("SE3", "BA", 19, 3.0),
                                        new Student("SE5", "NAM", 19,5.0)

        
        };
        System.out.println("The Student list before sorting:");
        for (Student student : arr) 
            student.showProfile();
        
       
        
        
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].getGpa() < arr[j].getGpa()) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                }
                
            }
        }
        System.out.println("The Student list after sorting by gpa");
        for (int i = 0; i < arr.length; i++) 
            arr[i].showProfile();
            
        
            
        
    
    }
     public static void sortPrimitiveArrayVer2() {
        int arr[] = new int[]{1000, -1000, 50, 30, 10, -20, -3000};
        System.out.println("The array before sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++)
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                
                
                }
            
        
        System.out.println("The arr after sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        
        }
    
    }
    public static void sortPrimitiveArray() {
        int arr[] = new int[]{1000, -1000, 50, 30, 10, -20, -3000};
        System.out.println("The array before sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
            
        }
        // chot [0] so voi tat ca con lai, khong on doi
        // chot[0] for tu 1, chot[1] for tu 2, chot[2] for tu 3
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                int t = arr[0];
                arr[0] = arr[i];
                arr[i] = t;
            }
            
        }
        for (int i = 2; i < arr.length; i++)
            if (arr[1] > arr[i]) {
                int t = arr[1];
                arr[1]  = arr[i];
                arr[i] = t;
            
            }
        
        


        //chot1 chay tu - den cuoi
        System.out.println("The arr after sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        
        }
    
    }
    
    
        
    
    }

