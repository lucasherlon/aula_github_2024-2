public class CancelamentoDeConta {
    private Conta conta;

    public CancelamentoDeConta(Conta conta) {
        this.conta = conta;
    }

    public void cancelarConta() {
        conta.setStatus("CANCELADO");
        System.out.println("Conta " + conta.getNumero() + " cancelada com sucesso!");
    }
}