package day6;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		LocalTime time1 = java.time.LocalTime.now();
		System.out.println("first Time = "+time1);
		System.out.println("Enter any integer when you want to stop stopwatch");
		Scanner scanner= new Scanner(System.in);
		int N=scanner.nextInt();
		LocalTime time2 = java.time.LocalTime.now();
		System.out.println("Second time = "+time2);
		long time3 = time1.until(time2, ChronoUnit.SECONDS);
		System.out.println(time3+" Seconds");
		scanner.close();
	}

}
