package myStatic.a01demo1;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName="zhangWei";

        Student s1=new Student();
        s1.setName("zhangSan");
        s1.setAge(18);
        s1.setGender("男");
//        s1.teacherName="zhangWei";
        s1.study();
        s1.show();

        Student.teacherName="aWei";

        Student s2=new Student();
        s2.setName("liSa");
        s2.setAge(18);
        s2.setGender("女");
        s2.study();
        s2.show();
    }
}
