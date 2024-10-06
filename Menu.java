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
				System.out.println("Cadastrar Cliente");
				break;
			case 2:
				System.out.println("Abrir Conta");
				break;
			case 3:
				System.out.println("Realizar saque");
				break;
			case 4:
				System.out.println("Gerar Relatório");
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
}
