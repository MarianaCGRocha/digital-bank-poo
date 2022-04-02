package digital;

public abstract class Conta implements IConta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    public Conta() {
        agencia = AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
