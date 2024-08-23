package demo.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DemoComparable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        * sắp xếp với Comparable
        * Loớp dữ liệu cần sắp xếp nó phải kế thừa Comparable
        * Ghi đè phương thức comparTo để cài đặt sắp xếp
        * Sử dụng phương thức sort của Collection để sắp xêp
        * */
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("B1","Hoàng Thị Loan",18);
        Student student2 = new Student("B2","Nguyễn Kim Yến",21);
        Student student3 = new Student("B5","Hoàng Văn Phúc",19);
        Student student4 = new Student("B3","Nguyễn Minh Khôi",25);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        do {
            System.out.println("1. Hiển thị danh sách ");
            System.out.println("2. Sắp xếp danh sách sinh vin theo tuổi tăng dần");
            System.out.println("3. Sắp xếp danh sách sinh viên theo mã giảm dần");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    for (Student student : students) {
                        System.out.println("=======================");
                        System.out.println("MSV : "+student.getStudentCode());
                        System.out.println("Ho Va Ten : "+student.getStudentName());
                        System.out.println("Tuoi : "+student.getAge());
                    }
                    break;
                case 2:
                    Collections.sort(students);
                    System.out.println("Sinh vien sau khi được sắp xếp ");
                    for (Student student : students) {
                        System.out.println("=======================");
                        System.out.println("MSV : "+student.getStudentCode());
                        System.out.println("Ho Va Ten : "+student.getStudentName());
                        System.out.println("Tuoi : "+student.getAge());
                    }
                    break;
            }
        } while (true);
    }
}
