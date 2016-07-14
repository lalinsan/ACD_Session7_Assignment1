/*
 * Student: Eduardo Aguirre
 * Session 7
 * Assignment 1
 * Java Class that explores the functionality of the Stack Class
 * Add Elements to the Stack | Remove Elements from the Stack | Prints Out Elements of the Stack
 *  
 */

import java.util.Stack; //Import Stack Class from Java Class Library
import java.util.Scanner; //Import the Scanner Java Class that allows the User to Input


public class StackDemo {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) { //Main method to start the Program
		Stack<String> st = new Stack <> (); //Create an Empty String Stack
		Scanner sc = new Scanner (System.in); //Creates an instance of the Stack 
		String choice ="Yes"; //Variable that stores the user entry
		
		//As long as the user choice variable = Yes or Y executes the Code below
		while (choice.equalsIgnoreCase("Yes")||choice.equalsIgnoreCase("Y"))
		{
			System.out.print("Enter an Animal: "); //Prompts user to Enter an Animal
			String animal=sc.next(); //Stores the animal enter by the user in the Animal Variable
			st.push(animal); //Insert the animal into the Stack
			
			System.out.print("Do you want to enter another animal: Y|N : ? "); //Ask user if want to add another animal
			choice = sc.next(); //stores answer from user
		}
			
		    System.out.println("Elements on Stack: " +st); //Prints the Elements on the Stack
		    
		    String peekResult = st.peek(); //Gets the last element of the Stack and store in the peekResult variable
			System.out.println("Last element on Stack " +peekResult); //Prints last element on the Stack
			
			String popResult = st.pop(); //Removes last element of the Stack and stores in the variable popResult
			System.out.println("Element Removed from Stack: " +popResult); //Prints out last element on the Stack that have been removed
            popResult = st.pop(); //Removes last element of the Stack and stores in the variable popResult
            System.out.println("Another Element removed from the stack: "+popResult); //Prints out last element on the Stack that have been removed
            System.out.println("Final Elements on the Stack: " +st); //Prints the Final List of Elements on the Stack
            System.out.println ("Thanks for trying the Stack"); //Prints out a thank you message
                        
	}
			
}
