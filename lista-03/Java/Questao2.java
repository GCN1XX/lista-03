import java.util.Scanner;

public class Questao2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("O aluno deve informar suas notas, pra saber se foi aprovado ou não.");

        System.out.println("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = scanner.nextDouble();

        double mediaAritimetica = (nota1 + nota2 + nota3) / 3;

        if (mediaAritimetica >= 6.2) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.printf("Aluno Reprovado, pois sua nota é %.2f" , mediaAritimetica );
        }


        scanner.close();


    }
}
