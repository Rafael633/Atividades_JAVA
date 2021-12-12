package view;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import model.Conexao;

public class CadastrarTreinamento extends JFrame {
    
    JButton salvar;
    JButton cancelar;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JTextField data = new JTextField(20);
    JTextField detalhes = new JTextField(20);
    JTextField texto3 = new JTextField(20);

    public CadastrarTreinamento() {

        salvar = new JButton("Salvar");
        cancelar = new JButton("Cancelar");
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.LEFT));

        label1 = new JLabel("Data do Treinamento ");
        label2 = new JLabel("Detalhes do Treinamento ");
        label3 = new JLabel("ID do Golfinho ");

        pane.add(label1); 
        pane.add(data);

        pane.add(label2);
        pane.add(detalhes);

        pane.add(label3);
        pane.add(texto3);

        pane.add(salvar);
        pane.add(cancelar);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(250,230);
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
                Conexao.insertTreinamento(
                    con,
                    Date.valueOf(data.getText()),
                    detalhes.getText(),
                    Integer.parseInt(texto3.getText())
                );
                con.close();
            } catch (Exception err) {
                JOptionPane.showMessageDialog(
                    this,
                    "Erro ao cadastrar Treinamento: " + err.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
                );
            }
            this.dispose();
        }
    }

    public static void main(String[] args){
        CadastrarTreinamento janela = new CadastrarTreinamento();
    }
}