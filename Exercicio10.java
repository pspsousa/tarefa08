package tarefa08;
public class Exercicio10 {
public static void main(String[]Args) {

	// Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores pares situados na faixa numérica de 50 a 70.

	int limiteInferior = 50;
        int limiteSuperior = 70;

        int soma = 0; 
        int contador = 0; 

        for (int valor = limiteInferior; valor <= limiteSuperior; valor++) {
            if (valor % 2 == 0) { 
                soma += valor;
                contador++;
            }
        }

        double media = (double) soma / contador;
        System.out.println("Soma dos valores pares: " + soma);
        System.out.println("Média aritmética dos valores pares: " + media);
	}
}
