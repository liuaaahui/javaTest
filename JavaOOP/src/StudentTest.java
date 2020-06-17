import model.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("penny",22,true,123);
        System.out.println("学生姓名：" + student.getName());
        System.out.println("学生年龄：" + student.getAge());
        System.out.println("学生性别：" + student.isGender());
        System.out.println("学生学号：" + student.getIdNumber());
    }
}
