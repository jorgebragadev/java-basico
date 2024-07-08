import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    saldo += scanner.nextDouble();
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 2:
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close(); // Fechar o Scanner corretamente fora do loop
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
