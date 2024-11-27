import java.util.Scanner;

public class Rodizio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String placaCarro;
        char[] caracteres;
        int ultimoNumero;

        System.out.println("Digite a placa do carro");
      placaCarro = leitor.nextLine();

caracteres = placaCarro.toCharArray();
        System.out.println(caracteres);

       ultimoNumero = Character.getNumericValue(caracteres[6]);
       System.out.println(ultimoNumero);

       switch (ultimoNumero) {
           case 1:
           case 2:
               System.out.println("Rodízio de Segunda");
               break;
           case 3:
           case 4:
               System.out.println("Rodízio de Terça");
               break;
           case 5:
           case 6:
               System.out.println("Rodízio de Quarta");
               break;
           case 7:
           case 8:
               System.out.println("Rodízio de Quinta");
               break;
           case 9:
           case 0:
               System.out.println("Rodízio de Sexta");
               break;
           default:
               System.out.println("Placa Inválida");
       }
    }
}
