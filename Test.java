import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        Student s1 = new Student(123, "Pankaj");
        list.add(s1);
        list.add(new Student(112, "Amit"));
        list.add(new Student(300, "Meirajul"));
        list.add(new Student(14, "Guahar"));
        list.add(new Student(505, "Ram"));
        list.add(new Student(257, "Shyam"));

        // using lambda
        list.stream().filter(s -> s.rollNo < 200).forEach(student -> System.out.println(student.name));
        ;

        // forEach and lembda
        // int[] arr = {5, 10, 12, 56, 350};
        // print event number

    }

}
