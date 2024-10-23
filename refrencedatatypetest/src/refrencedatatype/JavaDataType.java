package refrencedatatype;
import java.util.*;

public class JavaDataType {
    public static void main(String [] args){

        byte b ;
        short s;
        int i ;
        long l=0;
        //Student student = new Student(); public class Student{}
        //l = i; //implicit casting  memory size greater than <= memory size less than
        b = (byte)l;//explicit casting
        // takeValue((byte)10);
        //takeValue((short)10);
        // takeValue(10);
        //takeValue(10l);

        b = (byte)l;
        System.out.println(b);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
    }
    static void takeValue(byte b){
        System.out.println("Byte is working");
    }

    static void takeValue(short s){
        System.out.println("Short is working");
    }

    static void takeValue(int i){
        System.out.println("Int is working");
    }

    static void takeValue(long l){
        System.out.println("Long is working");
    }




}
