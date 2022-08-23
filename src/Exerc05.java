/*
Implemente um programa em Java que calcule o valor da mensalidade de um aluno de faculdade
de tecnologia, a partir da sigla do curso, se é isento (sim ou não) e do desconto (em %) que
ele possui. Abaixo está o valor da mensalidade para cada curso:

Curso Mensalidade
SI – Sistemas de Informação R$ 550,00
ADS – Análise e Desenv. Sistemas R$ 750,00
CS – Ciência da Computação R$ 1.150,00
EC – Engenharia da Computação R$ 1.300,00
ES – Engenharia de Software R$ 950,00
*/
public class Exerc05 {
	public static void main(String[] args) {
		Double mensalidade = calcularMensalidade("es", false, 10);

		if (mensalidade < 0) {
			System.out.println("Opção Inválida");
			return;
		}
		System.out.println(mensalidade);
	}

	public static double calcularMensalidade(String curso, boolean isento, double desconto) {
		double valor = -1;

		switch (curso.toUpperCase()) {

		case "SI":
			valor = 550.00;
			break;
		case "ADS":
			valor = 750.00;
			break;
		case "CS":
			valor = 1150.00;
			break;
		case "EC":
			valor = 1300.00;
			break;
		case "ES":
			valor = 950.00;
			break;
		default:
			valor = -1;
		}

		if (isento && valor >= 0) {
			return valor = 0.0;
		} else if (!isento && valor >= 0) {
			valor = valor - (valor * desconto / 100);
		}

		return valor;
	}
}
