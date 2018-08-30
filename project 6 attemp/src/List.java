
public interface List<E> extends Iterable<E> {
	
	boolean search(E key);
	void insert(E data);
	void remove(E key);
	E retrive(int index);
}
