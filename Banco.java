import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<String> clientes;
    List<Conta> contas;

    public Banco() {
        clientes = new ArrayList<String>();
        contas = new ArrayList<Conta>();
    }

    public Conta getConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
}
