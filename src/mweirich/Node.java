package mweirich;

public class Node<T> {

	private T content;
	private Node<T> next;

	public Node(T content) {
		this.content = content;
	}

	public boolean hasNext() {
		return next != null;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
	
	public void append(Node<T> next) {
		this.next = next;
	}
	
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
