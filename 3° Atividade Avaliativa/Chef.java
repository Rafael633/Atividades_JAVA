import java.util.ArrayList;
import java.util.Objects;

public class Chef extends Pessoas{

    private String id;
    private String especialidade;
    ArrayList<Receita> receitas = new ArrayList<>();

    public Chef(String id, String nome, String cpf, String dataNascimento, String especialidade) {
        super(nome, cpf, dataNascimento);
        this.id = id;
        this.especialidade = especialidade;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);    
    }
 
    public void adicionarReceita(String id, String nome, String etapas, int numEtapas, String valor) {
        Receita receita = new Receita(id, nome, etapas, numEtapas, valor);
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
            "}";
    }

    public String carteira() {
        return super.carteira()
            + "\nEspecialidade: " + this.getEspecialidade();
    }
}