package digital;

public class Main {

    public static void main(String[] args) {

        Cliente Mariana = new Cliente();
        Mariana.setNome("Mariana");

        Conta cc = new ContaCorrente(Mariana);
        Conta poupanca = new ContaPoupanca(Mariana);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
