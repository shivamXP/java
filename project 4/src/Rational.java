

public class Rational extends Number implements Comparable<Rational>  {
	
	private int _deno;
    private int _nume;
   
	public Rational(int nume,int deno){
	    
		this._deno=deno;
		this._nume=nume;
		lower();
		
	}
	
	public Rational add(Rational x){
		int xdeno=_deno*x._deno;
		int nume1=_nume*x._deno;
		int nume2=x._nume*_deno;
		int xnume=nume1+nume2;
		lower();
		return new Rational(xnume,xdeno);
		
		}
	public Rational mul(Rational x){
		int xnume=_nume*x._nume;
		int xdeno=_deno*x._deno;
		lower();
		return new Rational(xnume,xdeno);
	}
	
	public Rational div(Rational x){
		int xnume=_nume*x._deno;
		int xdeno=_deno*x._nume;
		lower();
		return new Rational(xnume,xdeno);
	}
	
	public Rational sub(Rational x){
		int xdeno=_deno*x._deno;
		int nume1=_nume*x._deno;
		int nume2=x._nume*_deno;
		int xnume=nume1-nume2;
		
		
		lower();
		  
		    
		
		
		return new Rational(xnume,xdeno);
	}
	
private void lower() {
		
	  int divisor;
	    divisor = Rational.gcd(_nume,_deno);
	    _nume = _nume / divisor;
	    _deno = _deno / divisor;
		
	}

private static int gcd(int xnume,int xdeno){
  int x = xnume;
  int y = xdeno;
  
	int r;
    while (y != 0) {
    r = x % y;
    x = y;
    y = r;
        }
    return x;
}


	  public String toString() {

		    return  "("+_nume+ " / " +_deno+")";
		  }

	
	  public int compareTo(Rational o) {
		
	       Rational a = this;
	      double A = a.doubleValue();
	      double B = o.doubleValue();
	      int x=0;
	   if(A<B){
		   x= -1;
	   }
	   if(A>B){
		  x= 1;
	   }
	   if(A==B)
	   {
		   x= 0;
	   }
	return x;
	}


	public double doubleValue() {
		 return (double)_nume / _deno;
	
	}


	public float floatValue() {
		return (float)doubleValue();
	}


	public int intValue() {
		return (int)doubleValue();
	}

	
	public long longValue() {
		return (long)doubleValue();
	}

	public boolean equals(Rational b){
		if(_nume==b._nume && _deno==b._deno){
			return true;
		}else{
			return false;
		}
	}

}
