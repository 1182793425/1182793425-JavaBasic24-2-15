package myStatic.a01demo1;

public class Student {
    private String name;
    private int age;
    private String gender;
    //新增老师属性
    public static String teacherName;

    public void study(){
        System.out.println(name+"在学习");
    }

    public void show(){
        System.out.println(
                name+","+
                age+","+
                gender+","+
                teacherName+","
        );
    }

    public Student(){

    }
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static String getTeacherName() {
        return teacherName;
    }

    public static void setTeacherName(String teacherName) {
        Student.teacherName = teacherName;
    }
}
