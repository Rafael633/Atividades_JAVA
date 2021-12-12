package view;

import java.awt.*;
import javax.swing.*;
import model.Conexao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class CadastrarLeao extends JFrame {
    
    JButton salvar;
    JButton cancelar;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JTextField nome = new JTextField(20);
    JTextField alimentacao = new JTextField(20);
    JTextField visitantes = new JTextField(20);
    JTextField descricao = new JTextField(20);

    public CadastrarLeao() {

        salvar = new JButton("Salvar");
        cancelar = new JButton("Cancelar");
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.LEFT));

        label1 = new JLabel("Nome do Leão ");
        label2 = new JLabel("N° de Alimentações ");
        label3 = new JLabel("N° de Visitantes ");
        label4 = new JLabel("Descrição da Jaula ");

        pane.add(label1); 
        pane.add(nome);

        pane.add(label2);
        pane.add(alimentacao);

        pane.add(label3);
        pane.add(visitantes);

        pane.add(label4);
        pane.add(descricao);

        pane.add(salvar);
        pane.add(cancelar);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(290,330);
        this.setVisible(true);
        cancelar.setBounds(10,60,100,22);
        cancelar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                cancelarConfirmaActionPerformed(e);
            }
        });

        salvar.setBounds(10,60,100,22);
        salvar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                salvarConfirmaActionPerformed(e);
            }
        });
    }

    public void cancelarConfirmaActionPerformed(ActionEvent e){
        int ret = JOptionPane.showConfirmDialog(
            this, 
            "Deseja Cancelar?",
            "Cancelar",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        
        if(ret == JOptionPane.OK_OPTION){
            this.dispose();
        }
    }

    public void salvarConfirmaActionPerformed(ActionEvent e){
        int ret = JOptionPane.showConfirmDialog(
            this, 
            "Deseja Salvar?",
            "Salvar",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        
        if(ret == JOptionPane.OK_OPTION){
            try{
                Connection con = Conexao.getConnection();
                Conexao.insertLeao(
                    con,
                    nome.getText(),
                    Integer.parseInt(alimentacao.getText()),
                    Integer.parseInt(visitantes.getText()),
                    descricao.getText()
                );
                con.close();
            } catch (Exception err) {
                JOptionPane.showMessageDialog(
                    this,
                    "Erro ao cadastrar Leão: " + err.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
                );
            }
            this.dispose();
        }
    }

    public static void main(String[] args){
        CadastrarLeao janela = new CadastrarLeao();
    }
}