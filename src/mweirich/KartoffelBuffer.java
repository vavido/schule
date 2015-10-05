package mweirich;

public class KartoffelBuffer<T> {

	private Node<T> first;

	public T getNext() {
		if (!isEmpty()) {
			T value = first.getValue();
			first = first.getNext();
			return value;
		}
		return null;

	}

	public void append(T value) {

		Node<T> newElement = new Node<T>(value);
		if (isEmpty()) {

			first = newElement;
		} else {
			getLast().append(newElement);
		}
	}

	public boolean isEmpty() {
		return first == null;
	}

	private Node<T> getLast() {

		Node<T> n = first;

		while (n.hasNext()) {
			n = n.getNext();
		}

		return n;
	}

}
