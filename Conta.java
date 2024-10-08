import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String titular;
    private double saldo;
    private double limite;
    private int numero;
    private List<String> transacoes;

    public Conta(String titular, double limite, int numero) {
        this.titular = titular;
        this.saldo = 0;
        this.limite = limite;
        this.numero = numero;
        this.transacoes = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public List<String> getTransacoes() {
        return transacoes;
    }

    public void sacar(Saque saque) {
        if (saldo >= saque.getValor()) {
            saldo -= saque.getValor();
            transacoes.add("Saque: " + saque.getValor() + " Data: " + saque.getData() + " Hora: " + saque.getHora()
                    + " Descrição: " + saque.getDescricao());
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(Deposito deposito) {
        saldo += deposito.getValor();
        transacoes.add("Depósito: " + deposito.getValor() + " Data: " + deposito.getData() + " Hora: "
                + deposito.getHora() + " Descrição: " + deposito.getDescricao());
        System.out.println("Depósito realizado com sucesso!");
    }

    public void setStatus(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setStatus'");
    }

    public void setNome(String novoNome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNome'");
    }

    public void setEndereco(String novoEndereco) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEndereco'");
    }

    public void setTelefone(String novoTelefone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTelefone'");
    }

}
