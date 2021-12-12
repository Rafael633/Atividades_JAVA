package model;

public class Leao extends Animal {
    private int visitantes;
    private int alimentacao;
    private String descricao;
    Jaula jaula;

    public Leao (int id, String nome, int alimentacao, int visitantes, int jaula_id, String descricao) {
        super(id, nome);
    }

    public Leao (int id, String nome, int visitantes, int alimentacao, Jaula jaula) {
        super(id, nome);
        this.alimentacao = alimentacao;
        this.jaula = new Jaula(id, descricao);
    }

    public void setVisitantes(int visitantes) {
        this.visitantes = visitantes;
    }

    public int getVisitantes() {
        return visitantes;
    }

    public void setAlimentacao(int alimentacao) {
        this.alimentacao = alimentacao;
    }

    public int getAlimentacao() {
        return alimentacao;
    }

    public void setJaula(Jaula jaula) {
        this.jaula = jaula;
    }

    public Jaula getJaula() {
        return jaula;
    }

    @Override
    public String toString() {
        return "Leao [ID=" + getId() + ", nome=" + getNome() + ", alimentação=" + getAlimentacao() + ", visitantes=" + getVisitantes() + "]";
    }
}