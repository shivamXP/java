package queues;

public class Main {

	public static void main(String[] args) {

		queue<Integer> myqueue = new Lqueue<>();
		myqueue.enqueue(1);
		myqueue.enqueue(15);
		myqueue.enqueue(71);
		myqueue.enqueue(19);
		myqueue.enqueue(150);
		myqueue.enqueue(0);
	
		for(int  i : myqueue){
			System.out.println(i);
		}

		}
	}


