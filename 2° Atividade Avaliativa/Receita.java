import java.util.ArrayList;

public class Receita {
    
    String id;
    String nome;
    String etapas;
    int numEtapas;
    ArrayList<Padaria> padarias = new ArrayList<>();

    public Receita(String id, String nome, String etapas, int numEtapas) {
        this.id = id;
        this.nome = nome;
        this.etapas = etapas;
        this.numEtapas = numEtapas;
    }

    public void adicionarPadaria(Padaria padaria) {
        this.padarias.add(padaria);    
    }
}