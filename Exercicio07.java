package tarefa08;
public class Exercicio07 {
public static void main(String[] Args) {

	// Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.

 	int n = 15;
	int primeiroTermo = 1;
        int segundoTermo = 1;

        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");

        for (int i = 0; i < n; i++) {
        System.out.print(primeiroTermo + " ");

        int proximoTermo = primeiroTermo + segundoTermo;

        primeiroTermo = segundoTermo;
        segundoTermo = proximoTermo;
        }
	}
}
