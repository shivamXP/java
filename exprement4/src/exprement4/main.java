package exprement4;
import java.util.*;

public class main {

	public static void main(String[] args) {
	
	int[] values = new int[3];
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("enter the 10 numbers for value array");
	
	for(int i=0 ; i<=values.length-1 ;i++){
		
		values[i]=scan.nextInt();
		
	}
	scan.close();
	int sum =0;
	
	for(int i=0 ; i<=values.length-1 ;i++){
		sum=sum+values[i];
	}
	
	System.out.println(sum);
	
	}

}
