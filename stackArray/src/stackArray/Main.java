package stackArray;

public class Main {

	public static void main(String[] args) {
		stack<Integer> mystack = new LinkedStack<>();
		mystack.push(5);
		mystack.push(7);
		mystack.push(5746);
		mystack.push(123);
		mystack.push(0);
		for(int each : mystack){
			System.out.println(each);
		}
		

	}

}
