package stackArray;

import java.util.Iterator;

public class ArrayStack<E> implements stack<E> {

public class Itertor<E> implements Iterator<E> {
	private int curr = top;

	@Override
	public boolean hasNext() {
		if(top>=0){
			return true;
		}else{
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public E next() {
		
			return  (E)array[--curr];
	}
}
	
	Object[] array = new Object[10];
	int top=0;

	@Override
	public boolean empty() {
		if(top==0){
			return true;
		}else{
			return false;
		}
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
	public void push(E data) {
	    if (top >= array.length) {
	        grow();
	    }
	    array[top++] = data;
	}

	@Override

public E pop() {
    E temp = null;
    if (top > 0) {
        temp = (E)array[--top];
    }
    if (array.length > 10 && top < array.length / 3) {
        shrink();
    }
    return temp;
}
private void shrink() {
    Object[] temp = new Object[array.length / 2];
    for (int i = 0; i < top; ++i) {
        temp[i] = array[i];
    }
    array = temp;
}
private void grow() {
    Object[] temp = new Object[array.length * 2];
    for (int i = 0; i < array.length; ++i) {
        temp[i] = array[i];
    }
    array = temp;
}

@Override
public Iterator<E> iterator() {
	return new Itertor<E>();
	
}

}
