public class Emprestimo {
    private Conta conta;
    private double valor;
    private int parcelas;
    private double juros;
    private double valorParcela;

    public Emprestimo(Conta conta, double valor, int parcelas, double juros) {
        this.conta = conta;
        this.valor = valor;
        this.parcelas = parcelas;
        this.juros = juros;
    }

    public void contratar() {
        if (conta.getSaldo() >= valor) {
            valorParcela = (valor + (valor * juros)) / parcelas;
            conta.sacar(new Saque(valor));
            System.out.println("Valor do empréstimo: R$ " + valor);
            System.out.println("Número de parcelas: " + parcelas);
            System.out.println("Valor da parcela: R$ " + valorParcela);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}