
public class Main {

	public static void main(String[] args) {
	
		SortedList<Integer> mylist = new SortedList<>();
		mylist.insert(150);
		mylist.insert(1);
		mylist.insert(105);
		mylist.insert(6);
		mylist.insert(2);
		mylist.insert(0);
		mylist.remove(6);
		
		
		
		for(int j:mylist){
			System.out.println(j);
		}
	}
}
