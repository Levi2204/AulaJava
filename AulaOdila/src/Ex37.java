import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double volume, raio, altura;
        System.out.print("Digite a altura da lata: ");
        altura = num.nextDouble();
        System.out.print("Digite o raio da lata: ");
        raio = num.nextDouble();
        volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println(String.format("O volume da sua lata é: %.2f", volume));
    }
}
