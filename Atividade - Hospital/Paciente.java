public class Paciente extends Pessoa {

    protected int registro;
    protected String carteira;

    public Paciente(
        int registro,
        String nome,
        String cpf,
        String dataNascimento,
        String carteira
    ) {
        super(nome, cpf, dataNascimento, carteira);
        this.registro = registro;
        //this.carteira = carteira; 
    }
    public void setregistro(int registro) {
        this.registro = registro;
    }
    /*public void setcarteira(String carteira) {
        this.carteira = carteira;
    }*/
    public int getregistro() {
        return this.registro;
    }
    /*public String getcarteira() {
        return this.carteira;
    }*/

    @Override
    public String toString() {
        return "\n\tPaciente "
            + "\n\nNome = " + this.getnome()
            + "\nCPF = " + this.getcpf()
            + "\nData de Nascimento = " + this.getdataNascimento()
            + "\n\nCarteira = " + this.getcarteira()
            + "\nRegistro = " + this.getregistro();
    }
}