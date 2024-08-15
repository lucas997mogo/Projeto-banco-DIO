public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        System.out.println("Olá " + cliente.getNome().toUpperCase() + ", Obrigado por criar uma conta corrente em nosso banco! Sua agência é: " + agencia + ", conta c.: " + numero + "\n");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfos();
    }
}