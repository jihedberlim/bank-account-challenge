import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        String name = "Jihed Elmograbi Berlim";
        String accountType = "Corrente";
        double currentBalance = 2500.00;
        int choice = 0;

        System.out.println("**************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome do cliente: " + name);
        System.out.println("Tipo da conta: " + accountType);
        System.out.println("Saldo inicial: R$ " + currentBalance);
        System.out.println("\n**************************************");

        String menu = """
                \nOperações
                
                1. Consultar saldo
                2. Receber valores
                3. Transferir valores
                4. Sair
                """;

        Scanner typedValue = new Scanner(System.in);

        while (choice != 4) {
            System.out.println(menu);
            choice = typedValue.nextInt();

            if (choice == 1) {
                System.out.println("\nSaldo atual: R$ " + currentBalance);
            } else if (choice == 2) {
                System.out.println("\nDigite o valor que irá receber: ");
                double newValue = typedValue.nextDouble();
                currentBalance += newValue;
                System.out.println("\nNovo saldo: R$ " + currentBalance);
            } else if (choice == 3) {
                System.out.println("\nDigite o valor que deseja transferir: ");
                double transfer = typedValue.nextDouble();
                if (transfer > currentBalance) {
                    System.out.println("\nSaldo insuficiente para realizar essa transferência! O seu saldo atual é: R$ " + currentBalance);
                } else {
                    currentBalance -= transfer;
                    System.out.println("\nSaldo atual: R$ " + currentBalance);
                }
            } else if (choice == 4) {
                System.out.println("\nSaindo da consulta!");
            } else {
                System.out.println("\nOpção inválida, escolha as opções disponíveis");
            }
        }
    }

}
