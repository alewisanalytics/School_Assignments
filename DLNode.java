package chapter07;
/**
 * Asia Lewis
 * November 14, 2021 
 * Data Structure and Algorithms
 * Unit 9 Assignment
 */
public class DLNode<T> {

	private T data;
	private DLNode<T> next;
	private DLNode<T> previous;

	public DLNode(T dataPortion) {
		this( dataPortion, null, null);

	}

	public DLNode(  T dataPortion, DLNode<T> previousNode,DLNode<T> nextNode) {
		data = dataPortion;
		next = nextNode;
		previous = previousNode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DLNode<T> getNextNode() {
		return next;
	}

	public void setNextNode(DLNode<T> next) {
		this.next = next;
	}

	public DLNode<T> getPreviousNode() {
		return previous;
	}

	public void setPreviousNode(DLNode<T> previous) {
		this.previous = previous;
	}

}
