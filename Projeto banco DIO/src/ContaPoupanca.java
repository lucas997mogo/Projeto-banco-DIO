public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        System.out.println("Olá " + cliente.getNome().toUpperCase() + ", Obrigado por criar uma conta poupança em nosso banco! Sua agência é: " + agencia + ", conta p.: " + numero + "\n");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfos();
    }
}
