import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BancoChef {
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
                System.out.println(" [1] Chef - SELECT com Prepared Statement");
                System.out.println(" [2] Chef - INSERT com Prepared Statement");
                System.out.println(" [3] Chef - UPDATE com Prepared Statement");
                System.out.println(" [4] Chef - DELETE com Prepared Statement");
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
                            PreparedStatement stm = con.prepareStatement("SELECT * FROM chef;");
                            ResultSet sql = stm.executeQuery();
                            while(sql.next()) {
                                System.out.println(new Chef(
                                    sql.getInt("id"),
                                    sql.getString("nome"),
                                    sql.getString("cpf"),
                                    sql.getDate("dataNascimento"),
                                    sql.getString("especialidade"),
                                    sql.getString("salario")
                                ));
                            }
                            con.close();
                        } catch (SQLException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("\n - Informe o nome do Chef");
                            String nome = scanner.next();
                            System.out.println("\n - Informe o CPF do Chef");
                            String cpf = scanner.next();
                            System.out.println("\n - Informe a data de nascimento do Chef");
                            String dataNascimento = scanner.next();
                            System.out.println("\n - Informe a especialidade do Chef");
                            String especialidade = scanner.next();
                            System.out.println("\n - Informe o salário do Chef");
                            String salario = scanner.next();
                        
                            Connection con = DriverManager.getConnection(url, user, password);
                            PreparedStatement stm = con.prepareStatement("INSERT INTO chef "
                                + "(nome, cpf, dataNascimento, especialidade, salario) VALUES "
                                + "(?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
                            stm.setString(1, nome);
                            stm.setString(2, cpf);
                            stm.setDate(3, Date.valueOf(dataNascimento));
                            stm.setString(4, especialidade);
                            stm.setString(5, salario);
                            if (stm.executeUpdate() <= 0) {
                                ResultSet rs = stm.getGeneratedKeys();

                                if (rs.next()) {
                                    System.out.println(new Chef(
                                        rs.getInt("id"),
                                        rs.getString("nome"),
                                        rs.getString("cpf"),
                                        rs.getDate("dataNascimento"),
                                        rs.getString("especialidade"),
                                        rs.getString("salario")
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
                            ResultSet rs = stm.executeQuery("SELECT * FROM chef WHERE id = " + id);
                            if(!rs.next()) {
                                throw new Exception("Id Inválido");
                            }
                            Chef chef = new Chef(
                                rs.getInt("id"),
                                rs.getString("nome"),
                                rs.getString("cpf"),
                                rs.getDate("dataNascimento"),
                                rs.getString("especialidade"),
                                rs.getString("salario")
                            );
                            con.close();
                            System.out.println("Informe o nome do Chef (Deixar vazio para manter)");
                            String nome = scanner.next();
                            if (nome.length() > 0){
                                chef.setNome(nome);
                            }
                            System.out.println("Informe o CPF do Chef (Deixar vazio para manter)");
                            String cpf = scanner.next();
                            if (cpf.length() > 0){
                                chef.setCpf(cpf);
                            }
                            System.out.println("Informe a data de nascimento do Chef (Deixar vazio para manter)");
                            String dataNascimento = scanner.next();
                            if (dataNascimento.length() > 0){
                                chef.setDataNascimento(Date.valueOf(dataNascimento));
                            }
                            System.out.println("Informe a especialidade do Chef (Deixar vazio para manter)");
                            String especialidade = scanner.next();
                            if (especialidade.length() > 0){
                                chef.setEspecialidade(especialidade);
                            }
                            System.out.println("Informe o salário do Chef (Deixar vazio para manter)");
                            String salario = scanner.next();
                            if (salario.length() > 0){
                                chef.setSalario(salario);
                            }
                            
                            con = DriverManager.getConnection(url, user, password);
                            PreparedStatement pStm = con.prepareStatement("UPDATE chef SET "
                                + " nome = ?"
                                + ", cpf = ?"
                                + ", dataNascimento = ?"
                                + ", especialidade = ?"
                                + ", salario = ?"
                                + " WHERE id = ?");
                            pStm.setString(1, chef.getNome());
                            pStm.setString(2, chef.getCpf());
                            pStm.setDate(3, chef.getDataNascimento());
                            pStm.setString(4, chef.getEspecialidade());
                            pStm.setString(5, chef.getSalario());
                            pStm.setInt(6, chef.getId());
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
                            ResultSet rs = stm.executeQuery("SELECT * FROM chef WHERE id = " + id);
                            
                            if(!rs.next()) {
                                throw new Exception("Id Inválido");
                            }
                            Chef chef = new Chef(
                                rs.getInt("id"),
                                rs.getString("nome"),
                                rs.getString("cpf"),
                                rs.getDate("dataNascimento"),
                                rs.getString("especialidade"),
                                rs.getString("salario")
                            );
                            PreparedStatement pStm = con.prepareStatement("DELETE FROM chef WHERE id = ?");
                            pStm.setInt(1, chef.getId());
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