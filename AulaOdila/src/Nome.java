import java.util.Scanner;
public class Nome {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String input = nome.nextLine();
        System.out.println("Bem vindo, " + input);
        nome.close();
    }
}
