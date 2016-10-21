package uebung_2_3;

public class BinomischeFormel {
	
	public static void main(String[] args) {

		double a = 8;
		double b = 3;
		
		double ersterTerm = a*a;
		double zweiterTerm = 2*a*b;
		double dritterTerm = b*b;
		
		System.out.println(ersterTerm + zweiterTerm + dritterTerm);
	}

}
