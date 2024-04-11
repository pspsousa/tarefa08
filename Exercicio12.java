package tarefa08;
import java.util.Scanner;
public class Exercicio12 {
public static void main(String[] Args) {

	// Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo usuário.
Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        System.out.println("Digite valores inteiros positivos (insira um valor negativo para encerrar):");
        while (true) {
            System.out.print("Digite um valor: ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                break; // Encerra o loop se o valor for negativo
            }

            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }
        System.out.println("Maior valor informado: " + maior);
        System.out.println("Menor valor informado: " + menor);
        scanner.close();
	
	}
}
