package arraytest;
import java.util.*;
import java.lang.*;

public class ArrayTest {

    public static void main(String [] args) {
        //array initialization
        int[] array = {1, 2, 3, 4}; // int [] array; array = new int [] {1,2,3,4} => int [4] {1,2,3,4}
        String[] strArray1 = {"tt", "yy"};
        String[] strArray2 = new String[3]; // {null,null,null}
        int[] intArray1 = new int[4];//{0,0,0,0}

        intArray1[0] = 1;
        System.out.println("This is answer of index number 0 = "+intArray1[0]);

        //intArray1[4]=5;System.out.println(intArray1[4]); ArrayIndexOutOfBoundsException

    }
}
