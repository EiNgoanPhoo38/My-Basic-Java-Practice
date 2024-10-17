package countertest;
import java.sql.SQLOutput;
import java.util.*;
public class CounterTest {
	public static void main(String[] args) {
		Counter1 c1 = new Counter1();
		c1.countUp1();
		Counter1 c3 = new Counter1();
		c3.countUp1();

		System.out.println("C1 count is " + c1.count1);
		System.out.println("C1 count is " + c3.count1);
		

		Counter2 c2 = new Counter2();
		c2.countUp2();
		Counter2 c4 = new Counter2();
		c4.countUp2();
		System.out.println("C2 count is " + c2.count2);
		System.out.println("C2 count is " + c4.count2);


	}
}

//instance variable
	class Counter1 {
		int count1;
		public void countUp1() {
			count1++;
		}
	}

//	static variable
class Counter2 {
	static int count2;
	public void countUp2() {
		count2++;
	}
}
