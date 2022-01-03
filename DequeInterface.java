package chapter07;
/**
 * Asia Lewis
 * November 14, 2021 
 * Data Structure and Algorithms
 * Unit 9 Assignment
 */
//Slide 26
public interface DequeInterface<T> {

	/**
	 * Adds new entry to front or back of the deque.
	 * 
	 * @param newEntry is the new object being added
	 */
	public void addToFront(T newEntry);

	public void addToBack(T newEntry);

	/**
	 * Removes and returns the front/back entry of this deque.
	 * 
	 * @return The object at the front/back of deque.
	 */
	public T removeFront();

	public T removeBack();

	/**
	 * Retrieves the front/back entry
	 * 
	 * @return the object at the front/back
	 */
	public T getFront();

	public T getBack();

	public boolean isEmpty();

	/**
	 * Removes all entry from this deque.
	 */
	public void clear();

}
