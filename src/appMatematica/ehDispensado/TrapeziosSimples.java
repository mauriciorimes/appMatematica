package appMatematica.ehDispensado;

public class TrapeziosSimples {

	static double f(double x) {
		return 1/x;
	}

	public static double calcular(double a, double b) {
		double h = (b - a); 
		double soma = 0.5 * (f(a) + f(b));
			double x = a + h;
			soma = soma + f(x);
	
			return soma * h;
	}
}
