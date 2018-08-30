package binaryTree;

import java.util.Iterator;
import java.util.Stack;

public class BinarySearchTree<E extends Comparable<? super E>> extends BinaryTree<E> {
	 private Node<E> findIOP(Node<E> node) {

	        Node<E> curr;

	        for (curr = node.left; curr.right != null; curr = curr.right);

	        return curr;
	    }

	    public void insert(E data) {
	    	Node<E> temp = new Node<E>(data);
	   
	    	root =insert(root,temp);
	    }
	    
	    private Node<E> insert(Node<E> curr,Node<E> temp) {
	    	
					if(curr==null){
						return temp;
					}
					if(temp.data.compareTo(curr.data)<=0 && curr.left==null){
					curr.left=temp;
					return curr;
					}

					if(temp.data.compareTo(curr.data)>0&&curr.right==null){
					curr.right=temp;
					return curr;
					}
					else{
						if(temp.data.compareTo(curr.data)<=0){
							 curr.left=insert(curr.left,temp);
							 return curr;
						}else{
							 curr.right= insert(curr.right,temp);
							 return curr;
						}
					}
				
				}
	    Stack<E> stack = new Stack<>();

		public void traverse(Node<E> curr) {
			
	        if (curr != null) {
	            traverse(curr.left);
	            stack.push(curr.data);
	            traverse(curr.right);
	        }
	    }

	    public Iterator<E> iterator() {
	    	
	    	return new Iterator<E>(){
	    		

				@Override
				public boolean hasNext() {
					if(stack.isEmpty()){
						return false;
						}else{
							return true;
						}
				}

				@Override
				public E next() {
					while(hasNext()){
						return stack.pop();
					}
					return null;
				}
	    	
	
				};
	    }
	    

	    public void remove(E key) {
	    	root = remove(root, key);
	    }

	    private Node<E> remove(Node<E> root, E key) {
			if(root==null){
				return root;
			}
			if(key.compareTo(root.data)==0){
				if(root.left==null || root.right==null){
					if(root.left!=null){
						root=root.left;
					}else{
						root=root.right;
					}
				}
				else{
					Node<E> iop=this.findIOP(root);
					E temp = root.data;
	                root.data = iop.data;
	                iop.data = temp;
	                Node<E> curr = root;
	                if (curr.left.data.compareTo(key) == 0) {
	                    root.left = root.left.left;
	                }
	                else {
	                    for (curr = curr.left; curr.right != iop; curr = curr.right);
	                    curr.right = iop.left;
					}
				}
				return root;
			}
			else{
				if(key.compareTo(root.data)<0){
					root.left=remove(root.left,key);
				}else{
					root.right=remove(root.right,key);
				}
				return root;
			}
		}

		public boolean search(E data) {
	    	Node<E> curr = root;
	    	return  search(data,curr);
	    }

		private boolean search(E data,Node<E> curr) {
			if(curr==null){
				return false;
			}
			if(data.compareTo(curr.data)==0){
				return true;
			}else{
				if(data.compareTo(curr.data)<=0){
					return search(data,curr.left);
				}else{
					return search(data,curr.right);
				}
			}
			
			
		}
}
