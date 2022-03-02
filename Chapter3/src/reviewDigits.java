/*
 
Program:.java          Last Date of this Revision: February 9, 2022
 
Purpose: A digits application that prompts the user for a two-digit number
and then displays the ones-place and tens-place digits.
 
Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/



import java.util.Scanner;
public class reviewDigits {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner tDu = new Scanner(System.in);
		System.out.println("please input a 2 digit number, Ex. 11");
		
		int tD = tDu.nextInt();
		
		int ones = (tD / 10) ;
		
		int tens = (tD % 10);
		
		
		System.out.println("the ones place is: " + ones + " the tens place is: " + tens);
		
	
		
	}

}

/*screen dump
 * 
please input a 2 digit number, Ex. 11
67
the ones place is: 6 the tens place is: 7
 * 
 * 
 */



