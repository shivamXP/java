
public class Pascal {

	 
	public static int[] triangle(int n) {
    if(n==1){
    	return new int[] {1};
    }
    if(n==2){
    	return new int[] {1,1};
    }else{
    	int[] previuos = triangle(n-1);
    	int[] current = new int[n];
    	current[0]=1;
    	current[n-1]=1;
    	for(int i=1;i<=n-2;i++){
    		current[i]=previuos[i-1]+previuos[i];	
    	}
    	return current;
    }
	
}
}
