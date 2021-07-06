package day6;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0,num2=1;
		System.out.println("How much length");
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		System.out.print(num1+" "+num2);
		for (int i=2; i<len; i++) {
			int num3 = num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(" "+num3);
		}
		scanner.close();
	}

}
