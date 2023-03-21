package vetores;

import java.util.Locale;
import java.util.Scanner;

public class maioremenoridadeemediadealtura {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] sexo = new char[n];

		for (int i = 0; i < n; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
		}
		double maiorAltura = altura[0];
		double menorAltura = altura[0];

		for (int i = 0; i < n; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}

			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		double somaF = 0;
		int qtdMulheres = 0;

		for (int i = 0; i < n; i++) {
			if (sexo[i] == 'F') {
				somaF = somaF + altura[i];
				qtdMulheres++;
			}
		}
		double media = somaF / qtdMulheres;
		int qtdHomens = 0;

		for (int i = 0; i < n; i++) {
			if (sexo[i] == 'M') {
				qtdHomens++;
			}
		}

		System.out.printf("menor altura = %.2f%n", menorAltura);
		System.out.printf("maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("numero de homens = " + qtdHomens);
		
		sc.close();

	}

}
