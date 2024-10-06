public class Transferencia {
    private Conta contaOrigem;
    private Conta contaDestino;
    private double valor;

    public Transferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
    }

    public void transferir() {
        if (contaOrigem.getSaldo() >= valor) {
            contaOrigem.sacar(new Saque(valor));
            contaDestino.depositar(new Deposito(valor));
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}