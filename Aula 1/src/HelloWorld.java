import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Batata \nPula linha");
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Bem vindo "+ nome);
    }
}
