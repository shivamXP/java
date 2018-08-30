package practice;

public class stack {
	int size ;
	int[] array ;
	int top=-1;
	stack(int a){
		this.size=a;
		this.array = new int[size];
	}
	void grow(){
		size=2*size;
	}
	
	void push(int x){
		if(top<=size && top>size/2){
	this.grow();
		}
		array[++top]=x;
	}
	int pop(){
		return array[top--];
	}
	
	boolean isempty(){
		return(top==-1);
	}

	   public boolean isFull() {
	      return (top == size-1);
	   }
	void print(){
		for(int i=0 ; i<=size-1;i++){
			System.out.print(array[i]);
		}

		}
	}
	
	

