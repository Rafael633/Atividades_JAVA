public class Consulta {

    private String data;
    private String atendimento;
    protected int registro;

    public Consulta(
        String data,
        String atendimento,
        int registro
    ) {
        this.data = data;
        this.atendimento = atendimento;
        this.registro = registro;
    }
    public void setBico(String data) {
        this.data = data;
    }
    public void setPenas(String atendimento) {
        this.atendimento = atendimento;
    }
    public void setPenas(int registro) {
        this.registro = registro;
    }
    public String getdata() {
        return this.data;
    }
    public String getatendimento() {
        return this.atendimento;
    }
    public int getregistro() {
        return this.registro;
    }

    @Override
    public String toString() {
        return "\n\tConsulta "
            + "\n\nData = " + this.getdata()
            + "\nAtendimento = " + this.getatendimento()
            + "\nRegistro = " + this.getregistro();
    }
}