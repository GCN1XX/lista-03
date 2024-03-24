import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu do Caixa Eletrônico:");
            System.out.println("1. Exibir saldo");
            System.out.println("2. Exibir extrato");
            System.out.println("3. Realizar depósito");
            System.out.println("4. Realizar saque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção selecionada: Exibir saldo");
                    break;
                case 2:
                    System.out.println("Opção selecionada: Exibir extrato");
                    break;
                case 3:
                    System.out.println("Opção selecionada: Realizar depósito");
                    break;
                case 4:
                    System.out.println("Opção selecionada: Realizar saque");
                    break;
                case 5:
                    System.out.println("Opção selecionada: Sair");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

            System.out.println(); 
        } while (opcao != 5);

        System.out.println("Obrigado por utilizar nosso caixa eletrônico!");
        scanner.close();
    }
}
