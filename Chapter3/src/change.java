

/*
Program:.java          Last Date of this Revision: february 9, 2022
 
Purpose: 

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
import java.util.Scanner;
public class change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		System.out.println("please input a amount of money in cents");
		int M = num.nextInt();
		
		
		//Q = 25 D = 10 N = 5 P = 1
		
		int Q = M / 25;
		
		int D = (M % 25) / 10;
		
		int N = ((M % 25)% 10) / 5;
		
		int P = (((M % 25)% 10)% 5) / 1;
		
		System.out.println("the amount of quarters:  " + Q);
		System.out.println("the amount of dimes:  " + D);
		System.out.println("the amount of nickles:  " + N);
		System.out.println("the amount of pennies:  " + P);
	}

}
/*screen dump
	
please input a amount of money in cents
212
the amount of quarters:  8
the amount of dimes:  1
the amount of nickles:  0
the amount of pennies:  2




*/