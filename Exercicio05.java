package tarefa08;
public class Exercicio05 {
public static void main(String[] args) {

	//Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).

	long Resultado;
        for (int expoente = 0; expoente <= 15; expoente++) {
            Resultado = calcularPotencia(3, expoente);
            System.out.println("3^" + expoente + " = " + Resultado);
        }
    }

    public static long calcularPotencia(int base, int expoente) {
        long Resultado = 1;
        for (int i = 0; i < expoente; i++) {
            Resultado *= base;
        }
        return Resultado;
	}
}
