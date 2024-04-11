package tarefa08;
import java.util.Scanner;
public class Exercicio01 {
public static void main(String[] Args) {

		// Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um numero qualquer


		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o numero que deseja vizualizar a tabuada: ");
		int Multiplicador = scanner.nextInt();

		int Contador = 0;

		while (Contador <= 10) {

		int Resultado = Contador * Multiplicador;
		System.out.println(Contador + " X " + Multiplicador + " = " + Resultado);
		Contador++;

		}
		scanner.close();
	}
}
