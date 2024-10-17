package testing;
import registration.*;
import teaching.*;
import static registration.Student.*;

public class Packagetest {
    public static void main(String [] args) {
        Course c = new Course("Java SE");
        Student s = new Student("Ei Ngoan");
        s.takeCourse(c);
        s.yourCourse();
        s.showInfo();
    }
}
