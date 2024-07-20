import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o saldo inicial e a quantidade de transações
        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        // Lista para armazenar as transações
        List<Transacao> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Lê o tipo de transação
            char tipoTransacao = scanner.next().toLowerCase().charAt(0);
            // Lê o valor da transação
            double valorTransacao = scanner.nextDouble();

            // Cria uma nova transação e adiciona à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'd') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 's') {
                saldo -= valorTransacao;
            }
        }

        // Exibe o saldo final
        System.out.printf("Saldo : %.1f\n", saldo);
        System.out.println("Transacoes:");

        // Formata e exibe a lista de transações
        String transacoesFormatadas = transacoes.stream()
                .map(transacao -> transacao.getTipo() + " de " + String.format("%.1f", transacao.getValor()))
                .collect(Collectors.joining("\n"));
        System.out.println(transacoesFormatadas);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
