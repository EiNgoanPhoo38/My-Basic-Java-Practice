package statementtest;

public class StatementTest {

    void showMessage(){
        System.out.println("This is showMessage method");
    }
    public static void main(String [] args){
        //declaration statements
        int i;
        String str;
        StatementTest test;
        int[] arr;

        //assignment statements
        i = 30;
        str= "Hello";

        //object Creation statements
        test = new StatementTest();
        arr = new int[4];

        //increment decrement statements
        i++;
        System.out.println(i);
        i--;
        System.out.println(i);

        //method invocation
        test.showMessage();

    }
}
