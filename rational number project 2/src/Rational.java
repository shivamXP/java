
public class Rational {
	
	private int _deno;
    private int _nume;
     
	public Rational(int nume,int deno){
	    
		this._deno=deno;
		this._nume=nume;
		
	}
	
	public Rational add(Rational x){
		int xdeno=_deno*x._deno;
		int nume1=_nume*x._deno;
		int nume2=x._nume*_deno;
		int xnume=nume1+nume2;
		
		return new Rational(xnume,xdeno);
		
		}
	public Rational mul(Rational x){
		int xnume=_nume*x._nume;
		int xdeno=_deno*x._deno;
		return new Rational(xnume,xdeno);
	}
	
	public Rational div(Rational x){
		int xnume=_nume*x._deno;
		int xdeno=_deno*x._nume;
		return new Rational(xnume,xdeno);
	}
	
	public Rational sub(Rational x){
		int xdeno=_deno*x._deno;
		int nume1=_nume*x._deno;
		int nume2=x._nume*_deno;
		int xnume=nume1-nume2;
		return new Rational(xnume,xdeno);	
	}
	
	  public String toString() {

		    return  "("+_nume+ " / " +_deno+")";
		  }
	
}
