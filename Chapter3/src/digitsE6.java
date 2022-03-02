

/*
Program:.java          Last Date of this Revision: February 9, 2022
 
Purpose: modify the digits application created in a review earlier in this chapter to show the hundreds place digit of a three digit number. 

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
import java.util.Scanner;
public class digitsE6 {
	
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner tDu = new Scanner(System.in);
		System.out.println("please input a 3 digit number, Ex. 111");
		
		int tD = tDu.nextInt();
		
		int ones = (tD / 100) ;
		
		int tens = (tD % 100) / 10 ;
		
		int hundreds = ((tD % 100) % 10);
		
		System.out.println("the ones place is: " + ones + " the tens place is: " + tens + " the hundreds place is: " + hundreds);
		
	
		
	}
	
	

}
/*screen dump	
 * 
please input a 3 digit number, Ex. 111
111
the ones place is: 1 the tens place is: 1 the hundreds place is: 1
 * 
 * 
 * 
 */




