package mweirich;

public class Node<T> {

	private T content;
	private Node<T> next;

	/**
	 * 
	 * @param content the value of the node
	 */
	public Node(T content) {
		this.content = content;
	}

	/**
	 * 
	 * @return true if the node has a next node definened, false otherwise
	 */
	public boolean hasNext() {
		return next != null;
	}
	
	/**
	 * Get the next node
	 * @return the node after this one. null if none is defined.
	 */
	public Node<T> getNext() {
		return this.next;
	}
	
	/**
	 * Set the next node for this one
	 * @param next the node to link to this one
	 */
	public void append(Node<T> next) {
		this.next = next;
	}
	
	/**
	 * Get the value of the node
	 * @return the value of the node. 
	 */
	public T getValue() {
		return content;
	}

	@Override
	public void finalize() throws Throwable{
		try {
			super.finalize();
		} catch (Throwable e) {
			throw e;
		}
	}
}
