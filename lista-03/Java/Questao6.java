import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um número de 1 a 4: ");

        System.out.println("1");      
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");

        int Digite = scanner.nextInt();

        if (Digite == 1) {
            System.out.println("Voce escolheu Primavera");
        } else if (Digite == 2) {
            System.out.println("Voce escolheu Verão");
        } else if (Digite == 3) {
            System.out.println("Voce escolheu Outono");
        } else if (Digite == 4) {
            System.out.println("Voce escolheu Inverno");
        }

        scanner.close();
    }
}