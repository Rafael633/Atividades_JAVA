public class Conta {
    private int agencia;
    private String conta;
    private double saldo;
    private double entrada;
    private double saida;
    private Correntista correntista;
    private Gerente gerente;

    public Conta(int agencia, String conta, double saldo, double entrada, double saida) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.entrada = entrada;
        this.saida = saida;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public void setSaida(double saida) {
        this.saida = saida;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public String getConta() {
        return this.conta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getEntrada() {
        return this.entrada;
    }

    public double getSaida() {
        return this.saida;
    }

    public Correntista getCorrentista() {
        return this.correntista;
    }

    public Gerente getGerente() {
        return this.gerente;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Conta)) {
            return false;
        }
        Conta conta = (Conta) o;
        return this.getCorrentista().getCpf() == conta.getCorrentista().getCpf()
            && this.getGerente().getCpf() == conta.getGerente().getCpf()
            && this.getSaldo() == conta.getSaldo();
    }

    @Override
    public String toString() {
        return "{" +
            "Agencia = " + getAgencia() +
            ", Conta = '" + getConta() + "'" +
            ", Saldo = " + getSaldo() + 
            ", Entrada = " + getEntrada() + 
            ", Saida = " + getSaida() + 
            "}";
    }
}