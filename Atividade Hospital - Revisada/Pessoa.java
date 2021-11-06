import java.util.Objects;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    // private Cidade cidade;

    protected Pessoa(
        String nome,
        String cpf,
        String dataDeNascimento
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
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

    protected String getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    protected void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoa)) {
            return false;
        }
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, dataDeNascimento);
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", dataDeNascimento='" + getDataDeNascimento() + "'" +
            "}";
    }

    public String carteira() {
        return "Nome: " + this.getNome()
            + "\nC.P.F.: " + this.getCpf()
            + "\nData de Nasc.: " + this.getDataDeNascimento();
    }

}
