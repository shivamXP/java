
public class main {

	public static void main(String[] args) {
		  Complex a = new Complex(2.0, 3.0);
		    Complex b = new Complex(1.0, 2.0);

		    System.out.println(a + " + " + b + " = " + a.add(b));
		    System.out.println(a + " - " + b + " = " + a.sub(b));
		    System.out.println(a + " * " + b + " = " + a.mul(b));
		    System.out.println(a + " / " + b + " = " + a.div(b));
	}

}
