public class AtualizacaoCadastral {
    private Conta conta;

    public AtualizacaoCadastral(Conta conta) {
        this.conta = conta;
    }

    public void atualizarDados(String novoNome, String novoEndereco, String novoTelefone) {
        conta.setNome(novoNome);
        conta.setEndereco(novoEndereco);
        conta.setTelefone(novoTelefone);
        System.out.println("Dados cadastrais da conta " + conta.getNumero() + " atualizados com sucesso!");
    }
}