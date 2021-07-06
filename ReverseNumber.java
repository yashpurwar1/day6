package day6;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int newNum=0;
		System.out.println("Enter a number to find weather its reverse");
		Scanner scanner= new Scanner(System.in);
		int num = scanner.nextInt();
		while (num>0) {
			int reminder = num%10;
			newNum=newNum*10+reminder;
			num=num/10;
		}
		System.out.println(newNum);
		scanner.close();
	}

}
