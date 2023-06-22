package day_03;
import java.util.*;
public class StudentAvgTotalMarksScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int sub1, sub2, sub3;
//		sub1 = Integer.parseInt(args[0]);
//		sub2 = Integer.parseInt(args[1]);
//		sub3 = Integer.parseInt(args[2]);
//		
//		int total = sub1 + sub2 + sub3;
//		int average = total/2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks of first subject: ");
		int scanSub1 = scanner.nextInt();
		System.out.println("Enter marks of second subject: ");
		int scanSub2 = scanner.nextInt();
		System.out.println("Enter marks of third subject: ");
		int scanSub3 = scanner.nextInt();
		

		int scanTotal = scanSub1 + scanSub2 + scanSub3;
		int scanAverage = scanTotal/2;
		
		System.out.println("Total : "+scanTotal);
		System.out.println("Average : "+scanAverage);
		
		
		scanner.close();
		
		

	}

}
