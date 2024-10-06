import java.util.List;
import java.util.ArrayList;

public class Banco {
    List<String> clientes;
    List<Conta> contas;

    public Banco() {
        clientes = new ArrayList<String>();
        contas = new ArrayList<Conta>();
    }
}
