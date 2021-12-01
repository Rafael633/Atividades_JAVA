import java.util.Objects;
import java.sql.Date;

public abstract class Pessoas {
    
    private String nome;
    private String cpf;
    private Date dataNascimento;

    protected Pessoas(String nome, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    protected String getNome() {
        return this.nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getCpf() {
        return this.cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected Date getDataNascimento() {
        return this.dataNascimento;
    }

    protected void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoas)) {
            return false;
        }
        Pessoas pessoa = (Pessoas) o;
        return Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, dataNascimento);
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
        return "Nome: " + this.getNome()
            + "\nCPF: " + this.getCpf()
            + "\nData de Nascimento: " + this.getDataNascimento();
    }
}