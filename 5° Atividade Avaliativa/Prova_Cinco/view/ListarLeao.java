//ERRO AO MOSTRAR LEÕES CADASTRADOS//

package view;

import javax.swing.*;
import model.Conexao;
import java.sql.Connection;
import java.awt.*;
import java.awt.event.*;

public class ListarLeao extends JFrame {
    JLabel lIdLeao;
    JLabel lNomeLeao;
    JLabel lAlimentacao;
    JLabel lVisitantes;
    JLabel lJaulaId;
    JLabel lDescricaoJaula;
    JTextField tIdLeao;
    JTextField tNomeLeao;
    JTextField tAlimentacao;
    JTextField tVisitantes;
    JTextField tJaulaId;
    JTextField tDescricaoJaula;
    JButton bOkLeao = new JButton("OK");

    public ListarLeao() {
        lIdLeao = new JLabel("Id do leão", JLabel.LEFT);
        lNomeLeao = new JLabel("Nome do leão", JLabel.LEFT);
        lAlimentacao = new JLabel("Alimentação do leão", JLabel.LEFT);
        lVisitantes = new JLabel("Visitantes do leão", JLabel.LEFT);
        lJaulaId = new JLabel("ID da Jaula", JLabel.LEFT);
        lDescricaoJaula = new JLabel("Descrição da jaula", JLabel.LEFT);

        tIdLeao = new JTextField(15);
        tNomeLeao = new JTextField(15);
        tAlimentacao = new JTextField(15);
        tVisitantes = new JTextField(15);
        tJaulaId = new JTextField(15);
        tDescricaoJaula = new JTextField(15);
        
        ActionListener okLeaoAction = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonOkActionPerformed(e);
            }
        };
        bOkLeao.addActionListener(okLeaoAction);

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.LEFT));

        pane.add(lIdLeao);
        pane.add(tIdLeao);
        pane.add(lNomeLeao);
        pane.add(tNomeLeao);
        pane.add(lAlimentacao);
        pane.add(tAlimentacao);
        pane.add(lVisitantes);
        pane.add(tVisitantes);
        pane.add(lDescricaoJaula);
        pane.add(tDescricaoJaula);
        pane.add(lJaulaId);
        pane.add(tJaulaId);
        pane.add(bOkLeao);

        try{
            Connection con = Conexao.getConnection();
            Conexao.selectLeao(
                con,
                Integer.parseInt(tIdLeao.getText()),
                tNomeLeao.getText(),
                Integer.parseInt(tAlimentacao.getText()),
                Integer.parseInt(tVisitantes.getText()),
                Integer.parseInt(tJaulaId.getText()),
                tDescricaoJaula.getText()

            );
            con.close();
        } catch (Exception err) {
            JOptionPane.showMessageDialog(
                this,
                "Erro ao listar Leões: " + err.getMessage(),
                "ERRO",
                JOptionPane.ERROR_MESSAGE
            );
        }

        tIdLeao.setEditable(false);
        tNomeLeao.setEditable(false);
        tAlimentacao.setEditable(false);
        tVisitantes.setEditable(false);
        tJaulaId.setEditable(false);
        tDescricaoJaula.setEditable(false);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(195,350);
        this.setVisible(true);
    }

    private void buttonOkActionPerformed(ActionEvent e) {
        this.dispose();
    }

    public static void main(String[] args){
        ListarLeao janela = new ListarLeao();
    }
}