package logicaltest;

public class LogicalTest {
    static boolean getTrue(){
        System.out.println("Call True Method");
        return true;
    }

    static boolean getFalse(){
        System.out.println("Call False Method");
        return false;
    }

    public static void main (String[] args){

        boolean a = getTrue() & getFalse();  // true AND false => CallT CallF
        boolean b = getFalse() & getTrue(); // false AND true => CallF CallT
        System.out.println();

        boolean e = getTrue() & getTrue();    // true AND true => CallT CallT
        boolean f = getFalse() & getFalse(); // false AND false => CallF CallF
        System.out.println();

        boolean c = getFalse() && getTrue();// false ANDAND true => CallF
        boolean d = getTrue() && getFalse();// true ANDAND flase => CallT CallF
        System.out.println();

        boolean g = getFalse() && getFalse(); // false ANDAND false => CallF
        boolean h = getTrue() && getTrue();  // true ANDAND true => CallT CallT
        System.out.println();

        boolean i = getTrue() | getFalse(); // T OR F => CallT CallF
        boolean j = getTrue() || getFalse(); // T OROR F => CallT
        System.out.println();

        boolean k = getFalse() | getTrue(); // F OR T => CallF CallT
        boolean l = getFalse() || getTrue();// F OROR T => CallF CallT
        System.out.println();
    }
}
