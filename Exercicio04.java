package tarefa08;
public class Exercicio04 {
public static void main(String[] Args) {

	// Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.

        for (int i = 0; i <= 20; i++) {
        if (i % 2 != 0) {
        System.out.println("Número ímpar: " + i);
	}
	}
}
