package myStatic.a02demo2;

import java.util.ArrayList;

public class StudentTool {
    private StudentTool(){}

    public static int getMaxAge(ArrayList<Student> students){
        int maxage=students.get(0).getAge();
        for (int i = 1; i < students.size(); i++) {
            if (maxage<students.get(i).getAge()){
                maxage=students.get(i).getAge();
            }
        }return maxage;
    }
}
