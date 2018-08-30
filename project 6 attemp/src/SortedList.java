import java.util.Iterator;

public class SortedList<E extends Comparable<?super E>> extends AbstractList<E> {

	@Override
	public boolean search(E key) {

	    for (Node<E> curr = head; curr != null; curr = curr.next) {
	        if (key.compareTo(curr.data) == 0) {
	            return true;
	        }
	    }
	    return false;
		
	}

	@Override
	public void insert(E data) {
		Node<E> temp = new Node<E>(data);
		if(head==null||data.compareTo(head.data)<0){
			temp.next=head;
			head=temp;
		}else{
			Node<E> curr;
			for(curr=head;curr.next!=null;curr=curr.next){
				if(data.compareTo(curr.next.data)<0){
					temp.next=curr.next;
					curr.next=temp;
					return;
				}
				
			}
			curr.next=temp;
			
		}
	}

	@Override
	public void remove(E key) {
		if(!(head==null)){
			if(key.compareTo(head.data)==0){
				head=head.next;
			}
			else{
				for(Node<E> curr=head;curr!=null;curr=curr.next){
					if(key.compareTo(curr.next.data)==0){
						curr.next=curr.next.next;
						break;
					}
				}
			}
		}
		
		
	}

	@Override
	public E retrive(int index) {

	    if (index < 0) {
	        throw new IndexOutOfBoundsException(Integer.toString(index));
	    }
	    Node<E> curr;
	    int i = 0;
	    for (curr = head; i < index && curr != null; curr = curr.next) {
	        ++i;
	    }
	   if(curr != null)
	    {
	    	return curr.data;
	    			}else{
	    				return null;
	    						}
	}

	@Override
	public Iterator<E> iterator() {
		return  new  Iterator<E>(){
			private Node<E> curr = head;

			@Override
			public boolean hasNext() {
				return curr!=null;
			}

			@Override
			public E next() {
				
				while(hasNext()){
					E temp = curr.data;
					curr=curr.next;
					return temp;
				}
				return null;
			}
			
		};
	}
}
