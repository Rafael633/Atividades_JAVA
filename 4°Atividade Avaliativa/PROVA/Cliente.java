import java.util.ArrayList;
import java.util.Objects;
import java.sql.Date;

public class Cliente extends Pessoas{

    private String telefone;
    private int id;
    private ArrayList<Receita> receitas = new ArrayList<>();

    final String url = "jdbc:mysql://localhost:3306/BancoJavaProva?useTimezone=true&serverTimezone=UTC";
    final String user = "root";
    final String password = "";

    public Cliente(String nome, String cpf, Date dataNascimento, String telefone, int id) {
        super(nome, cpf, dataNascimento);
        this.telefone = telefone;
        this.id = id;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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
            " Telefone = '" + getTelefone() + "'" +
            "}";
    }

    public String carteira() {
        return super.carteira()
            + "\nTelefone: " + this.getTelefone()
            + "\nID: " + this.getId();
    }
}