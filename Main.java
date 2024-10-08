import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
	
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Cadastrar Cliente", "Abrir Conta", 
		"Realizar saque", "Gerar Relatório", "Depósito", "Pagamento de contas", "Contratar empréstimo", 
		"Transferência", "Cancelamento de conta", "Atualização de dados cadastrais"));

		mainMenu.getSelection();
		System.out.println("Fim");
	}

}
