package binaryTree;



public abstract class BinaryTree<E> implements Tree<E> {
	 protected Node<E> root;
    protected class Node<T> {
    	 protected T data;
         protected Node<T> left;
         protected Node<T> right;
        protected Node(T data) {
            this.data = data;
        }
    }
}


