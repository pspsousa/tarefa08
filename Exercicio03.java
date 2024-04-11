package tarefa08;
public class Exercicio03 {
public static void main(String[] Args) {

	// Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.

        int limiteSuperior = 500;
        int soma = 0;

        for (int i = 1; i <= limiteSuperior; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos valores pares de 1 a 500 é: " + soma);
		}
	}
}
