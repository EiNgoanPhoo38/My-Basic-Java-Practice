package ifelseifelseStatement;
import java.util.*;

public class ifElseIfStatement {

    /*simple if..else if..else
    static void checkMark(int mark){
        if(mark < 40) System.out.println("Fail!");
        else if (mark>40 && mark <80) System.out.println("Pass!");
        else System.out.println("Excellent!");
    }
    public static void main(String [] args){
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mark: ");input=sc.nextInt();
        checkMark(input);
    }
    *******************************************************************/

    /*Implement a simple login system that checks a username
    and password. Use if, else if, and else to provide feedback
    for correct login, incorrect password, or non-existent username.

    static void checkLogin(String user, String password){
        if (user == "EiEi" && password =="this is pass code") System.out.println("Correct Login");
        else if (user =="EiEi" && password!= "this is pass code") System.out.println("Incorrect password!");
        else if (password == "this is pass code" && user!= "EiEi") System.out.println("Non-existent username!");
        else System.out.println("Non-existent username and incorrect password!");
    }
    public static void main(String [] args){
        checkLogin("EiEi","this is pass code");
    }
    ********************************************************888*/

    /*Write a Java program to find the number of days in a month.
    30=>sept,apr,june,november
    31=>jan,mar,may,july,aug,oct,dec
    feb=>29/28
    static void checkMonth(int num,int year){
        if(num==2){
            if((year%4==0 && year%100!=0) || year%400==0)System.out.println("February "+ year + " has 29 days");
            else System.out.println("February " + year + " has 28 days");
        }
        else if (num==1 || num==3 || num==5 || num==7 || num==8 || num==10 || num==12){
            if(num==1)System.out.println("January "+ year+ " has 31 days" );
            else if (num==3) System.out.println("March "+ year+ " has 31 days");
            else if (num==3) System.out.println("May "+ year+ " has 31 days");
            else if (num==3) System.out.println("July "+ year+ " has 31 days");
            else if (num==3) System.out.println("August "+ year+ " has 31 days");
            else if (num==3) System.out.println("October "+ year+ " has 31 days");
            else System.out.println("December " + year+ " has 31 days");
        }

        else{
        if(num==4) System.out.println("April " + year + " has 30 days");
        else if (num==6) System.out.println("June "+ year+ " has 30 days");
        else if (num==9) System.out.println("September "+ year+ " has 30 days");
        else System.out.println("November " + year + " has 30 days");
        }
    }

    public static void main(String [] args){
        int month,year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a month number: ");month=sc.nextInt();
        System.out.print("Input a year: ");year=sc.nextInt();
        checkMonth(month,year);
    }
    *********************************************************/
    /**/
}
