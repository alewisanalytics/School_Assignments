package chapter07;
/**
 * Asia Lewis
 * November 14, 2021 
 * Data Structure and Algorithms
 * Unit 9 Assignment
 */
public class LinkedDeque<T> implements DequeInterface<T> {

	private DLNode firstNode;
	private DLNode lastNode;

	public LinkedDeque() {

		firstNode = null;
		lastNode = null;
	}

	@Override
	public void addToFront(T newEntry) {
		DLNode<T> newNode = new DLNode<T>(newEntry, null, firstNode);

		if (isEmpty()) {
			lastNode = newNode;
		} else {
			firstNode.setPreviousNode(newNode);
			
		}
firstNode = newNode;
	}

	@Override
	public void addToBack(T newEntry) {

		DLNode<T> newNode = new DLNode<T>(newEntry, lastNode, null);
		if (isEmpty()) {
			firstNode = newNode;
		} else {
			lastNode.setNextNode(newNode);
			
		}
lastNode = newNode;
	}

	@Override
	public T removeFront() {
		T front = getFront();
		firstNode = firstNode.getNextNode();
		return front;
	}

	@Override
	public T removeBack() {
		T back = getBack();
		lastNode = lastNode.getPreviousNode();
		return back;
	}

	@Override
	public T getFront() {
		T front = (T) firstNode.getData();

		if (isEmpty()) {
			throw new RuntimeException();
		} else {
			return front;
		}

	}

	@Override
	public T getBack() {

		if (isEmpty()) {
			throw new RuntimeException();
		} else {
			T back = (T) lastNode.getData();
			return back;
		}

	}

	@Override
	public boolean isEmpty() {
		return (firstNode == null) && (lastNode==null);
	}

	@Override
	public void clear() {
		firstNode = null;
		lastNode = null;

	}

}
