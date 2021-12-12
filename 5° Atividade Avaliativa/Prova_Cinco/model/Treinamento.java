package model;

import java.sql.Date;
import java.util.ArrayList;

public class Treinamento {
    private int idTreinamento;
    private Date data;
    private String detalhes;
    private ArrayList<Golfinho> golfinhos = new ArrayList<>();

    protected Treinamento (int idTreinamento, Date data, String detalhes) {
        this.idTreinamento = idTreinamento;
        this.data = data;
        this.detalhes = detalhes;
    }

    public void setId(int idTreinamento) {
        this.idTreinamento = idTreinamento;
    }

    public int getId() {
        return idTreinamento;
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

    public void setGolfinhos(ArrayList<Golfinho> golfinhos) {
        this.golfinhos = golfinhos;
    }
    
    public ArrayList<Golfinho> getGolfinhos() {
        return golfinhos;
    }

    public void addGolfinho(Golfinho golfinho) {
        this.golfinhos.add(golfinho);
    }

    @Override
    public String toString() {
        return "treinamento [ID=" + getId() + ", data=" + getData() + ", detalhes=" + getDetalhes() + ", golfinho=" + getGolfinhos() + "]";
    }
}