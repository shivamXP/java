package stackArray;

public interface stack<E> extends Iterable<E> {
	
    public boolean empty();
    public E peek();
    public E pop();
    public void push(E data);
	
}
