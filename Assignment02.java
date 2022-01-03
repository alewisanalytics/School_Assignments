/**
 * Asia Lewis
 * September 12, 2021 
 * Data Structure and Algorithms
 * Unit 1 Assignment Console Output
 */


package chapter02;

import java.util.Random;
import java.util.Scanner;

public class Assignment02 {
	public static void main(String[] args) {
		
		//Declaring variables
		int m,n, random, userInput, correct ;
		boolean game= true; //if true, game will run through while loop
		
		
		//initializing objects and bags
		Random guess = new Random();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ArrayBag<Integer> bag= new ArrayBag<Integer>();//bag for game, holds random integer(s) selected
		ArrayBag<Integer> guessBag = new ArrayBag<Integer>();//bag for user, holds the guessed integers
		
		
		while(game) {
		//Start of game
			game=false;//set to false at start of game to avoid infinite loop
		System.out.println("Welcome to the number guessing game, please specify a range from 1 to ??");
		System.out.println("Enter end range: ");
		
		//user specifies range
		userInput= sc.nextInt();
		
		//Program crashes if range is less than or equal to 0, so user is not allowed to input it
		while (userInput<=1) {
			System.out.println("Are you trying to break the game??? You can not select a range less than 2!");
			System.out.println("Enter end range: ");
			userInput= sc.nextInt();
			
		}
		//Game will simply last forever if a user puts in a range too great, so user is limited to max range of 100
		while (userInput>101) {
			System.out.println("You picked a range greater than 100!! I don't have time for these games, please be reasonable.");
			System.out.println("Enter end range: ");
			userInput= sc.nextInt();
		}
		
		//since m is exclusive and we want the userInput to be inclusive in the range, we add 1 to userInput
		m=userInput+1;

		//user specifies the amount of integers the program selects from the range
		System.out.println("How many numbers should be picked from this range? ");
		n= sc.nextInt();
		
		//Program blocks the user from entering a number equal to the amount of integers in the range
		while((m-1)<=n) {
			System.out.println("You want me to pick the same amount or more of numbers in the range? Boo! That's no fun. Try again.");
			System.out.println("How many numbers should be picked from this range? ");
			n= sc.nextInt();
		}
		System.out.println("Selecting " +n+ " at random from range 1-"+(m-1)+ " ...");
		
		//initializing random integer
		random=0;
		
		//loops n times, each iteration a random integer is selected and added to bag
		for(int i=n;i>0;i--) {
			random= guess.nextInt(m-1)+1;
			bag.add(random);
			
		}
		
		System.out.println("Guess which " +n +" number(s) were selected (Hint:Enter all numbers and"
				+ " separate each number with a space)"); 
		//Stores user's guesses/input into guessBag
		for(int i=0; i<n; i++) {
			userInput=sc.nextInt();
			guessBag.add(userInput);
		}
		
		//initializing correct variable, will hold integer for correct amount of guesses
		correct=0;
		
		//checks to see if correct guesses exist and returns number of correct guesses
		for( int index=0; index<n;index++) {
			userInput=guessBag.remove();//removes an integer from bag, that same integer is stored in userInput
			
			if(bag.contains(userInput)) {
			correct++;	
			}//end if statement
			
		}//end of for loop
		
		//if all guesses are correct, user wins (n is amount of guesses/random numbers selected)
		if(correct==n) {
			System.out.println("All your guesses are right! YOU WIN!!!");
		}
		
		//ELSE: Allows user to guess one more time if they did not win
		else {
			
			System.out.println("You guessed "+correct+ " correct. Guess again.");
			//sets correct back to zero
			correct=0;
			System.out.println("Guess which " +n +" number(s) were selected (Hint:Enter all numbers and"
					+ " separate each number with a space)"); 
			
			//Stores user's guesses/input into guessBag
			for(int i=0; i<n; i++) {
				userInput=sc.nextInt();
				guessBag.add(userInput);
			}
			
			//checks to see if correct guesses exist and returns number of correct
			for(int index=0; index<n;index++) {
				userInput=guessBag.remove();
				
				if(bag.contains(userInput)) {
				correct++;
				}
			}//end for loop
			
			if(correct==n) {
				System.out.println("All your guesses are right! YOU WIN!!!");
			}else {
				System.out.println("You guessed "+correct+ " correct. No more guesses. You lose :(");
			}//end  2nd else
			
			
		}//end 1st else
		
		//Asks if user would like to play again, closes game if no
			System.out.println("Play again? (Type 'yes' for yes and 'no' for no)");
				userInput=sc.nextInt();
				if(userInput==1) {
					game=true;
				}else {
					System.out.println("I don't like playing with you anyway, bye.");
					System.exit(userInput);
				}//end else
				
		}//end of while loop for game
		
	}//end main statement

}//end of program
