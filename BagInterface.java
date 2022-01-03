package chapter01;
//Chp 1 Bag.pdf - Slide 8-9
public interface BagInterface<T> {

	/**
	 * Gets the current number of entries in this bag
	 * @return The int number of entries
	 */
	public int getCurrentSize();
	
	/**
	 * Sees if bag is empty
	 * @return true if bag is empty false if not
	 */
	public boolean isEmpty();
	
	/**
	 * Add new entry to bag
	 * @param newEntry the obj to be added
	 * @return true if add is successful, false if not
	 */
	public boolean add(T newEntry);
	
	/**
	 * Removes one unspecified entry from this bag
	 * @return the removed entry or null
	 */
	public T remove(); 
	
	public boolean remove(T anEntry);
	
	/**
	 * removes all entry from this bag
	 */
	public void clear();
	
	/**
	 * counts the amount of times a given entry appears
	 * @param anEntry The entry to be counted
	 * @return the number of times anEntry appears in the bag
	 */
	public int getFrequencyOf(T anEntry);
	
	/**
	 * test whether this bag contains a given entry
	 * @param 
	 * @return
	 */
	public boolean contains(T anEntry);
	
	/**
	 * 
	 * @return
	 */
	public T[] toArray();
	
	
	
}
