package teaching;

public class Lesson {
    private String name;
    private Course course;

    public Lesson(String n,Course c){
        this.name=n;
        this.course=c;
    }

    public void info(){
        System.out.println("This is " + name + "Lesson" + course.name);
    }
}
