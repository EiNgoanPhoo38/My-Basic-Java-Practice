package switchstatement;
import java.util.*;
public class switchStatement {

    /*simple switch Statement
    static void checkDay(int i){
        switch (i){
            case 1:
                System.out.println("Monday");break;
            case 2:
                System.out.println("Tuesday");break;
            case 3:
                System.out.println("Wednesday");break;
            default:
                System.out.println("Friday");break;
        }
    }
    public static void main(String [] args){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");i = sc.nextInt();
        checkDay(i);
    }
    ***************************************************************************************/

    /*Create a simple calculator that takes two integers and an operator (+, -, *, /)
    as input and uses a switch statement to perform the corresponding operation.
    static void calculator(int num1,int num2,char i){
        int ans;
        switch (i){
            case '+':
                ans=num1+num2;
                System.out.println("Answer: " + ans);
                break;
            case '-':
                ans=num1-num2;
                System.out.println("Answer: " + ans);
                break;
            case '*':
                ans=num1*num2;
                System.out.println("Answer: " + ans);
                break;
            case '/':
                ans=num1/num2;
                System.out.println("Answer: " + ans);
                break;
            default:
                System.out.println("Error!");break;
        }
    }

    public static void main(String[] args){
        int num1,num2;char i;
        Scanner sc = new Scanner(System.in);
        System.out.print("First integer: ");num1=sc.nextInt();
        System.out.print("Second integer: ");num2=sc.nextInt();
        System.out.print("Choose (+,-,*,/): ");i=sc.next().charAt(0);
        calculator(num1,num2,i);
    }
    *******************************************************************************8*/

    /*Create a program that simulates a traffic light.
    Take an input for the color of the light (Red, Yellow, Green) and use
    a switch statement to print what action should be taken (Stop, Slow Down, Go).

    public static void main(String [] args){
        String color;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur light color(red,yellow,green): ");color=sc.next();
        switch (color){
            case "red":
                System.out.println("Stop!");break;
            case "yellow":
                System.out.println("Slow Down!");break;
            case "green":
                System.out.println("Go!");break;
            default:
                System.out.println("Error!");
        }
    }*/
}
