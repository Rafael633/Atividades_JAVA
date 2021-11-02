public class Medico extends Pessoa {

    private String crm;
    private String estado;
    protected String carteira;

    public Medico(
        String nome,
        String cpf,
        String dataNascimento,
        String crm,
        String estado,
        String carteira
    ) {
        super(nome, cpf, dataNascimento, carteira);
        this.crm = crm;
        this.estado = estado;
        //this.carteira = carteira;
    }
    public void setcrm(String crm) {
        this.crm = crm;
    }
    public void setestado(String estado) {
        this.estado = estado;
    }
    /*public void setcarteira(String carteira) {
        this.carteira = carteira;
    }*/
    public String getcrm() {
        return this.crm;
    }
    public String getestado() {
        return this.estado;
    }
    /*public String getcarteira() {
        return this.carteira;
    }*/

    @Override
    public String toString() {
        return "\n\tMédico "
            + "\n\nNome = " + this.getnome()
            + "\nCPF = " + this.getcpf()
            + "\nData de Nascimento = " + this.getdataNascimento()
            + "\n\nCarteira = " + this.getcarteira()
            + "\nEstado = " + this.getestado()
            + "\nCrm = " + this.getcrm();
    }
}