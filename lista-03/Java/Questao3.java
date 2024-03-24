import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("O número total de eleitores: ");
        int númeroEleitores = scanner.nextInt();

        System.out.println("O número de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.println("O número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.println("O número de votos válidos: ");
        int votosVálidos = scanner.nextInt();

        double percentualBrancos = votosBrancos / númeroEleitores * 100;
        double percentualNulos = votosNulos / númeroEleitores * 100;
        double percentualValidos = votosVálidos / númeroEleitores * 100;

        System.out.println("\nResultados:");
        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);

        scanner.close();

   }
    
}

