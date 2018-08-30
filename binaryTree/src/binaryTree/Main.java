package binaryTree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		tree.insert(5);
		tree.insert(10);
		tree.insert(40);
		tree.insert(66);
		tree.remove(66);
		
		tree.traverse(tree.root);
		System.out.println(tree.stack.pop());
			for(int j:tree){
		System.out.println(j);
	}
			
			tree.insert(89);
			tree.insert(8);
			tree.insert(11);
			tree.insert(45);
			tree.insert(98);
			tree.insert(50);
			tree.insert(20);
			tree.insert(6);
			System.out.println("******************  ");
			tree.traverse(tree.root);
			System.out.println(tree.stack.pop());
				for(int k:tree){
			System.out.println(k);
		}
			
	}

}
