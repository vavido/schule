package mweirich;

public class KartoffelBuffer<T> {

	private Node<T> first;

	/**
	 * Get the next element from the beginnign of the buffer
	 * @return the first element in the buffer
	 */
	public T getNext() {
		if (!isEmpty()) {
			T value = first.getValue();
			first = first.getNext();
			return value;
		}
		return null;

	}

	/**
	 * Add an element to the end of the buffer
	 * @param value the element to add
	 */
	public void append(T value) {

		Node<T> newElement = new Node<T>(value);
		if (isEmpty()) {

			first = newElement;
		} else {
			getLast().append(newElement);
		}
	}

	/**
	 * Indicates if the buffer is empty
	 * @return true if the buffer is empty, flase otherwise
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * Get the last element of the buffer to append a new element
	 * @return the last node in the buffer
	 */
	private Node<T> getLast() {

		Node<T> n = first;

		while (n.hasNext()) {
			n = n.getNext();
		}

		return n;
	}

}
