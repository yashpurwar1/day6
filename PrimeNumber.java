package day6;

import java.util.Scanner;

public class PrimeNumber {
	public static void prime(int num) {
		int flag = 0;
		if (num == 1) {
			flag=0;
		}
		else {
			for (int i=2; i<=num/2; i++) {
				if (num%i == 0) {
					flag=1;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter a number to find weather its prime or not");
		Scanner scanner= new Scanner(System.in);
		int num = scanner.nextInt();
		prime(num);
		scanner.close();
	}

}
