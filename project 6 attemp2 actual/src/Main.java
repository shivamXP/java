
public class Main {

	public static void main(String[] args) {
	
		SortedList<Integer> mylist = new SortedList<>();
		
		mylist.insert(2);
		mylist.insert(200);
		mylist.insert(68);
		mylist.insert(9000);
      System.out.println(  mylist.search(67) );
		System.out.println(mylist.retrive(1));
		
		for(int j:mylist){
			System.out.println(j);
		}
	
	}

}
