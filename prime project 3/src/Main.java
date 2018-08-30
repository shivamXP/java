import java.util.Scanner;

public class Main {
	public static int u = 2;
 public static int max;
	public static void main(String[] args) {
		
		System.out.println("enter the number up to which you want prime numbers ");
		Scanner scan = new Scanner(System.in);
		max=scan.nextInt()+1;
		scan.close();
		int[] numbers = new int[max];
		for(int s=0;s<=max-1;s++){
			numbers[s]=s;
		}
		
		sieve(numbers);
		for(int l=0;l<=max-1;l++){
			if(numbers[l]!=0){
		System.out.println(numbers[l]);}
		}
		
		
	}
	public static void sieve(int[] num){
		for(int i=0;i<=num.length-1;i++){
			System.out.println("i = "+ i + "u ="+u);
			if(i==0){
				num[i]=0;
			}
			
			
			if(i==1){
				num[i]=0;
			}
			
		
			 if(i==u){
				 int mul=u;
				 System.out.println(u*mul);
				 while(u*mul<=num.length-1){
				 num[u*mul]=0;
				 mul++;
				 }
				 u++;
			}

				}	
					
			}
		
		}
		
		
	