package appMatematica.ehPonto;

public class Simpsons38_ehPonto {
	public static double calcular(double fx[], int intervalo) {
		double soma = 0.0;
		for (int i = 0; i < intervalo; i++) {

			if (i == 0 || i == intervalo - 1) {

				soma = soma + fx[i];
			}

			if (i % 3 == 0 && i != 0 && i != intervalo - 1) {
				soma = soma + 2 * fx[i];
			}

			if (i % 3 != 0 && i != 0 && i != intervalo - 1) {
				soma = soma + 3 * fx[i];
			}
		}
		// 3/8*h*soma
		soma = (0.375) * (0.5) * soma;

		return soma;
	}
}
