package ifstatement;
import java.util.*;

public class ifStatement {
    static void checkNum(int value){
        if (value > 0){
            System.out.println("Value is greater than Zero");
        }
    }

    static void inputNum(int num){

        if(num>0){
            System.out.println("This is greater than Zero!");
        }
        if(num%2==0){
            System.out.println("This is Even Number!");
        }
        if(num<=0){
            System.out.println("This is less than Zero!");
        }
    }


    public static void main(String [] args){
        checkNum(2);

        int numFromUser;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ur number");
        numFromUser=sc.nextInt();
        inputNum(numFromUser);

        /*if(numFromUser>0){
            System.out.println("This is greater than Zero!");
        }
        if(numFromUser%2==0){
            System.out.println("This is Even Number!");
        }
        if(numFromUser<=-20){
            System.out.println("This is less than Zero!");
        }*/
    }

}
