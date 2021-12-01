import java.util.ArrayList;
import java.util.Objects;

public class Receita {
    
    private String id;
    private String nome;
    private String etapas;
    private int numEtapas;
    private String valor;
    private ArrayList<Padaria> padarias = new ArrayList<>();
    private ArrayList<Mercados> mercados = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public Receita(String id, String nome, String etapas, int numEtapas, String valor) {
        this.id = id;
        this.nome = nome;
        this.etapas = etapas;
        this.numEtapas = numEtapas;
        this.valor = valor;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEtapas() {
        return this.etapas;
    }

    public void setEtapas(String etapas) {
        this.etapas = etapas;
    }

    public int getNumEtapas() {
        return this.numEtapas;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setNumEtapas(int numEtapas) {
        this.numEtapas = numEtapas;
    }

    public void setPadaria(Padaria padaria) {
        this.padarias.add(padaria);    
    }

    public void setMercado(Mercados mercado) {
        this.mercados.add(mercado);    
    }

    public void setCliente(Cliente cliente) {
        this.clientes.add(cliente);    
    }

    public ArrayList<Padaria> getPadaria() {
        return this.padarias;
    }

    public ArrayList<Mercados> getMercados() {
        return this.mercados;
    }

    public ArrayList<Cliente> getCliente() {
        return this.clientes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Receita)) {
            return false;
        }
        Receita receita = (Receita) o;
        return Objects.equals(id, receita.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
            " Receita ='" + getNome() + "'" +
            " Valor ='" + getValor() + "'" +
            "}";
    }
}