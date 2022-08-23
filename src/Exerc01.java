
/*1. Implementar uma função que retorne uma mensagem com a ação que um pedestre deve realizar ao ver seu semáforo. 
 * As possíveis ações estão listadas abaixo.
 * Se a cor for diferente, a função deve retornar um Erro com a informação: "Farol inoperante"
- Vermelho -> Espere
- Verde -> Atravasse*/
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("O semáforo está verde ou vermelho?");
		String acao = andarOuParar(input.next());
		System.out.println(acao);

	}

	public static String andarOuParar(String cor) {
		String acao = "";

		if (cor.equalsIgnoreCase("verde")) {
			acao = "Atravesse";
		} else if (cor.equalsIgnoreCase("vermelho")) {
			acao = "Espere";
		} else {
			acao = "Farol inoperante";
		}
		return acao;
	}

}
//Scanner input = new Scanner(System.in);
//System.out.println("Qual a cor do Semaforo?");
//
//String cor = input.next();
//
//if (cor.equalsIgnoreCase("verde")) {
//	System.out.println("Atravesse");
//
//} else if (cor.equalsIgnoreCase("vermelho")) {
//	System.out.println("Espere");
//
//} else {
//	System.out.println("Farol Inoperante");
//}