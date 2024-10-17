package localvariabletest;
import java.util.*;
public class LocalVariableTest {
    public static void showMessage(String message){
        System.out.println(message);
    }
    public static void doSomething(){
        String message = "Do Something";
        System.out.println(message);
    }

    public static void main (String arg[]){
        doSomething();
        showMessage("Love you");

    }

}
