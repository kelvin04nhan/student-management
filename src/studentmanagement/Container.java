package studentmanagement;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nhan
 */
public class Container {

    private String color;
    private String label;

    private Student[] ds = new Student[100];

    private int count = 0; // mới mua tủ về, số hồ sơ = 0
    // biến má mì cần value, chưa nói biến đó cần cái gì
    // new sẵn 300 tương đương tủ chứa 301
    // đặt hàng kích thước, dung tích size 500, 1000, 2000

    // kiểm soát cách để đồ vào mảng, vào giỏm thoe thứ tự
    // for đến count
    // Data + hàm xử lý của tủ nhân cách hóa, toàn bộ sẽ là non-static
    // đồ đại hành xử phải thuộc về object
    private Scanner sc = new Scanner(System.in);

    public Container(String color, String label) { // có int size
        this.color = color;
        this.label = label;
//        ds = new Student[size]; // linh hoạt trong kích thước tủ
    }

    public void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        int yob;
        String id, name;
        double gpa;
//        System.out.println("How many student do you want to input? ");
//        count = Integer.parseInt(sc.nextLine());

//        Student arr[] = new Student[count];
        //
        // thư viên regular expression
//        for (int i = 0; i <count; i++) {
        System.out.println("Input student #" + (count + 1) + "/" + ds.length);

        System.out.print("Input id: ");
        id = sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input year of birth: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        ds[count] = new Student(id, name, yob, gpa);
        count++;
        System.out.println("Add student succesfully!");
//        }

    }

    public void printStudentList() {
        System.out.println("The student list:");
        for (int i = 0; i < count; i++) {
            if (ds[i] != null)
                ds[i].showProfile();
        }

        // vùng new (...) mới có code để chạy chứ
    }

    public void searchAsStudent() {
        System.out.println("Input the id that you want to search: ");
        String id = sc.nextLine();
        for (int i = 0; i < count; i++) {// đi tới cái cuối hen
            if (ds[i].getId().equalsIgnoreCase(id) == true) {
                System.out.println("Student found!! Here she/he is");
                // tìm thấy tại vị trí thứ i của mảng
                ds[i].showProfile();
                return; // dẹp mẹ m đi thoát hàm

            }
            // sống sót here/ sure. éo có thấy id mà tìm
            System.out.println("Student not found");

            // dùng biến flag phất cờ nếu thấy và không, if () in ra câu gì ?
        }
    }

    public void updateAsStudent() {
        System.out.println("Input the id of student you want to update: ");
        String id = sc.nextLine();
        String newName;
        int newYob;
        double newGpa;
        for (int i = 0; i < count; i++) {

            if (ds[i].getId().equalsIgnoreCase(id)) {

                System.out.println("Now we are found your infomaiton plz update it!!");
                System.out.print("Input name: ");
                newName = sc.nextLine();
                ds[i].setName(newName);
                
                System.out.print("Input year of birth: ");
                newYob = Integer.parseInt(sc.nextLine());
                ds[i].setYob(newYob);
                
                System.out.print("Input gpa: ");
                newGpa = Double.parseDouble(sc.nextLine());
                ds[i].setGpa(newGpa);
                System.out.println("Updating student is successfully!!");
                return;
            }
            System.out.println("NOT FOUND YOUR INFOMATION");
        }
        
        
        

    }
    public void deleteStudent() {
        System.out.println("Input id student you want to delete: ");
        String id;
        id = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if(ds[i].getId().equalsIgnoreCase(id)) {
                System.out.println("DELETING...");
                for (int j = i; j < count - 1; j++){
                // shift the element into the fill
                    ds[j] = ds[j+1];
                }
                
                count--;
                
                ds[count] = null;
                
                System.out.println("Deleting is successfully!");
                return;
                
            
            }
            System.out.println("Not found your value to deleting");
        }
    
        
    
    
    
    }

}
