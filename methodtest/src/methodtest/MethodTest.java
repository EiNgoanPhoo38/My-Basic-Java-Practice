package methodtest;
import java.util.*;

public class MethodTest {
    public static void main(String [] arg){
        showResult(1,8);
        int result=add(10,10);
        System.out.println("Add is " + result);
        MethodTest obj = new MethodTest();
        obj.showInfo(20,9);

        OtherMethodTest.showMessage("This is from other Method test class");

    }

    static int add (int a, int b){
        return a+b;
    }

    static void showResult(int a,int b){
        int result= a+b;
        System.out.println("Show Result is "+ result);
    }

    void showInfo(int a, int b){
        int info = a-b;
        System.out.println("Show Info is " + info);
    }
}
