package view;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import model.Conexao;

public class AlterarLeao extends JFrame {
    
    JButton salvar;
    JButton cancelar;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JTextField texto1 = new JTextField(20);
    JTextField texto2 = new JTextField(20);
    JTextField texto3 = new JTextField(20);
    JTextField texto4 = new JTextField(20);

    public AlterarLeao() {

        salvar = new JButton("Salvar");
        cancelar = new JButton("Cancelar");
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.LEFT));


        label1 = new JLabel("Nome do Leão ");
        label2 = new JLabel("N° de Alimentações ");
        label3 = new JLabel("N° de Visitantes ");
        label4 = new JLabel("ID de alteração ");

        pane.add(label4);
        pane.add(texto4);

        pane.add(label1); 
        pane.add(texto1);

        pane.add(label2);
        pane.add(texto2);

        pane.add(label3);
        pane.add(texto3);

        pane.add(salvar);
        pane.add(cancelar);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(285,335);
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
            "Deseja Alterar?",
            "Alterar",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        
        if(ret == JOptionPane.OK_OPTION){
            try{
                Connection con = Conexao.getConnection();
                Conexao.updateLeao(
                    con,
                    texto1.getText(),
                    Integer.parseInt(texto2.getText()),
                    Integer.parseInt(texto3.getText()),
                    Integer.parseInt(texto4.getText())
                );
                con.close();
            } catch (Exception err) {
                JOptionPane.showMessageDialog(
                    this,
                    "Erro ao alterar Leão: " + err.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
                );
            }
            this.dispose();
        }
    }

    public static void main(String[] args){
        AlterarLeao janela = new AlterarLeao();
    }
}
