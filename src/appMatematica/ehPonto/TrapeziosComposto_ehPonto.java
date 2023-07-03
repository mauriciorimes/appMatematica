package appMatematica.ehPonto;

public class TrapeziosComposto_ehPonto {
	public static double trapezio(double[] fx, int N) {

		double soma = 0;
		for (int i = 0; i < N; i++) {

			if (i == 0 || i == N - 1) {
				soma = soma + fx[i];

			} else {
				soma = soma + 2 * fx[i];

			}
		}		

		soma = (soma * (0.1 / 2.0));

		System.out.println("Erro m�ximo: " + Math.pow(-0.1, 3) / 12 * Math.pow(N, 2) * (2 / Math.pow(3, 3)));
		
		return soma;
	}
}
