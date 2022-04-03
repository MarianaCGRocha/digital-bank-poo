package digital;

public class Main {

    public static void main(String[] args) {

        Cliente Mariana = new Cliente();
        Mariana.setNome("Mariana");
        CartaoDeCredito cartao = new CartaoDeCredito(Mariana);
        cartao.setLimite(500);

        Conta cc = new ContaCorrente(Mariana);
        Conta poupanca = new ContaPoupanca(Mariana);

        cc.depositar(100);
        cc.transferir(50, poupanca);
        cartao.compraCredito(150);
        cc.depositar(200);
        poupanca.depositar(100);
        cartao.compraCredito(120);
        cc.transferir(150, poupanca);
        poupanca.transferir(200, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cartao.imprimirFatura();


    }

}
