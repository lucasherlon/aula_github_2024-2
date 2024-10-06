public class Deposito {
    private double valor;
    private String data;
    private String hora;
    private String descricao;

    public Deposito(double valor, String data, String hora, String descricao) {
        this.valor = valor;
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
