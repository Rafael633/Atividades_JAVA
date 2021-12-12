package model;

public class Jaula {
    private int id;
    private String descricao;

    protected Jaula (int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Jaula [descricao=" + getDescricao() + ", id=" + getId() + "]";
    }
}