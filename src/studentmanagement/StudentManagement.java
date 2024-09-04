/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement;

import java.util.Scanner;

/**
 *
 * @author nhan
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Container tuSE = new Container("PINK", "SE major");

//        if (choice == 1){}
        do {
            runMenu();
            System.out.println("Input your choice (1,....,6): ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    tuSE.inputStudentList();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchAsStudent();
                    break;
                case 4:
                    tuSE.updateAsStudent();
                    break;
                case 5:
                    tuSE.deleteStudent();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Please choose 1 to 6; plz");
                    throw new AssertionError();
            }

        } while (choice != 6);

    }

    public static void runMenu() {
        //menu: 1.Add .... 2. print 
        //3.search 4; ; 5 ;6. quit
        // chờ người chơi chọn món 1 2 3 4 5 6 Ahihi- try-catch-do-while MyToys
        System.out.println("WELCOME TO KELVIN _ KELVIN ACADEMIC_portal");
        System.out.println("CHOOSE THE FOLLOWING FUNCTION TO PLAY WITH");
        System.out.println("1. Add a student profile");
        System.out.println("2. Print student list");
        System.out.println("3. Search a student profile");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student profile");
        // Xóa không phải là xóa, mà xóa là ẩn
        // cất chỗ khác để dành cho như cầu thống kê
        // đánh dấu (marker/flag/status)
        System.out.println("6. QUIT");
    }

    public static void testTu() {
        // TODO code application logic here
//       Container tuSE =  new Container("RAINBOW", 0, 0)
        Container tuGD = new Container("PINK", "GD Major");
        // oto - passenger // nhạc hội -> người mua vé
        Container tuSE = new Container("Pink", "SE major");
        tuGD.inputStudentList();
        tuGD.inputStudentList();
        tuSE.inputStudentList();

        tuGD.printStudentList();
        tuSE.printStudentList();

    }

}
