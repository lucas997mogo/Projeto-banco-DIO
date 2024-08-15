public class Main {
    public static void main(String[] args) {

        Conta ccLucas = new ContaCorrente(new Cliente("Lucas"));
        Conta cpLucas = new ContaPoupanca(new Cliente("Lucas"));
        Conta cpLauren = new ContaPoupanca(new Cliente("Lauren"));
        Conta ccCarlos = new ContaCorrente(new Cliente("Carlos"));
        Conta cpCarlos = new ContaCorrente(new Cliente("Carlos"));
        Conta ccAmerico = new ContaCorrente(new Cliente("Americo"));


        ccLucas.depositar(100.55);
        ccLucas.transferir(50.42, cpLauren);

        ccLucas.imprimirExtrato();
        cpLauren.imprimirExtrato();

        //Lista de clientes do banco
        System.out.println(Banco.getClientes());

    }
}
