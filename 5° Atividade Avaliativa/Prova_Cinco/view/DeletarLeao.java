package view;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import model.Conexao;

public class DeletarLeao extends JFrame {
    
    JButton salvar;
    JButton cancelar;
    JLabel label1;
    JLabel label2;
    JTextField texto1 = new JTextField(20);
    JTextField texto2 = new JTextField(20);

    public DeletarLeao() {

        salvar = new JButton("Deletar dados");
        cancelar = new JButton("Cancelar");
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.LEFT));

        label2 = new JLabel("ID da Alimentação deste Leão");
        label1 = new JLabel("ID Leão");

        pane.add(label1); 
        pane.add(texto1);
        
        pane.add(label2); 
        pane.add(texto2);

        pane.add(salvar);
        pane.add(cancelar);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(265,200);
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
            "Deseja deletar?",
            "Deletar",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if(ret == JOptionPane.OK_OPTION) {
            try{
                Connection con = Conexao.getConnection();
                Conexao.deleteAlimentacao(
                    con,
                    Integer.parseInt(texto2.getText())
                );
                con.close();
            } catch (Exception err) {
                JOptionPane.showMessageDialog(
                    this,
                    "Erro ao deletar Alimentação: " + err.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
                );
            }
            try{
                Connection con = Conexao.getConnection();
                Conexao.deleteLeao(
                    con,
                    Integer.parseInt(texto1.getText())
                );
                con.close();
            } catch (Exception err) {
                JOptionPane.showMessageDialog(
                    this,
                    "Erro ao deletar Leão: " + err.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
                );
            }
            this.dispose();
        }
    }

    public static void main(String[] args){
        DeletarLeao janela = new DeletarLeao();
    }
}