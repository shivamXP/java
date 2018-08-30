package pi;

public class pi {
	
	
	

	public static void main(String[] args) {
		
		
		
		
		double inside =0;
		double numberofhits =0;
	
		double PIby4;
		double pi;
		
		
		for(int i=0;i<10000000;i++){
			
			numberofhits++;
			
		 double x = Math.random();
		 double y = Math.random();
		 
		 if ((x*x)+(y*y)<1){
			 inside++;
		 }
		 }
		
		PIby4 = inside/numberofhits;
		
		System.out.println("after 10000000 interations value if PI/4 is "+ PIby4 );
		
		pi=PIby4*4;
		
		System.out.println("pi = (pi/4)*4 = " + pi);
		
	}

}
