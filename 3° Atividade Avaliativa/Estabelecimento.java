import java.util.Objects;

public class Estabelecimento {

    private int id;
    private String nome;
    private String dataAbertura;
    private Endereco endereco;

    protected Estabelecimento(
        int id, 
        String nome, 
        String dataAbertura,
        String idEndereco,
        String cep,
        String rua,
        int numero,
        String bairro,
        String cidade
    ) {
        this.id = id;   
        this.nome = nome;
        this.dataAbertura = dataAbertura;
        this.endereco = new Endereco(
                idEndereco,
                cep,
                rua,
                numero,
                bairro,
                cidade,
                this
            );
    }

    protected int getId() {
        return this.id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getNome() {
        return this.nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getDataAbertura() {
        return this.dataAbertura;
    }

    protected void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    protected Endereco getEndereco() {
        return this.endereco;
    }

    protected void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Estabelecimento)) {
            return false;
        }
        Estabelecimento estabelecimento = (Estabelecimento) o;
        return Objects.equals(nome, estabelecimento.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "{" +
            " Nome='" + getNome() + "'" +
            " Data de Abertura='" + getDataAbertura() + "'" +
            " Endereço ='" + getEndereco() + "'" +
            "}";
    }

    public String carteira() {
        return "Nome: " + this.getNome()
            + "\nData de Abertura: " + this.getDataAbertura()
            + "\nEndereço: " + this.getEndereco();
    }
}