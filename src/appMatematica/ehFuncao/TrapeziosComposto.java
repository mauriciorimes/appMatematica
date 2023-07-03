package appMatematica.ehFuncao;

public class TrapeziosComposto {	
	static double f(double x) {
//		return 1/x;
		return Math.log(x)/Math.log(2.718);
	}

	public static double trapezio(double a, double b, int N) {
		double h = (b - a) / N; 
		double soma = 0.5 * (f(a) + f(b));
		for (int i = 1; i < N; i++) {
			double x = a + h * i;
			soma = soma + f(x);
		}

//		System.out.println("Erro m�ximo: " + Math.pow(-h, 3)/12*Math.pow(N, 2)*(2/Math.pow(3, 3)));

		System.out.println("Erro maximo: " + -((Math.pow(h, 3)/12))*N*-1/Math.pow(1, 2));		

		return soma * h;
	}

}
