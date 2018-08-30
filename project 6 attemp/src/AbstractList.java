
public abstract class AbstractList<E> implements List<E> {
	 protected Node<E> head;
	 
	protected class Node<T> {
		protected T data;
        protected Node<T> next;
        protected Node(T data) {
            this.data = data;
        }   
    }
	
}
