package appMatematica.ehPonto;

public class Simpsons13_ehPonto {
	// função que aproxima a integral
	public static double simpsons13(double[] fx, int n) {
		// resultado
		double res = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1)
				res += fx[i];
			else if (i % 2 != 0)
				res += 4 * fx[i];
			else
				res += 2 * fx[i];
		}

		// h/3*resultado
		res = (0.5 / 3) * res;
		// receber derivada
		// receber o h

		System.out.println("\nErro: " + (Math.pow(0, 5) * 0 / 180 * Math.pow(n, 4)));

		return res;
	}
}
