public class Conta {
    private int numero;
    private int agencia;
    private String tipo;
    private double saldo;

    public Conta(int numero, int agencia, String tipo, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public void decrementarSaldo(double valor) {
        this.saldo -= valor;
    }
}