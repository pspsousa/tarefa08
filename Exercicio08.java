package tarefa08;
public class Exercicio08 {
public static void main(String[] Args) {

	//Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa deve apresentar os valores das duas temperaturas. A fórmula de conversão é F = (9C +160) /5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

        int celsiusInicial = 10;
        int celsiusFinal = 100;
        int incremento = 10;

        System.out.println("Conversão de Celsius para Fahrenheit:");
        System.out.println("-------------------------------------");
        System.out.println("Celsius \t Fahrenheit");
        System.out.println("-------------------------------------");

        for (int celsius = celsiusInicial; celsius <= celsiusFinal; celsius += incremento) {
        double fahrenheit = (9.0 * celsius + 160.0) / 5.0;
        System.out.printf("%d°C \t\t %.2f°F%n", celsius, fahrenheit);
        }
	}
}
