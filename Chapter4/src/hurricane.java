/*
Program:.java          Last Date of this Revision: March 1, 2022
 
Purpose: create a hurricane application that displays the wind speed for the hurricane category entered by the user.

Author: Bryce Ilcan
School: CHHS
Course: Computer Programming 20
 
 
*/
import java.util.Scanner;
public class hurricane {

	public static void main(String[] args) {
		
		
		Scanner hurricane = new Scanner(System.in); //scanner wave size
		
		
		System.out.println("What is the hurricane category");
		
		
		int hS = hurricane.nextInt(); //declaring wave size

		if(hS == 5) {
			System.out.println("Category: " + hS + " greater than 155 mph or 135 kt or 249 km/hr");
			
		}if(hS == 4) {
			System.out.println("Category: " + hS + " 131-155 mph or 114-135 kt or 210-249 km/hr");
			
		}if(hS == 3) {
			System.out.println("Category: " + hS + " 111-130 mph or 96-113 kt or 178-209 km/hr");
			
		}if(hS == 2) {
			System.out.println("Category: " + hS + " 96-110 mph or 83-95 kt or 154-177 km/hr");
			
		}if(hS == 1) {
			System.out.println("Category: " + hS + " 74-95 mph or 64-82 kt or 119-153 km/hr");
			
		}
		
	
		}
	}


/* screen dump
 * 
What is the hurricane category
3
Category: 3 111-130 mph or 96-113 kt or 178-209 km/hr

 */
 

