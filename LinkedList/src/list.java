
public interface list<E> extends Iterable<E> {
    boolean empty();
    void insert(E data);
    void remove(E key);
    E retrive(int index);
    boolean search(E key);
}
