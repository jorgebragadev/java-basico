

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Cliente 1");
        Conta cc1 = new ContaCorrente(cliente1);
        Conta poupanca1 = new ContaPoupanca(cliente1);
        Conta investimento1 = new ContaInvestimento(cliente1);

        banco.adicionarConta(cc1);
        banco.adicionarConta(poupanca1);
        banco.adicionarConta(investimento1);

        cc1.depositar(100);
        poupanca1.depositar(200);
        investimento1.depositar(300);

        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();
        investimento1.imprimirExtrato();

        // Salvar contas
        banco.salvarContas();

        // Carregar contas
        banco.carregarContas();

        // Imprimir extratos novamente após carregar
        for (Conta conta : banco.getContas()) {
            conta.imprimirExtrato();
        }
    }
}
