package chapter07;
/**
 * Asia Lewis
 * November 14, 2021 
 * Data Structure and Algorithms
 * Unit 9 Assignment
 */
import java.util.List;

public class DequeDemo {

	public static void main(String[] args) {
		//Initializes new deque called friendsList	
		LinkedDeque<String> friendsList = new LinkedDeque<String>();

		//Checks if deque is empty
		if (friendsList.isEmpty()) {
			System.out.println("You have no friends in your friends list.\n");
		}
		//Adds 3 friends to back and 3 friends to front of deque
		friendsList.addToBack("Drake Lopez");
		friendsList.addToFront("Jim Henry");
		friendsList.addToFront("Britney Parker");
		friendsList.addToFront("Sarah Lee");
		friendsList.addToBack("Joe Bino");
		friendsList.addToBack("Manisha Johnson");
		
		//Displays friends in front and back
		System.out.println("This person is at the front of your list: "+friendsList.getFront());
		System.out.println("This person is at the back of your list: "+friendsList.getBack());
		
		//Checks if deque is empty
		if (!friendsList.isEmpty()) {
			System.out.println("\nYou now have friends in your friends list.");
		}// end if
		
		//Displays friends in front and back
		System.out.println("This person is at the front of your list: "+friendsList.getFront());
		System.out.println("This person is at the back of your list: "+friendsList.getBack());
		
		//;Removes from front and back of deque
		friendsList.removeFront();
		friendsList.removeBack();
		
		//Displays front and back
		System.out.println("\nThis person is at the front of your list: "+friendsList.getFront());
		System.out.println("This person is at the back of your list: "+friendsList.getBack());
		
		//Clears deque
		friendsList.clear();
		
		//Checks if deque is empty
		if (friendsList.isEmpty()) {
			System.out.println("Now, you have no friends in your friends list.\n");
		}
		
		//This code should cause an exception to be thrown, so it is placed in try/catch block
		//Exception will be thrown because deque is empty when trying to get front and back
		try {
			friendsList.getBack();
			friendsList.getFront();
		} catch (RuntimeException e) {
			System.out.println("Cannot display front or end of friends list. You're list is empty.");
		}

	}

}
