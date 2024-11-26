import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int num1;
        int num2;
        int soma;
        int subtracao;
        int multiplicacao;
        double divisao;
        Scanner leitorNumerico = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1 = leitorNumerico.nextInt();
        System.out.println("Digite o Segundo número:");
        num2 = leitorNumerico.nextInt();
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / (double) num2;
        System.out.println("Adição: " + soma + "\nSubtração " + subtracao + "\nMultiplicação " + multiplicacao + "\nDivisão " + divisao);

    }
}
