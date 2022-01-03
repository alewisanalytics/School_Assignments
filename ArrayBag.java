package chapter02;

public class ArrayBag<T> implements BagInterface<T> {

	private final T[] bag;
	private int numberOfEntries;
	private static final int DEFAULT_CAPACITY = 25;
	private boolean integrityOK=true;
	
	//Creates default capacity for bag
	public ArrayBag() {
		this(DEFAULT_CAPACITY);
	}
	//allows user to set capacity
	public ArrayBag(int desiredCapacity) {
		T[] tempBag= (T[]) new Object[desiredCapacity];
		bag=tempBag;
		numberOfEntries=0;
	}
	
	@Override
	public int getCurrentSize() {
		// TODO Auto-generated method stub
		return numberOfEntries;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(T newEntry) {
		boolean result = true;
		if(isArrayFull()) {
			return false;
		}else {
			bag[numberOfEntries] = newEntry;
			numberOfEntries++;
		}
			return result;
		
	}
	private boolean isArrayFull() {
		return numberOfEntries >= bag.length;
	}
	private T removeEntry(int index) {
		T result = null;
		if(!isEmpty() && index>=0) {
			int lastIndex = numberOfEntries -1;
			bag[index]= bag[lastIndex];
			bag[lastIndex]=null;
			numberOfEntries--;
		}
		return result;
	}

	@Override
	public T remove() {
		checkIntegrity();
		T result = null;
		if (numberOfEntries > 0)
		{
		result = bag[numberOfEntries - 1];
		bag[numberOfEntries - 1] = null;
		numberOfEntries--;
		} // end if
		return result;
		} 

	@Override
	public boolean remove(T anEntry) {
		int index = getIndexOf(anEntry);
		T result = removeEntry(index);
		return anEntry.equals(result);
		
	}

	private int getIndexOf(T anEntry) {
		int where = -1;
		boolean found = false;
		int index=0;
		while(!found && (index < numberOfEntries)) {
			if (anEntry.equals(bag[index])){
				found = true;
				where = index;
			} index++;
		}
		return where;
	}
	@Override
	public void clear() {
		while (!isEmpty())
			remove();

	}

	@Override
	public int getFrequencyOf(T anEntry) {
		int counter=0;
		for (int index=0; index<numberOfEntries; index++) {
			if(anEntry.equals(bag[index])) {
				counter++;
			}
		}
		return counter;
	}
	
	private void checkIntegrity() {
		if (!integrityOK) {
			throw new SecurityException("ArrayBag object is corrupt.");
		}
	}

	//slide 21
	@Override
	public boolean contains(T anEntry) {
		{
			checkIntegrity();
			boolean found=false;
			int index=0;
			while(!found&& (index <numberOfEntries)) {
				if(anEntry.equals(bag[index])) {
					found=true;
				}
				index++;
			}
			return found;
		}
	}

	//slide 10
	@Override
	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] result = (T[])new Object[numberOfEntries];
		
		for (int index=0; index< numberOfEntries; index++) {
			result[index]= bag[index];
		} return result; 
	}
	

}
