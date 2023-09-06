//import java.util.Scanner;
//
//public class EntradasMultiplosValores {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite seu nome: ");
//        String nome = scanner.nextLine();
//
//        System.out.print("Digite sua idade: ");
//        int idade = scanner.nextInt();
//
//        // Limpar o buffer de entrada após ler o número inteiro
//        scanner.nextLine();
//
//        System.out.print("Digite sua cidade: ");
//        String cidade = scanner.nextLine();
//
//        System.out.println("Nome: " + nome);
//        System.out.println("Idade: " + idade);
//        System.out.println("Cidade: " + cidade);
//
//        scanner.close();
//    }
//}
import java.util.Scanner;
public class Perguntas {
    public static void main(String[] args) {
        Scanner perguntas = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nome = perguntas.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = perguntas.nextInt();
        perguntas.nextLine();
        System.out.println("Digite a cidade onde você nasceu: ");
        String cidade = perguntas.nextLine();

        System.out.println("Bem vindo, " + nome + " você nasceu em " + cidade + " e tem " + idade + " anos");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);

        perguntas.close();
    }
}
