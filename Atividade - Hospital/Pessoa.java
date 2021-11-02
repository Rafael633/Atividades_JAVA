public class Pessoa {

    private String nome;
    private String cpf;
    private String dataNascimento;
    protected String carteira;

    public Pessoa(
        String nome,
        String cpf,
        String dataNascimento,
        String carteira
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.carteira = carteira;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public void setcpf(String cpf) {
        this.cpf = cpf;
    }
    public void setdataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setcarteira(String carteira) {
        this.carteira = carteira;
    }
    public String getnome() {
        return this.nome;
    }
    public String getcpf() {
        return this.cpf;
    }
    public String getdataNascimento() {
        return this.dataNascimento;
    }
    public String getcarteira() {
        return this.carteira;
    }
}