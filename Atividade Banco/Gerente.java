import java.util.ArrayList;
import java.util.Objects;

public class Gerente extends Pessoa {
 
    private String cargo;
    private ArrayList<Conta> contas = new ArrayList<>();
 
    public Gerente(String nome, String cpf, String dataNascimento, String cargo) {
        super(nome, cpf, dataNascimento);
        this.cargo = cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCargo() {
        return this.cargo;
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
        if (!(o instanceof Gerente)) {
            return false;
        }
        Gerente gerente = (Gerente) o;
        return Objects.equals(this.getCpf(), gerente.getCpf());
    }

    @Override
    public String toString() {
        return "\n\tGerente "
            + "\n\nNome: " + this.getNome()
            + "\nCPF: " + this.getCpf()
            + "\nData de Nascimento: " + this.getDataDeNascimento()
            + "\n Cargo: " + this.getCargo();
    }
}