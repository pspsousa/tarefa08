package tarefa08;
import java.util.Scanner;
public class Exercicio09 {
public static void main(String[] Args) {

	/ Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do somatório e a média aritmética dos valores lidos.

        double soma = 0;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 valores numéricos:");

        while (contador < 10) {
            System.out.print("Digite o valor #" + (contador + 1) + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
            contador++;
        }

        double media = soma / 10;
        System.out.println("Total do somatório: " + soma);
        System.out.println("Média aritmética: " + media);

        scanner.close();
	}
}
