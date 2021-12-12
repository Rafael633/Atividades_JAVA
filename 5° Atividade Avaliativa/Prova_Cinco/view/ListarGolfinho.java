//ERRO AO MOSTRAR GOLFINHOS CADASTRADOS//

package view;

import javax.swing.*;
import model.Conexao;
import java.sql.Connection;
import java.awt.*;
import java.awt.event.*;

public class ListarGolfinho extends JFrame {
    JLabel lIdGolfinho;
    JLabel lNomeGolfinho;
    JLabel lTreinamento;
    JTextField tIdGolfinho;
    JTextField tNomeGolfinho;
    JTextField tTreinamento;
    JButton bOkGolfinho = new JButton("OK");

    public ListarGolfinho() {
        lIdGolfinho = new JLabel("Id do golfinho", JLabel.LEFT);
        lNomeGolfinho = new JLabel("Nome do golfinho", JLabel.LEFT);
        lTreinamento = new JLabel("Treinamento do golfinho", JLabel.LEFT);

        tIdGolfinho = new JTextField(15);
        tNomeGolfinho = new JTextField(15);
        tTreinamento = new JTextField(15);
        
        ActionListener okGolfinhoAction = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonOkActionPerformed(e);
            }
        };
        bOkGolfinho.addActionListener(okGolfinhoAction);

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.LEFT));

        pane.add(lIdGolfinho);
        pane.add(tIdGolfinho);
        pane.add(lNomeGolfinho);
        pane.add(tNomeGolfinho);
        pane.add(lTreinamento);
        pane.add(tTreinamento);
        pane.add(bOkGolfinho);

        try{
            Connection con = Conexao.getConnection();
            Conexao.selectGolfinho(
                con,
                Integer.parseInt(tIdGolfinho.getText()),
                tNomeGolfinho.getText(),
                tTreinamento.getText()
            );
            con.close();
        } catch (Exception err) {
            JOptionPane.showMessageDialog(
                this,
                "Erro ao listar Golfinhos: " + err.getMessage(),
                "ERRO",
                JOptionPane.ERROR_MESSAGE
            );
        }

        tIdGolfinho.setEditable(false);
        tNomeGolfinho.setEditable(false);
        tTreinamento.setEditable(false);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(195,350);
        this.setVisible(true);
    }

    private void buttonOkActionPerformed(ActionEvent e) {
        this.dispose();
    }

    public static void main(String[] args){
        ListarGolfinho janela = new ListarGolfinho();
    }
}