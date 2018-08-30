/*
this code take command line argument. you can input any one int number in command line.

or it can take input by scanner but i have commented out the scanner part if you want you can 
uncomment that part

thank you
*/
import java.util.Scanner;

public class main {
	
     public static int max;

		public static void main(String[] args) {
			
			int firstArg =0;
			if (args.length > 0) {
			  
			        firstArg = Integer.parseInt(args[0]);
			    
			}
			
			System.out.println("**********************************\n"+"The Sieve of Eratosthenes \n\n**********************************\n\n"+"this are the prime numbers up to "+firstArg+"\n");
		/*	Scanner scan = new Scanner(System.in);
			max=scan.nextInt()+1;
			scan.close();
		*/
			
			max=firstArg;
			int[] numbers = new int[max];
			for(int s=0;s<=max-1;s++){
				numbers[s]=1;
			}
			
			sieve(numbers);
			for(int l=0;l<=max-1;l++){
				if(numbers[l]!=0){
			System.out.println(l);
			}
				}
			
			
			
			for(int l=0;l<=max-1;l++){
				if(numbers[l]!=0){
					numbers[l]=l;
				}
			}
			
			System.out.print("**************************************\n");
			System.out.println("Goldbach's Conjecture \n\n**************************************\n\n"+"and these are the all even numbers sumed up by two prime numbers \n");
			goldbach(numbers);
			
		}
		public static void sieve(int[] num){
			for(int i=0;i<=num.length-1;i++){
			
				num[0]=0;
				num[1]=0;
				
				if(i!=0 && i!=1){
					for(int j=2*i;j<=max-1;j+=i){
						
		                num[j]=0;
		                
					}
			    	
				}
				}	
						
			}
		public static void goldbach(int[] num){
			for(int i=4;i<=num.length;i=i+2){
				
					for(int r=0;r<=num.length-1;r++){
						if(num[r]!=0){
						for(int s=0;s<=num.length-1;s++){
							if(num[s]!=0){
							if(i==num[s]+num[r]){
								System.out.println("number "+i+" = (prime)"+ r +" + (prime) "+s);
							
							}
						}
						}
						
						
						}
					}
				
			}
		}
	}

		 
		


