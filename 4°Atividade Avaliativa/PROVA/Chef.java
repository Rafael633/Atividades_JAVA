import java.util.ArrayList;
import java.util.Objects;
import java.sql.Date;

public class Chef extends Pessoas{

    private int id;
    private String especialidade;
    private String salario;
    private ArrayList<Receita> receitas = new ArrayList<>();

    final String url = "jdbc:mysql://localhost:3306/BancoJavaProva?useTimezone=true&serverTimezone=UTC";
    final String user = "root";
    final String password = "";

    public Chef(int id, String nome, String cpf, Date dataNascimento, String especialidade, String salario) {
        super(nome, cpf, dataNascimento);
        this.id = id;
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSalario() {
        return this.salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public void setReceita(Receita receita) {
        this.receitas.add(receita);
    }

    public ArrayList<Receita> getReceita() {
        return this.receitas;
    }

    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);    
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Chef)) {
            return false;
        }
        Chef chef = (Chef) o;
        return Objects.equals(id, chef.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
            " Nome = '" + getNome() + "'" +
            " CPF = '" + getCpf() + "'" +
            " Data de Nascimento = '" + getDataNascimento() + "'" +
            " Especialidade = '" + getEspecialidade() + "'" +
            " Salário = '" + getSalario() + "'" +
            "}";
    }

    public String carteira() {
        return super.carteira()
            + "\nEspecialidade: " + this.getEspecialidade();
    }
}