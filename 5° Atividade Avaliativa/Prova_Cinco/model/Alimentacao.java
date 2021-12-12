package model;

import java.sql.Date;
import java.util.ArrayList;

public class Alimentacao {
    private int idAlimentacao;
    private Date data;
    private String detalhes;
    private ArrayList<Leao> leoes = new ArrayList<>();
    
    protected Alimentacao (int idAlimentacao, Date data, String detalhes) {
        this.idAlimentacao = idAlimentacao;
        this.data = data;
        this.detalhes = detalhes;
    }

    public void setId(int idAlimentacao) {
        this.idAlimentacao = idAlimentacao;
    }

    public int getId() {
        return idAlimentacao;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setLeoes(ArrayList<Leao> leoes) {
        this.leoes = leoes;
    }

    public ArrayList<Leao> getLeoes() {
        return leoes;
    }

    public void addLeao(Leao leao) {
        this.leoes.add(leao);
    }

    @Override
    public String toString() {
        return "alimentacao [ID=" + getId() + ", data=" + getData() + ", detalhes=" + getDetalhes() + ", leao=" + getLeoes() + "]";
    }
}