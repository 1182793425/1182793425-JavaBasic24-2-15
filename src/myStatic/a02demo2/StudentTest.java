package myStatic.a02demo2;

import java.util.ArrayList;



public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        Student st1=new Student("shipengbo",18,"男");
        Student st2=new Student("songjiewen",20,"男");
        Student st3=new Student("qiukai",19,"男");
        students.add(st1);
        students.add(st2);
        students.add(st3);
        System.out.println(StudentTool.getMaxAge(students));
    }
}
