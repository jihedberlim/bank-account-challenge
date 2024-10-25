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


    }

}
