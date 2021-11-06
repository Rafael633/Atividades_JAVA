public class Consulta {
    
    private String data;
    private String atendimento;
    private Medico medico;
    private Paciente paciente;

    public Consulta(
        String data,
        String atendimento,
        Medico medico,
        Paciente paciente
    ) {
        this.data = data;
        this.atendimento = atendimento;
        this.medico = medico;
        this.paciente = paciente;

        medico.setConsulta(this);
        paciente.setConsulta(this);
    }

    public void setData(String data) { 
        this.data = data;
    }

    public void setAtendimento(String atendimento) {
        this.atendimento = atendimento;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getData() { 
        return this.data;
    }

    public String getAtendimento() {
        return this.atendimento;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Consulta)) {
            return false;
        }
        Consulta consulta = (Consulta) o;
        return this.getMedico().getCpf() == consulta.getMedico().getCpf()
            && this.getPaciente().getCpf() == consulta.getPaciente().getCpf()
            && this.getData() == consulta.getData();
    }

    @Override
    public String toString() {
        return "{" +
        " data='" + getData() + "'" +
        ", atendimento='" + getAtendimento() + "'" +
        ", medico='" + getMedico().getNome() + "'" +
        ", paciente='" + getPaciente().getNome() + "'" +
        "}";
    }

    public String dadosConsulta() {
        return "Paciente: " + this.getPaciente().getNome() 
        + ". Data: " + this.getData() 
        + ". Atendimento: " + this.getAtendimento();
    }

}
