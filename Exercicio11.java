package tarefa08;
import java.util.Scanner;
public class Exercicio11 {
public static void main(String[] args) {

// Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha, banheiro, quartos, área de serviço, quintal, 
garagem, etc.). O programa deve solicitar a entrada do nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor total acumulado da área residencial.


	Scanner scanner = new Scanner(System.in);
        double areaTotal = 0;

        System.out.println("Bem-vindo à Calculadora de Áreas da Residência!");

        while (true) {
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = scanner.nextLine();

            System.out.print("Digite a largura do cômodo em metros: ");
            double largura = scanner.nextDouble();

            System.out.print("Digite o comprimento do cômodo em metros: ");
            double comprimento = scanner.nextDouble();

            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.printf("Área do cômodo %s: %.2f m²%n", nomeComodo, areaComodo);

            System.out.print("Deseja calcular outro cômodo? (SIM/NAO): ");
            scanner.nextLine();
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("NAO")) {
                break;
            }
        }

        System.out.printf("Área total da residência: ", areaTotal);
        System.out.println("Obrigado por usar a Calculadora de Áreas!");

	scanner.close();

	}

}
