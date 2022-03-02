
/*
Program:.java          Last Date of this Revision: February 24, 2022
 
Purpose: Modification to surfsUp2Of3, prompts the user for the wave height then displays a message dependant on the wave heights.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/

import java.util.Scanner;
public class surfsUp3Of3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner wave = new Scanner(System.in); //scanner wave size
		
		
		System.out.println("What is the wave height today?");
		
		
		int WS = wave.nextInt(); //declaring wave size
		
		if(WS >= 6) {
			System.out.println("Great day for surfing!");
		} if((WS > 3)&(WS < 6)) {
			
			System.out.println("Go body boarding!");
			
		} if((WS >= 0 )&(WS <= 3)) {
			
			System.out.println("Go for a swim.");
			
		}
		

	}

}
/*screen dump
 * 
What is the wave height today?
4
Go body boarding!
 * 
 */
