import java.util.ArrayList;

public class Chef {

    String id;
    String nome;
    String cpf;
    String dataNascimento;
    ArrayList<Receita> receitas = new ArrayList<>();

    public Chef(
        String id,
        String nome,
        String cpf,
        String dataNascimento
    ) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);
        receita.setChef(this);
    }
 
    public void adicionarReceita(
        String id,
        String nome,
        String etapas,
        int numEtapas
    ) {
        Receita receita = new Receita(id, nome, etapas, numEtapas);
        this.receitas.add(receita);
    }
}