import java.util.List;
import java.util.Scanner;

public class Menu {
    private String title;
    private List<String> options;
    private Banco banco;

    public Menu(List<String> options) {
        this.title = "Menu";
        this.options = options;
        banco = new Banco();
    }

    public Menu(String title, List<String> options) {
        this.title = title;
        this.options = options;
        banco = new Banco();
    }

    public void getSelection() {
        int op = 0;
        while (op == 0) {
            System.out.println(title + "\n");
            int i = 1;
            for (String option : options) {
                System.out.println(i++ + " - " + option);
            }

            System.out.println("Informe a opcao desejada. ");
            Scanner s = new Scanner(System.in);
            String str = s.nextLine();
            s.close();
            try {
                op = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                op = 0;
            }
            if (op >= i) {
                System.out.println("Opcao errada!");
                op = 0;
            }
        }
        executeOption(op);
    }

    public void executeOption(int op) {
        switch (op) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                System.out.println("Abrir Conta");
                break;
            case 3:
                realizarSaque();
                break;
            case 4:
                gerarRelatorio();
                break;
            case 5:
                System.out.println("Depósito");
                break;
            case 6:
                System.out.println("Pagamento de contas");
                break;
            case 7:
                System.out.println("Contratar empréstimo");
                break;
            case 8:
                System.out.println("Transferência");
                break;
            case 9:
                System.out.println("Cancelamento de conta");
                break;
            case 10:
                System.out.println("Atualização de dados cadastrais");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private void cadastrarCliente() {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o nome do titular: ");
        String titular = s.nextLine();
        System.out.println("Informe o limite da conta: ");
        double limite = s.nextDouble();
        System.out.println("Informe o número da conta: ");
        int numero = s.nextInt();
        s.nextLine(); // Consumir a nova linha

        Conta novaConta = new Conta(titular, limite, numero);
        banco.adicionarConta(novaConta);
        System.out.println("Conta criada com sucesso!");
    }

    private void realizarSaque() {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o número da conta: ");
        int numeroConta = s.nextInt();
        System.out.println("Informe o valor do saque: ");
        double valor = s.nextDouble();
        s.nextLine(); // Consumir a nova linha
        System.out.println("Informe a data do saque (dd/MM/yyyy): ");
        String data = s.nextLine();
        System.out.println("Informe a hora do saque (HH:mm): ");
        String hora = s.nextLine();
        System.out.println("Informe a descrição do saque: ");
        String descricao = s.nextLine();
        s.close();

        Conta conta = banco.getConta(numeroConta);
        if (conta != null) {
            Saque saque = new Saque(valor, data, hora, descricao);
            conta.sacar(saque);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    private void gerarRelatorio() {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o número da conta: ");
        int numeroConta = s.nextInt();
        s.close();
        Conta conta = banco.getConta(numeroConta);
        if (conta != null) {
            Relatorio.gerarRelatorio(conta.getTransacoes());
        } else {
            System.out.println("Conta não encontrada!");
        }
    }
}