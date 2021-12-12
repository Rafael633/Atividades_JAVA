package model;

import java.sql.Date;

public class Golfinho extends Animal {
    private Treinamento treinamento;
    private Jaula jaula;

    public Golfinho(int id, String nome, Date data, String detalhes, String descricao) {
        super(id, nome);
        treinamento = new Treinamento(id, data, detalhes);
        jaula = new Jaula(id, descricao);
    }

    public Golfinho(int id, String nome, int treinamento, int jaula_id, String descricao) {
        super(id, nome);
    }
    
    public void setTreinamento(Treinamento treinamento) {
        this.treinamento = treinamento;
    }

    public Treinamento getTreinamento() {
        return treinamento;
    }

    public void setJaula(Jaula jaula) {
        this.jaula = jaula;
    }

    public Jaula getJaula() {
        return jaula;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Golfinho [ID=" + getId() + ", nome=" + getNome() + ", treinamento=" + getTreinamento() + "]";
    }
}