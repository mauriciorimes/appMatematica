package appMatematica.ehFuncao;

public class Simpsons38 {

	static double func(double x) {
		return Math.log(x) / Math.log(2.718);
	}

	public static double calcular(double limite_inferior, double limite_superior, int intervalo) {
		double h = (limite_superior - limite_inferior) / intervalo;

		double soma = func(limite_inferior) + func(limite_superior);

		for (int i = 1; i < intervalo; i++) {
			if (i % 3 == 0)
				soma = soma + 2 * func(limite_inferior + i * h);
			else  {
				soma = soma + 3* func(limite_inferior + i * h);
			}
		}

		System.out.println(
				"\nErro: " + (Math.pow(limite_superior-limite_inferior,5)/80*Math.pow(intervalo, 4))*0);
		return ((3 * h/8)) *soma;
	}
}
