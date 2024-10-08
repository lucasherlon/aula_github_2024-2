import java.util.List;

public class Relatorio {
    public static void gerarRelatorio(List<String> transacoes) {
        System.out.println("Relatório de Transações:");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
    }
}