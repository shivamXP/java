package stackArray;

import java.util.Iterator;

public class LinkedStack<E> implements stack<E> {
	private Node<E> head ;
	
	
	//           Node class    ****************
	
     private class Node<T> {
        private Node(T data) {
            this.data = data;
        }
        private T data;
        private Node<T> next;
    }

     // ************************************
     

	@Override
	public boolean empty() {
		   return head == null;
	}

	@Override
	public E peek() {
		 E temp = null;
		    if (!empty()) {
		        temp = pop();
		        push(temp);
		    }
		    return temp;
	}

	@Override
	public E pop() {
		E temp =null ;
		temp=head.data;
		head.next=head;
		return temp;
	}

	@Override
	public void push(E data) {
		 Node<E> temp = new Node<E>(data);
		    temp.next = head;
		    head = temp;
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>(){
			private Node<E> curr = head;

			@Override
			public boolean hasNext() {
				if(head!=null){
					return true;
				}else{
					return false;
				}
			}

			@Override
			public E next() {
		           E temp = curr.data;
		            curr = curr.next;
		            return temp;
			}
			
		};
	}
}
