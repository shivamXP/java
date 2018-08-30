package fizzbuzz;

public class Main {


	public static void main(String[] args) {
	
	String[] array = new String[100];
	
	for(int i=0; i<=array.length-1;i++){
		array[i]=String.valueOf(i);
		if((i%3)==0){
			array[i]="fizz";
		}
		if((i%5)==0){
			array[i]="buzz";
		}
		if(((i%3)==0)&&((i%5)==0)){
			array[i]="fizzbuzz";
		}
		
	}
	for(int i =0 ; i<= array.length-1;i++){
		System.out.println(array[i]+"\n");
	}

	}

}
