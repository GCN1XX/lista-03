import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Informe sua altura em metros: ");
        double altura = scanner.nextDouble();

        double IMC = peso / (altura * altura);

        if (IMC < 20 ) {
            System.out.println("Abaixo do peso");
        } else if (IMC >= 20 && IMC < 25) {
            System.out.println("Peso normal");
        } else if (IMC >=25 && IMC < 30) {
            System.out.println("Sobrepeso");
        } else if (IMC >=30 && IMC < 40) {
            System.out.println("Obeso");
        } else if (IMC > 40) {
            System.out.println("Obeso Mórbido");
        }

        scanner.close();

    }
}
