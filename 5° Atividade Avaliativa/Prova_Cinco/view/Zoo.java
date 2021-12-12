//ERRO AO MOSTRAR LEÕES E GOLFINHOS CADASTRADOS, COM ISSO OS BOTÕES DE LISTAR LEÕES E GOLFINHOS FORAM DESABILITADOS//

package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zoo extends JFrame {

    JLabel label1;
    JLabel label2;
    JLabel label3;

    JButton fechar;
    JTextArea textArea1 = new JTextArea(10, 30);
    JTextArea textArea2 = new JTextArea(10, 30);

    JButton cadastrarAlimentacao = new JButton("Adicionar Alimentação");
    JButton listarLeao = new JButton("Listar Leões");
    JButton cadastrarLeao = new JButton("Adicionar Leão");
    JButton alterarLeao = new JButton("Alterar Leão");
    JButton deletarLeao = new JButton("Deletar Leão");

    JButton cadastrarTreinamento = new JButton("Adicionar Treinamento");
    JButton listarGolfinho = new JButton("Listar Golfinhos");
    JButton cadastrarGolfinho = new JButton("Adicionar Golfinho");
    JButton alterarGolfinho = new JButton("Alterar Golfinho");
    JButton deletarGolfinho = new JButton("Deletar Golfinho");

    public Zoo() {

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        label2 = new JLabel("======================");
        label1 = new JLabel("\nSistema do Zoológico");
        label3 = new JLabel("======================");

        pane.add(label2);
        pane.add(label1);
        pane.add(label3);

        pane.add(listarLeao);
        pane.add(cadastrarLeao);
        pane.add(cadastrarAlimentacao);
        pane.add(alterarLeao);
        pane.add(deletarLeao);

        pane.add(listarGolfinho);
        pane.add(cadastrarGolfinho);
        pane.add(cadastrarTreinamento);
        pane.add(alterarGolfinho);
        pane.add(deletarGolfinho);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(220,420);
        this.setVisible(true);

        cadastrarAlimentacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarAlimentacaoActionPerformed(e);
            }
        });

        /*listarLeao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarLeaoActionPerformed(e);
            }
        });*/

        cadastrarLeao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarLeaoActionPerformed(e);
            }
        });

        alterarLeao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alterarLeaoActionPerformed(e);
            }
        });

        deletarLeao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deletarLeaoActionPerformed(e);
            }
        });

        cadastrarTreinamento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarTreinamentoActionPerformed(e);
            }
        });

        /*listarGolfinho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarGolfinhoActionPerformed(e);
            }
        });*/

        cadastrarGolfinho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarGolfinhoActionPerformed(e);
            }
        });

        alterarGolfinho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alterarGolfinhoActionPerformed(e);
            }
        });

        deletarGolfinho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deletarGolfinhoActionPerformed(e);
            }
        });
    }

    private void cadastrarAlimentacaoActionPerformed(ActionEvent e) {
        new CadastrarAlimentacao();
    }

    /*private void listarLeaoActionPerformed(ActionEvent e) {
        new ListarLeao();
    }*/

    private void cadastrarLeaoActionPerformed(ActionEvent e) {
        new CadastrarLeao();
    }

    private void alterarLeaoActionPerformed(ActionEvent e) {
        new AlterarLeao();
    }

    private void deletarLeaoActionPerformed(ActionEvent e) {
        new DeletarLeao();
    }

    private void cadastrarTreinamentoActionPerformed(ActionEvent e) {
        new CadastrarTreinamento();
    }

    /*private void listarGolfinhoActionPerformed(ActionEvent e) {
        new ListarGolfinho();
    }*/

    private void cadastrarGolfinhoActionPerformed(ActionEvent e) {
        new CadastrarGolfinho();
    }

    private void alterarGolfinhoActionPerformed(ActionEvent e) {
        new AlterarGolfinho();
    }

    private void deletarGolfinhoActionPerformed(ActionEvent e) {
        new DeletarGolfinho();
    }

    public static void main(String[] args) {
        Zoo janela = new Zoo();
    }
}