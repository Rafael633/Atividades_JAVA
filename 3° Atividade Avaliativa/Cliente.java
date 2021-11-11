import java.util.ArrayList;
import java.util.Objects;

public class Cliente extends Pessoas{

    private String telefone;
    private ArrayList<Receita> receitas = new ArrayList<>();

    public Cliente(String nome, String cpf, String dataNascimento, String telefone) {
        super(nome, cpf, dataNascimento);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);    
    }
 
    public void setReceita(Receita receita) {
        this.receitas.add(receita);
    }

    public ArrayList<Receita> getReceita() {
        return this.receitas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(telefone, cliente.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefone);
    }

    @Override
    public String toString() {
        return "{" +
            " Nome = '" + getNome() + "'" +
            " CPF = '" + getCpf() + "'" +
            " Data de Nascimento = '" + getDataNascimento() + "'" +
            "}";
    }

    public String carteira() {
        return super.carteira()
            + "\nTelefone: " + this.getTelefone();
    }
}