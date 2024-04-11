package tarefa08;
public class Exercicio02 {
public static void main(String[] Args) {

	// Apresentar o total da soma obtida dos cem primeiros n meros inteiros (1+2+3+4+...+98+99+100).

        int n = 100;
        int soma = 0;

        for (int i = 1; i <= n; i++) {
        soma += i;
        }

        System.out.println("A soma dos cem primeiros números inteiros é: " + soma);
	}
}
