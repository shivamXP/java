package queues;

import java.util.Iterator;

public class Lqueue<E> implements queue<E> {
	Node<E> head;
	Node<E> tail;
	class Node<T> {
		T data;
		Node(T data){
			this.data=data;
		}
		Node<E> next;
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>(){
			Node<E> curr = head;
			 public boolean hasNext() {
		            return curr != null;
		        }
		        public E next() {
		            E temp = curr.data;
		            curr = curr.next;
		            return temp;
		        }
			
		};
	}

	@Override
	public void enqueue(E data) {
		 Node<E> temp = new Node<E>(data);
		    if (head == null) {
		        head = tail = temp;
		    }
		    else {
		        tail.next = temp;
		        tail = tail.next;
		    }
	}

	@Override
	public E dequeue() {
		E temp = null;
    if (head != null) {
        temp = head.data;
        if (head == tail) {
            head = tail = null;
        }
        else {
            head = head.next;
        }
    }
    return temp;
    }

	@Override
	public boolean isEmpty() {
		return head==null;
	}

}
