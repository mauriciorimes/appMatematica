package appMatematica;
import java.util.Scanner;

import appMatematica.ehFuncao.Simpsons13;
import appMatematica.ehFuncao.Simpsons38;
import appMatematica.ehFuncao.TrapeziosComposto;
import appMatematica.ehPonto.Simpsons13_ehPonto;
import appMatematica.ehPonto.Simpsons38_ehPonto;
import appMatematica.ehPonto.TrapeziosComposto_ehPonto;

public class Principal {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int op = 0, op2 = 0;

			System.out.println("Escolha qual operacao quer realizar\n\n");
			System.out.println("1-Por funcao \n2-Por pontos\n");
			op = sc.nextInt();
			System.out.println("1-Trapezios Composto \n2-Simpsons 3/8 \n3-Simpsons 1/3\n\n");
			op2 = sc.nextInt();

			if (op == 1 && op2 == 1) {
				System.out.println("\n\nTrapezio Composto - por funcao\n\n");

				double x1;
				double x2;
				int i;
				System.out.println("Digite o valor x1\n");
				x1 = sc.nextDouble();
				System.out.println("Digite o valor x2\n");
				x2 = sc.nextDouble();
				System.out.println("Digite o valor do intervalo\n");
				i = sc.nextInt();

				System.out.println(TrapeziosComposto.trapezio(x1, x2, i));
			}

			if (op == 1 && op2 == 2) {
				System.out.println("\n\nSimples 3/8 - por funcao\n\n");

				float limite_inferior;
				float limite_superior;
				int i;

				System.out.println("Digite o limite inferior\n");
				limite_inferior = sc.nextFloat();
				System.out.println("Digite o limite superior\n");
				limite_superior = sc.nextFloat();
				System.out.println("Digite o numero de iteracoes\n");
				i = sc.nextInt();
				System.out.println(Simpsons38.calcular(limite_inferior, limite_superior, i));
			}

			if (op == 1 && op2 == 3) {
				System.out.println("\n\nSimpsons 1/3- por funcao\n\n");

				float limite_inferior;
				float limite_superior;
				int i;

				System.out.println("Digite o limite inferior\n");
				limite_inferior = sc.nextFloat();
				System.out.println("Digite o limite superior\n");
				limite_superior = sc.nextFloat();
				System.out.println("Digite o numero de iteracoes\n");
				i = sc.nextInt();
				System.out.println(Simpsons13.simpsons13(limite_inferior, limite_superior, i));
			}

			if (op == 2 && op2 == 3) {				
				System.out.println("\n\nSimpsons 1/3- por pontos\n\n");

				int qtdPontos = 0;

				int i = 0;

				System.out.println("Digite a quantidade de pontos\n");
				qtdPontos = sc.nextInt();
				double[] fx = new double[qtdPontos];

				while (i < qtdPontos) {
					System.out.println("Digite um ponto: \n");

					fx[i] = sc.nextDouble();
					i++;
				}

				System.out.println(Simpsons13_ehPonto.simpsons13(fx, qtdPontos));
			}

			if (op == 2 && op2 == 2) {				
				System.out.println("\n\nSimpsons 3/8- por pontos\n\n");

				int qtdPontos = 0;
				int i = 0;

				System.out.println("Digite a quantidade de pontos\n");

				qtdPontos = sc.nextInt();
				double[] fx = new double[qtdPontos];

				while (i < qtdPontos) {
					System.out.println("Digite um ponto: \n");

					fx[i] = sc.nextDouble();
					i++;
				}

				System.out.println(Simpsons38_ehPonto.calcular(fx, qtdPontos));
			}

			if (op == 2 && op2 == 1) {	
				
				System.out.println("\n\nTrapezio Composto- por pontos\n\n");
				
				int n = 7;
				int qtdPontos = 0;
				int i = 0;

				System.out.println("Digite a quantidade de pontos\n");
				qtdPontos = sc.nextInt();

				double[] fx = new double[qtdPontos];

				while (i < qtdPontos) {
					System.out.println("Digite um ponto: \n");

					fx[i] = sc.nextDouble();
					i++;
				}

				System.out.println(TrapeziosComposto_ehPonto.trapezio(fx, n));
			}

		}
	}
}
