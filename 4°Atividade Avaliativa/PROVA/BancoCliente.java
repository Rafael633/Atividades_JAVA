import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BancoCliente {
    public static void main(String[] args) {
        try{
            final String url = "jdbc:mysql://localhost:3306/BancoJavaProva?useTimezone=true&serverTimezone=UTC";
            final String user = "root";
            final String password = "";

            Scanner scanner = new Scanner(System.in);
            int menu = 0;
            do{
                System.out.println("\n\t=================");
                System.out.println("\t      MENU       ");
                System.out.println("\t=================");
                System.out.println(" [1] Cliente - SELECT com Prepared Statement");
                System.out.println(" [2] Cliente - INSERT com Prepared Statement");
                System.out.println(" [3] Cliente - UPDATE com Prepared Statement");
                System.out.println(" [4] Cliente - DELETE com Prepared Statement");
                System.out.printf(" Sua escolha: ");
                try{
                    menu = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                switch (menu) {
                    case 1:
                        try {
                            Connection con = DriverManager.getConnection(url, user, password);
                            PreparedStatement stm = con.prepareStatement("SELECT * FROM cliente;");
                            ResultSet sql = stm.executeQuery();
                            while(sql.next()) {
                                System.out.println(new Cliente(
                                    sql.getString("nome"),
                                    sql.getString("cpf"),
                                    sql.getDate("dataNascimento"),
                                    sql.getString("telefone"),
                                    sql.getInt("id")
                                ));
                            }
                            con.close();
                        } catch (SQLException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("\n - Informe o nome do cliente");
                            String nome = scanner.next();
                            System.out.println("\n - Informe o CPF do cliente");
                            String cpf = scanner.next();
                            System.out.println("\n - Informe a data de nascimento do cliente");
                            String dataNascimento = scanner.next();
                            System.out.println("\n - Informe o telefone do cliente");
                            String telefone = scanner.next();
                            
                            Connection con = DriverManager.getConnection(url, user, password);
                            PreparedStatement stm = con.prepareStatement("INSERT INTO cliente "
                                + "(nome, cpf, dataNascimento, telefone) VALUES "
                                + "(?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
                            stm.setString(1, nome);
                            stm.setString(2, cpf);
                            stm.setDate(3, Date.valueOf(dataNascimento));
                            stm.setString(4, telefone);
                            if (stm.executeUpdate() <= 0) {
                                ResultSet rs = stm.getGeneratedKeys();
    
                                if (rs.next()) {
                                    System.out.println(new Cliente(
                                        rs.getString("nome"),
                                        rs.getString("cpf"),
                                        rs.getDate("dataNascimento"),
                                        rs.getString("telefone"),
                                        rs.getInt("id")
                                    )); 
                                }
                            }
                            con.close();
                        } catch (SQLException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("\n - Informe o ID de alteração: ");
                            int id = scanner.nextInt();
                            Connection con = DriverManager.getConnection(url, user, password);
                            Statement stm = con.createStatement();
                            ResultSet rs = stm.executeQuery("SELECT * FROM cliente WHERE id = " + id);
                            if(!rs.next()) {
                                throw new Exception("Id Inválido");
                            }
                            Cliente cliente = new Cliente(
                                rs.getString("nome"),
                                rs.getString("cpf"),
                                rs.getDate("dataNascimento"),
                                rs.getString("telefone"),
                                rs.getInt("id")
                            );
                            con.close();
                            System.out.println("\n - Informe o nome do cliente (Deixar vazio para manter)");
                            String nome = scanner.next();
                            if (nome.length() > 0){
                                cliente.setNome(nome);
                            }
                            System.out.println("\n - Informe o CPF do cliente (Deixar vazio para manter)");
                            String cpf = scanner.next();
                            if (cpf.length() > 0){
                                cliente.setCpf(cpf);
                            }
                            System.out.println("\n - Informe a data de nascimento do cliente (Deixar vazio para manter)");
                            String dataNascimento = scanner.next();
                            if (dataNascimento.length() > 0){
                                cliente.setDataNascimento(Date.valueOf(dataNascimento));
                            }
                            System.out.println("\n - Informe o telefone do cliente (Deixar vazio para manter)");
                            String telefone = scanner.next();
                            if (telefone.length() > 0){
                                cliente.setTelefone(telefone);
                            }
     
                            con = DriverManager.getConnection(url, user, password);
                            PreparedStatement pStm = con.prepareStatement("UPDATE cliente SET "
                                + " nome = ?"
                                + ", cpf = ?"
                                + ", dataNascimento = ?"
                                + ", telefone = ?"
                                + " WHERE id = ?");
                            pStm.setString(1, cliente.getNome());
                            pStm.setString(2, cliente.getCpf());
                            pStm.setDate(3, Date.valueOf(dataNascimento));
                            pStm.setString(4, cliente.getTelefone());
                            pStm.setInt(5, cliente.getId());
                            if (pStm.executeUpdate() <= 0) {
                                System.out.println("Falha na execução.");
                            }
                            con.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            System.out.println("\n - Informe o ID de exclusão: ");
                            int id = scanner.nextInt();
                            Connection con = DriverManager.getConnection(url, user, password);
                            Statement stm = con.createStatement();
                            ResultSet rs = stm.executeQuery("SELECT * FROM cliente WHERE id = " + id);
                            
                            if(!rs.next()) {
                                throw new Exception("Id Inválido");
                            }
                            Cliente cliente = new Cliente(
                                rs.getString("nome"),
                                rs.getString("cpf"),
                                rs.getDate("dataNascimento"),
                                rs.getString("telefone"),
                                rs.getInt("id")
                            );
                            PreparedStatement pStm = con.prepareStatement("DELETE FROM cliente WHERE id = ?");
                            pStm.setInt(1, cliente.getId());
                            if(pStm.executeUpdate() <= 0) {
                                System.out.println("Falha na execução.");
                            }
                            con.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println(" **** Opção inválida, digite novamente ****\n");
                        break;
                }
            } while (menu != 0);
            scanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}