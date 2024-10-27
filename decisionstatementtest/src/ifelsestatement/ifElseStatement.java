package ifelsestatement;
import java.util.*;

public class ifElseStatement {

    /*Question: Write a program that takes a single letter from the user and
    checks if it’s a vowel (a, e, i, o, u) or a consonant.
    Print "Vowel" or "Consonant" accordingly.

    static void  checkVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("This letter is vowel.");
        }else System.out.println("This letter is not vowel.");
    }
    public static void main(String[] args){
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur letter: ");
        c = sc.next().charAt(0);
        checkVowel(c);
    }*/

    /*Question: Write a program that takes two integers from the user
    and prints the greater of the two.
    If the numbers are equal, print "Both numbers are equal."

    static void checkNum(int num1,int num2){
        if (num1!=num2){
            if(num1>num2) System.out.println("First number is greater than second number!");
            else System.out.println("Second number is greater than first number!");
        }else System.out.println("They are the same!");
    }
    public static void main(String [] args){
        int input1, input2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur first number : ");input1 = sc.nextInt();
        System.out.print("Enter ur second number : ");input2 = sc.nextInt();
        checkNum(input1,input2);
    }*/

    /*Write a Java program
    that takes three numbers from the user and prints the greatest number.
    public static void main(String [] args){
        int input1,input2,input3;
        Scanner sc = new Scanner(System.in);
        System.out.print("1st number: ");input1=sc.nextInt();
        System.out.print("2nd number: ");input2=sc.nextInt();
        System.out.print("3rd number: ");input3=sc.nextInt();

        if (input1!=input2 && input1!=input3 && input2!=input3){
            if(input1>input2){
                if(input1>3) System.out.println("The greatest: " + input1);
            }
            if (input2>input1) {
                if (input2>input3) System.out.println("The greatest: "+ input2);
            }
            if (input3>input2){
                if (input3>input1) System.out.println("The greatest: " +input3);
            }
        }
    }*/

    /*Write a Java program that reads a floating-point number
    and prints "zero" if the number is zero.
    Otherwise, print "positive" or "negative".
    Add "small" if the absolute value of the number is less than 1,
    or "large" if it exceeds 1,000,000.

    public static void main(String []args){
        float input=0f;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");input=sc.nextFloat();
        if (input==0.0f) System.out.println("Zero");
        if(input >1 && input <1000000){
            System.out.println("Positive number");
        }
    }*/

    /*Write a Java program that takes a number from the user
    and generates an integer between 1 and 5. It displays the weekday name.

    static void displayWeekDay(int i){
        if (i==1) System.out.print("Monday");
        if (i==2) System.out.print("Tuesday");
        if (i==3) System.out.print("Wednesday");
        if (i==4) System.out.print("Thursday");
        if (i==5) System.out.print("Friday");
    }
    public static void main(String [] args){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter between 1 to 5: ");i=sc.nextInt();
        displayWeekDay(i);
    }*/
}
