package numbertest;
import java.util.*;
import java.lang.*;
public class NumberTest {
    public static void main(String [] args){

        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        //octalNumber
        String octal = getOctalNumber(input);
        System.out.println("Octal number is " + octal );
        //System.out.printf("%s = %d%n", octal, Integer.decode(octal));

        //binaryNumber
        String binary = getBinaryHexNumber(input,2);
        System.out.println("Binary number is "+binary);

        //HexNumber
        String hex = getBinaryHexNumber(input,16);
        System.out.println("Hex Number is "+  hex);

    }
    //octalNumber
    static String getOctalNumber(int data){
        StringBuilder sb=new StringBuilder();
        while(data >0){
            sb.append(data % 8);
            data = (data/8);
        }
        sb.reverse();
        //sb.insert(0, "0");
        return sb.toString();
    }


    //binaryNumber
    static String getBinaryHexNumber(int data, int format){
        StringBuilder sb=new StringBuilder();
        while(data >0){
            int remain = data % format;
            sb.append(format == 16 ? getHexNumber(remain) : remain);
            data = (data/format);
        }
        sb.reverse();
        sb.insert(0, getPrefix(format));
        return sb.toString();
    }

    static String getHexNumber(int hex){
        String [] values = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        return values[hex];

    }
    static String getPrefix(int format){
        String prefix = null;
        switch(format){
            case 2: prefix = "";break;
            case 16: prefix= "";break;
            default:break;
        }
        return prefix;
    }
}
