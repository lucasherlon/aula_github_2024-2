public class Conta {
    private String titular;
    private double saldo;
    private double limite;
    private int numero;

    public Conta(String titular, double limite,int numero) {
        this.titular = titular;
        this.saldo = 0;
        this.limite = limite;
        this.numero = numero;
    }

}
