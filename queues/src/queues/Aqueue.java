package queues;

import java.util.Iterator;



public class Aqueue<E> implements queue<E> {
	int head=0;
	int tail=0;
	Object[] queue = new Object[10];
	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>(){
			int curr=head;
			@Override
			public boolean hasNext() {
				return curr!=tail;
			}

			@Override
			public E next() {
				E temp=(E)queue[curr];
				curr=(curr+1)%queue.length;
				return temp;
			}
			
		};
	}

	@Override
	public void enqueue(E data) {
		if (head == (tail + 1) % queue.length) {
	        grow();
	    }
	    queue[tail] = data;
	    tail = (tail + 1) % queue.length;
	}

	@Override
	public E dequeue() {
		 E temp = null;
	    if (head != tail) {
	        temp = (E)queue[head];
	        head = (head + 1) % queue.length;
	    }
	    if (queue.length > 10 && (queue.length + tail - head) % queue.length < queue.length / 3) {
	        shrink();
	    }
	    return temp;
	}

	@Override
		public boolean isEmpty() {
		    return head == tail;
		}
	
	public void grow() {
	    Object[] temp = new Object[queue.length * 2];
	    for (int i = 0; i < queue.length; ++i) {
	        temp[i] = queue[(i + head) % queue.length];
	    }
	    head = 0;
	    tail = queue.length - 1;
	    queue = temp;
	}

	public void shrink() {
	    Object[] temp = new Object[queue.length / 2];
	    for (int i = 0; (i + head) % queue.length != tail; ++i) {
	        temp[i] = queue[(i + head) % queue.length];
	    }
	    tail = (queue.length + tail - head) % queue.length;
	    head = 0;
	    queue = temp;
	}

}
