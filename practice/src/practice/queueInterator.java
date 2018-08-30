package practice;

public interface queueInterator<E> extends Iterable<E>{
	
       E dequeue();
    void enqueue(E data);
}
