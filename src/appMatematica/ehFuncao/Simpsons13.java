package appMatematica.ehFuncao;

public class Simpsons13 {
//y
	static double func(double x) {
		return Math.log(x) / Math.log(2.718);
	}

//função que aproxima a integral
	public static double simpsons13(double ll, double ul, int n) {
		// h
		double h = (ul - ll) / n;

		// matriz que vai guardar o valor de x e fx
		double[] x = new double[999];
		double[] fx = new double[999];

		// calculando valor de x e fx
		for (int i = 0; i <= n; i++) {
			x[i] = ll + i * h;
			fx[i] = func(x[i]);
		}

		// resultado
		double res = 0;
		for (int i = 0; i <= n; i++) {
			if (i == 0 || i == n)
				res += fx[i];
			else if (i % 2 != 0)
				res += 4 * fx[i];
			else
				res += 2 * fx[i];
		}

		res = res * (h / 3);

		// -2*math � o valor da derivada
		// aqui eu preciso colocar a variavel manualmente
		// falta eu conseguir converter x para a formula e depois passar para o
		// principal

		System.out.println(Math.pow(h, 5) + "\n");
		System.out.println("\nErro: " + -((Math.pow(h, 5))/(180*Math.pow(n, 4))) * -6 );

		return res;
	}
}
