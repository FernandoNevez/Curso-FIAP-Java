import java.util.Scanner;

public class SwitchTeste {
    public static void main(String[] args) {
        // Solicitar opções usando switch Taxi, Uber 99pop

        int opcaoTransporte;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite opção de transporte \n1- Taxi \n2- Uber \n3- 99pop");
        opcaoTransporte = leitor.nextInt();
        System.out.println("Opção selecionada " + opcaoTransporte);
        switch (opcaoTransporte) {
            case 1:
                System.out.println("Taxi selecionado");
                break;
            case 2:
                System.out.println("Uber selecionado");
                break;
            case 3:
                System.out.println("99pop selecionado");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

    }
}
