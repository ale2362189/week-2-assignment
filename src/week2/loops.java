package week2;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5.a. A while loop that prints all even numbers from 0 to 100
		int x = 0;
		while (x < 101) {
			System.out.println(x);
		 x += 2;
	}
		// 5.b. A while loop that prints every 3rd number going backwards from 100 until we reach 0
		int i = 100;
		while (i >= 0) {
			System.out.println(i);
			i -= 3;
		}
		/* 5.c 	A for loop that prints every other number from 1 to 100
		 */
		for (int n = 0; n <= 100; n ++) {
			System.out.println(n);
		}
		// 5.d.	A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints “Hello” 
		// instead of the number, and if the number is divisible by 5, it prints “World” instead of the number, and if it is 
		//  divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
		
		for (int v = 0; v <= 100; v ++) {
			if (v % 3 == 0 && v % 5 ==0) {
				System.out.println("HelloWorld");
			} else if (v % 5 == 0) {
				System.out.println("World");
			} else if (v % 3 == 0) {
				System.out.println("Hello");
			} else {
				System.out.println(v);
			}
		}
	}

}
