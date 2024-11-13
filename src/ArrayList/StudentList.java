package ArrayList;
import java.util.ArrayList;
import java.util.List;


public class StudentList {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Anantha", "F001", "India"));
        studentList.add(new Student("Usha", "F002", "USA"));
        studentList.add(new Student("Ramya", "F003", "China"));
        studentList.add(new Student("Yamini", "F004", "UK"));
        studentList.add(new Student("Afrin", "F005", "France"));

        for (Student student : studentList)
            System.out.println(student);

    }
}