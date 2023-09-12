import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número: ");
        numero = num.nextInt();
        System.out.println("O número digitado foi: " + numero);
        System.out.println("O quadrado desse número é: " + (numero * numero));
        System.out.println("A raiz quadrada desse número é: " + (Math.sqrt(numero)));
    }
}
