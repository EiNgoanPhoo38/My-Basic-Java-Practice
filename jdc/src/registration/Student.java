package registration;
import teaching.*;

public class Student {
    String name;
    Course course;
    public static int count;

    public Student (String name){//constructor
        this.name=name;
        count++;
    }

    public void takeCourse(Course c){
        course=c;
    }

    public void yourCourse(){
        System.out.println("My name is " + name);
        System.out.println("My course is "+ course.name);
    }

    public void showInfo(){
        System.out.println("The count is " + count);
    }

}
