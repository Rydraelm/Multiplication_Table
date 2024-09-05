package standard;

import java.util.Scanner;

public class Multiplication_Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of multiplation table");
		int x = sc.nextInt();
		
		System.out.println("The results is: ");
		System.out.println(x*1);
		System.out.println(x*2);
		System.out.println(x*3);
		System.out.println(x*4);
		System.out.println(x*5);
		System.out.println(x*6);
		System.out.println(x*7);
		System.out.println(x*8);
		System.out.println(x*9);
		System.out.println(x*10);
		
		sc.close();
	}
}
