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
public class Shelf {
    private String color;
    private String label;
    private int count = 0;
    private Scanner sc = new Scanner(System.in);
    private Student[] arr = new Student[count];
    /// logic là trước khi mua tủ về mình phải có chỗ để
    // khi chơi với mảng, phải biết for đến đâu, coi hcungwf null pointer
    //add từ từ từ trái sang phải
    // ta cần 1 số count từ trái sang phải
    // sure non static
    
    public Shelf(String color, String label, int count) {
        this.color = color;
        this.label = label;
//        this.count = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    // hành động add hồ sợ sv lặp lại cho mỗi cái tủ
    public void addAStudent(){
        int yob;
        String id, name;
        double gpa;
        
        System.out.println("Input student #" + (count + 1) + "/" + arr.length);
        System.out.print("Input id: ");
        id  = sc.nextLine(); // ToDO: chan viec bo trang enter (*)

        System.out.print("Input name: ");
        name  = sc.nextLine(); // ToDO: chan viec bo trang enter (*)


        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());


        System.out.print("Input gpa: ");   
        gpa = Double.parseDouble(sc.nextLine()); // chong troi lenh
        
        
        // chơi for là vỡ mặt, phải là từ từ vì nó sẽ được liên tục bổ sung 
//       arr[i] = new Student("Kelvin", name, 0, 0);
// để count dùng cho hậu trường thôi người ngoài không cần biết
        arr[count] = new Student(id, name, yob, gpa);
        count++;
         
        
        
    
    
    }
    
    public void printStudentList(){
        System.out.println("The student list" + count +" student(s) in the list");
//        for (Student student : arr) {
//            student.showProfile();
//            
//        }
        for (int i = 0; i < count; i++){
            arr[i].showProfile();
        
        }
        // coi chừng null pointer
    
    
    }
    
    
}
