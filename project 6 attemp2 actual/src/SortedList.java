import java.util.Iterator;

public class SortedList<E extends Comparable<?super E>> extends AbstractList<E> {

	@Override
	public boolean search(E key) {
		return search(key,head);
	    }
	    

	private boolean search(E key,Node<E> curr) {
		if(curr==null){
			return false;
		}
		if(key.compareTo(curr.data)==0){
			return true;
		}else{
			return search(key,curr.next);
		}
	}


	@Override
	public void insert(E data) {
		Node<E> temp =new Node<E>(data);
		head=insert(head,temp);
	}

	private Node<E> insert(Node<E> curr,Node<E> temp) {
		if(curr==null ||temp.data.compareTo(curr.data)<0){
			temp.next=curr;
			curr=temp;
			return curr;
		}
		else{ 
			 curr.next=insert(curr.next,temp);
			 return curr;
		}
		}

	@Override
	public void remove(E key) {
		head=remove(key,head);
	}

	private Node<E> remove(E key,Node<E> curr) {
		if(curr==null){
			return curr;
		}
		if(key.compareTo(curr.data)==0){
			curr=curr.next;
			return curr;
		}else{
			curr.next=remove(key,curr.next);
			return curr;
		}
	}

	@Override
	public E retrive(int index) {
		
		 return retrive(index, head);
		 
	}
	private E retrive(int index, Node<E> curr) {
		 if (curr == null) {
		        return null;
		    }else{
		if(index==0){
			return curr.data;
		}else{
			return retrive(index-1,curr.next);
		}
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
