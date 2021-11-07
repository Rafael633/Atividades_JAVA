import java.util.ArrayList;
import java.util.Objects;

public class Correntista extends Pessoa {
 
    private String dataInicio;
    private ArrayList<Conta> contas = new ArrayList<>();
 
    public Correntista(String nome, String cpf, String dataNascimento, String dataInicio) {
        super(nome, cpf, dataNascimento);
        this.dataInicio = dataInicio;
    }
    
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public String getDataInicio() {
        return this.dataInicio;
    }

    public void setConta(Conta conta) {
        this.contas.add(conta);
    }

    public ArrayList<Conta> getConta() {
        return this.contas;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Correntista)) {
            return false;
        }
        Correntista correntista = (Correntista) o;
        return Objects.equals(this.getCpf(), correntista.getCpf());
    }

    @Override
    public String toString() {
        return "\n\tCorrentista "
            + "\n\nNome: " + this.getNome()
            + "\nCPF: " + this.getCpf()
            + "\nData de Nascimento: " + this.getDataDeNascimento()
            + "\nData de Inicio: " + this.getDataInicio();
    }
}