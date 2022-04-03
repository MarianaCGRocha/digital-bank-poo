package digital;

public class CartaoDeCredito {

    protected int numero;
    protected double limite;
    protected Cliente cliente;
    protected static int SEQUENCIALCARTAO = 513;

    public CartaoDeCredito(Cliente cliente) {
        this.numero = SEQUENCIALCARTAO++;
        this.cliente = cliente;

    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void compraCredito(double valor) {
        limite -= valor;
    }

    public void imprimirFatura() {
        System.out.println("=== Fatura do Cartão de Crédito ===");
        System.out.println(String.format("Cartão: %d", numero));
        System.out.println("Limite disponível: " + limite);
    }

}
