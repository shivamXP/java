package queues;

public interface queue<E> extends Iterable<E> {
	void enqueue( E data);
	E dequeue();
	boolean isEmpty();
}
