import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite sua idade: ");

        int idade = scanner.nextInt();


        if (idade <= 16) {
            System.out.println("Não é eleitor");
        } else if ( idade <= 17) {
            System.out.println("Eleitor facultativo");
        } else if (idade >= 18) {
            System.out.println("Eleitor obrigatorio");
        } else if (idade >= 65) {
            System.out.println("Eleitor facultativo");
        }

        scanner.close();
    }
}