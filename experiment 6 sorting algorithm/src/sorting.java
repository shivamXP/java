import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<=numbers.length-1;i++){
			numbers[i]=scan.nextInt();	
		}
		scan.close();
		
		for(int i=0;i<=numbers.length-1;i++){
			
			for(int j=i+1;j <= numbers.length-1;j++){
				if(numbers[j]<numbers[i]){
					int low=0;
					int current=0;
					low=numbers[j];
					current=numbers[i];
					numbers[i]=low;
					numbers[j]=current;
				}
			}
		}
		System.out.println("numbers in assending order:");
		for(int k=0;k<=numbers.length-1;k++){
			System.out.print(numbers[k]+" - ");
		}
		

	}

}

//yeah i did it... but this peace of code take 1 hr thats silly i know !!
