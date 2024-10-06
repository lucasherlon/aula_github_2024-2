public class Transferecia {
    private Conta contaOrigem;
    private Conta contaDestino;
    private double valor;

    public Transferecia(Conta contaOrigem, Conta contaDestino, double valor) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
    }

    public void transferir() {
        if (contaOrigem.getSaldo() >= valor) {
            contaOrigem.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}