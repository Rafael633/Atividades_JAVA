import java.util.ArrayList;
import java.util.Objects;

public class Padaria extends Estabelecimento{

    private String horario;
    private ArrayList<Receita> receitas = new ArrayList<>();

    public Padaria(
        int id, 
        String nome, 
        String dataAbertura, 
        String horario,
        String idEndereco,
        String cep,
        String rua,
        int numero,
        String bairro,
        String cidade
    ) {
        super(id, nome, dataAbertura, idEndereco, cep, rua, numero, bairro, cidade);
        this.horario = horario;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
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
        if (!(o instanceof Padaria)) {
            return false;
        }
        Padaria padaria = (Padaria) o;
        return Objects.equals(horario, padaria.horario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horario);
    }

    @Override
    public String toString() {
        return "{" +
            " Nome='" + getNome() + "'" +
            " Data de Abertura='" + getDataAbertura() + "'" +
            " Horário de Funcionamento ='" + getHorario() + "'" +
            " Endereço ='" + getEndereco() + "'" +
            "}";
    }

    public String carteira() {
        return super.carteira()
            + "\nHorário de Funcionamento: " + this.getHorario();
    }
}