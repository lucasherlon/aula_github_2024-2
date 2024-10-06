public class Conta {
    private String titular;
    private double saldo;
    private double limite;
    private int numero;

    public Conta(String titular, double limite, int numero) {
        this.titular = titular;
        this.saldo = 0;
        this.limite = limite;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void sacar(Saque saque) {
        if (saldo >= saque.getValor()) {
            saldo -= saque.getValor();
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Valor: " + saque.getValor());
            System.out.println("Data: " + saque.getData());
            System.out.println("Hora: " + saque.getHora());
            System.out.println("Descrição: " + saque.getDescricao());
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(Deposito deposito) {
        saldo += deposito.getValor();
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Valor: " + deposito.getValor());
        System.out.println("Data: " + deposito.getData());
        System.out.println("Hora: " + deposito.getHora());
        System.out.println("Descrição: " + deposito.getDescricao());
    }

}
