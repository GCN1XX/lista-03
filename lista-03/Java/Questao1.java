import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();


        double divisao = numero1/numero2;

        System.out.println(numero1 + ">" + numero2);
        
        System.out.println("A divisao dos numeros é:" + divisao);
        

        scanner.close();


        
    }
}