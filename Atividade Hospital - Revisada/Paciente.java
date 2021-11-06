import java.util.ArrayList;
import java.util.Objects;

public class Paciente extends Pessoa {
    
    private String registro;
    private ArrayList<Consulta> consultas = new ArrayList<>();
    
    public Paciente(
        String nome,
        String cpf,
        String dataDeNascimento,
        String registro
    ) {
        super(nome, cpf, dataDeNascimento);
        this.registro = registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getRegistro() {
        return this.registro;
    }

    public void setConsulta(Consulta consulta) {
        this.consultas.add(consulta);
    }

    public ArrayList<Consulta> getConsultas() {
        return this.consultas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Paciente)) {
            return false;
        }
        Paciente paciente = (Paciente) o;
        return Objects.equals(this.getCpf(), paciente.getCpf());
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", dataDeNascimento='" + getDataDeNascimento() + "'" +
            ", registro='" + getRegistro() + "'" +
            "}";
    }

    public String carteira() {
        return super.carteira()
            + "\nRegistro: " + this.getRegistro()
            + "\nQuantidade de Consultas: " + this.consultas.size();
    }

}
