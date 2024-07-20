import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Lê a entrada que informa o saldo inicial da conta
            double saldo = scanner.nextDouble();

            // Verifica se o saldo inicial é zero, o que indica o fim da entrada
            if (saldo == 0) {
                System.out.println("Saldo: 0.0, Transacoes:");
                break;
            }

            // Lê a entrada com a quantidade total de transações
            int quantidadeTransacoes = scanner.nextInt();

            // Lista para armazenar as transações
            List<String> transacoes = new ArrayList<>();

            // Loop para iterar sobre as transações
            for (int i = 1; i <= quantidadeTransacoes; i++) {
                // Lê a entrada com o tipo de transação (D para depósito ou S para saque)
                // O método "toUpperCase" padroniza o tipo de transação com a letra maiúscula
                char tipoTransacao = scanner.next().toUpperCase().charAt(0);
                // Lê a entrada com o valor da transação
                double valorTransacao = scanner.nextDouble();

                // Atualiza o saldo da conta e adiciona a transação à lista
                if (tipoTransacao == 'D') {
                    saldo += valorTransacao;
                    transacoes.add("Deposito de " + valorTransacao);
                } else if (tipoTransacao == 'S') {
                    saldo -= valorTransacao;
                    transacoes.add("Saque de " + valorTransacao);
                } else {
                    System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                    i--; // Decrementa o índice para repetir a iteração
                }
            }

            // Exibe o saldo final e a lista de transações conforme a tabela de exemplos
            System.out.print("Saldo: " + saldo + ", Transacoes:");
            for (int i = 0; i < transacoes.size(); i++) {
                System.out.print(" " + (i + 1) + ". " + transacoes.get(i));
                if (i < transacoes.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
