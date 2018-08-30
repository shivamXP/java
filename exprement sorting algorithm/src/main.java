import java.lang.*;
import java.io.*;
import java.util.*;
public class main {
	
	// this programme finds lowest value of entered 10 values

	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<=numbers.length-1;i++){
			numbers[i]=scan.nextInt();	
		}
		
	
		
		for (int i=0;i<=numbers.length-1;i++){
			
					int lowest=numbers[i];
					if( numbers[i]<=lowest){
						lowest=numbers[i];
					}
		}
		
		System.out.println("lowest");
		
	}

}
