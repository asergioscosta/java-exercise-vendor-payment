import java.util.ArrayList;

public class Fornecedor {

    private String nome;
    private String cpf;
    private ArrayList<Pagamento> pagamentos;

    public Fornecedor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.pagamentos = new ArrayList<>();
    }

    public double totalPagamento() {
        double valorTotal = 0;

        for (Pagamento p : pagamentos) {
            valorTotal += p.getValor();
        }
        return valorTotal;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
}
