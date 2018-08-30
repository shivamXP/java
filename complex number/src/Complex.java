
public class Complex {
	public Complex(double real, double imag) {

	    this.real = real;
	    this.imag = imag;
	  }

	  public Complex add(Complex o) {

	    return new Complex(real + o.real, imag + o.imag);
	  }

	  private Complex conjugate() {

	    return new Complex(real, -imag);
	  }

	  public Complex div(Complex o) {

	    Complex top = mul(o.conjugate());
	    Complex bot = o.mul(o.conjugate());

	    return new Complex(top.real / bot.real, top.imag / bot.real);
	  }

	  public Complex mul(Complex o) {

	    return new Complex(real * o.real - imag * o.imag, real * o.imag + imag * o.real);
	  }

	  public Complex sub(Complex o) {

	    return new Complex(real - o.real, imag - o.imag);
	  }

	  public String toString() {

	    return "(" + real + (imag < 0.0 ? " - " : " + ") + (imag < 0.0 ? -imag : imag) + "i)";
	  }

	  private double real;
	  private double imag;

}
