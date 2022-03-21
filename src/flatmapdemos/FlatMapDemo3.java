package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    String sname;
    int sid;
    char grade;

    Student(String sname, int sid, char grade) {
        this.sname = sname;
        this.sid = sid;
        this.grade = grade;
    }


}


public class FlatMapDemo3 {
    public static void main(String[] args) {

        List<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(new Student("Smith", 101, 'A'));
        studentList1.add(new Student("John", 102, 'B'));
        studentList1.add(new Student("Kenedy", 103, 'C'));

        List<Student> studentList2 = new ArrayList<Student>();
        studentList1.add(new Student("Scott", 104, 'A'));
        studentList1.add(new Student("Mary", 105, 'B'));
        studentList1.add(new Student("Kitty", 106, 'C'));


        List<List<Student>> studentListCombine = Arrays.asList(studentList1, studentList2);

        //  before java8
//        for (List<Student> s : studentListCombine) {
//            for (Student stu : s) {
//                System.out.println(stu.sname);
//            }
//        }


//        same in stream
        studentListCombine.stream()
                .flatMap(students -> students.stream()
                        .map(student -> student.sname))
                .forEach(System.out::println);


    }
}
