package day6;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int sum=1;
		System.out.println("Enter a number to find weather its perfect or not");
		Scanner scanner= new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i=2; i<=num/2; i++) {
			if (num%i==0) {
				sum+=i;
			}
		}
		if (sum==num) {
			System.out.println("its a perfect number");
		}
		else {
			System.out.println("Not a perfect number");
		}
		scanner.close();
	}

}
