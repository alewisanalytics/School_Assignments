package chapter01;
/**
 * Asia Lewis
 * September 3, 2021 
 * Data Structure and Algorithms
 * Unit 1 Assignment
 */
public class GetVowel {

	public static void main(String[] args) {
		
		//This Bag contains one letter strings
		Bag<String> letters = new Bag<String>();
		
	//adding one-letter strings to letter bag
		letters.add("i"); letters.add("i"); letters.add("e");
		letters.add("e"); letters.add("e"); letters.add("g");
		letters.add("a"); letters.add("a");letters.add("a");letters.add("a");letters.add("a");
		letters.add("h"); letters.add("u"); letters.add("e");
		
		//This Bag is empty, vowels will be inserted into this bag
		Bag<String> vowels = new Bag<String>();
		
		while(!letters.isEmpty()) {
			
			
			//Checks to see if letters bag contains a string with a vowel
				//if a vowel exists, it is removed from letters bag and added to vowels bag
				//else the string is removed from letters bag
			if (letters.contains("i") || letters.contains("o")
					|| letters.contains("e") || letters.contains("a")
					|| letters.contains("u"))  {
				String string = letters.remove(); 
				vowels.add(string);
			} else {
				letters.remove();
			}
		}//end of while loop
		
		
		System.out.println("The letter i appears " +vowels.getFrequencyOf("i")+ " times");
		System.out.println("The letter o appears " +vowels.getFrequencyOf("o")+ " times");
		System.out.println("The letter e appears " +vowels.getFrequencyOf("e")+ " times");
		System.out.println("The letter a appears " +vowels.getFrequencyOf("a")+ " times");
		System.out.println("The letter u appears " +vowels.getFrequencyOf("u")+ " times");
		System.out.println("Total number of vowels: "+ vowels.getCurrentSize());
	}

}
