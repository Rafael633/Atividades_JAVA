import java.util.ArrayList;
import java.util.Objects;

public class Medico extends Pessoa {
    
    private String crm;
    private String estado;
    private ArrayList<Consulta> consultas = new ArrayList<>();
    
    public Medico(
        String nome,
        String cpf,
        String dataDeNascimento,
        String crm,
        String estado
    ) {
        super(nome, cpf, dataDeNascimento);
        this.crm = crm;
        this.estado = estado;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return this.crm;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
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
        if (!(o instanceof Medico)) {
            return false;
        }
        Medico medico = (Medico) o;
        return Objects.equals(this.getCpf(), medico.getCpf());
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", dataDeNascimento='" + getDataDeNascimento() + "'" +
            ", crm='" + getCrm() + "'" +
            ", estado='" + getEstado() + "'" +
            "}";
    }

    public String carteira() {
        String ret = super.carteira()
            + "\nCRM: " + this.getCrm()
            + "\nEstado: " + this.getEstado()
            + "\nQuantidade de Consultas: " + this.consultas.size();
        
            for (Consulta consulta : this.consultas) {
                ret += "\n   " + consulta.dadosConsulta();
            };
        
        return ret;
    }

}
