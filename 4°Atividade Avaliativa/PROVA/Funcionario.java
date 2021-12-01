import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Funcionario {
    
    private int id;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String matricula;

    private final static String url = "jdbc:mysql://localhost:3306/BancoJava?useTimezone=true&serverTimezone=UTC";
    private final static String user = "root";
    private final static String password = "";

    public Funcionario(int id, String nome, String cpf, Date dataNascimento, String matricula) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public Funcionario(String nome, String cpf, Date dataNascimento, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Funcionario id(int id) {
        setId(id);
        return this;
    }

    public Funcionario nome(String nome) {
        setNome(nome);
        return this;
    }

    public Funcionario cpf(String cpf) {
        setCpf(cpf);
        return this;
    }

    public Funcionario dataNascimento(Date dataNascimento) {
        setDataNascimento(dataNascimento);
        return this;
    }

    public Funcionario matricula(String matricula) {
        setMatricula(matricula);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Funcionario)) {
            return false;
        }
        Funcionario funcionario = (Funcionario) o;
        return id == funcionario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, dataNascimento, matricula);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", dataNascimento='" + getDataNascimento() + "'" +
            ", matricula='" + getMatricula() + "'" +
            "}";
    }

    public static void printFuncionario(
        ArrayList<Funcionario> funcionarios
    ) {
        try {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Funcionario> getFuncionarioS() throws Exception {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM funcionarios;");
            ArrayList<Funcionario> funcionarios = new ArrayList<>();
            while (rs.next()) {
                funcionarios.add(
                    new Funcionario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getDate("data_nascimento"),
                        rs.getString("matricula")
                    )
                );
            }
            con.close();
            return funcionarios;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }             
    }

    public static ArrayList<Funcionario> getFuncionarioPS() throws Exception {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement stm = con.prepareStatement("SELECT * FROM funcionarios;");
            ResultSet rs = stm.executeQuery();
            ArrayList<Funcionario> funcionarios = new ArrayList<>();
            while (rs.next()) {
                funcionarios.add(
                    new Funcionario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getDate("data_nascimento"),
                        rs.getString("matricula")
                    )
                );
            }
            con.close();
            return funcionarios;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }  
    }

    public static Funcionario getFuncionarioInsert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do funcionário");
        String nome = scanner.next();
        System.out.println("Informe o CPF do funcionário");
        String cpf = scanner.next();
        System.out.println("Informe a Data de Nascimento do funcionário");
        String dataNascimento = scanner.next();
        System.out.println("Informe o Matricula do funcionário");
        String matricula = scanner.next();
        scanner.close();

        return new Funcionario(
            nome,
            cpf,
            Date.valueOf(dataNascimento),
            matricula
        );
    }
    
    public static void insertFuncionarioS(Funcionario funcionario) {
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.execute("INSERT INTO funcionarios "
                + "(nome, cpf, data_nascimento, matricula) VALUES "
                + "('"+funcionario.getNome()+"', '"+funcionario.getCpf()+"', '"+funcionario.getDataNascimento()+"', '"+funcionario.getMatricula()+"')");
            if(!sql) {
                System.out.println("Falha na execução");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertFuncionarioPS(Funcionario funcionario) {
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement stm = con.prepareStatement("INSERT INTO funcionarios "
                            + "(nome, cpf, data_nascimento, matricula) VALUES "
                            + "(?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            stm.setString(1, funcionario.getNome());
            stm.setString(2, funcionario.getCpf());
            stm.setDate(3, funcionario.getDataNascimento());
            stm.setString(4, funcionario.getMatricula());
            if (stm.executeUpdate() > 0) {
                ResultSet rs = stm.getGeneratedKeys();

                if (rs.next()) {
                    System.out.println(new Funcionario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getDate("data_nascimento"),
                        rs.getString("matricula")
                    )); 
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Funcionario getFuncionarioUpdate() throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            Funcionario funcionario = Funcionario.getFuncionario();
            System.out.println("Informe o nome do funcionário (Deixar vazio para manter)");
            String nome = scanner.next();
            if (nome.length() > 0){
                funcionario.setNome(nome);
            }
            System.out.println("Informe o CPF do funcionário (Deixar vazio para manter)");
            String cpf = scanner.next();
            if (cpf.length() > 0){
                funcionario.setCpf(cpf);
            }
            System.out.println("Informe a Data de Nascimento do funcionário (Deixar vazio para manter)");
            String dataNascimento = scanner.next();
            if (dataNascimento.length() > 0){
                funcionario.setDataNascimento(Date.valueOf(dataNascimento));
            }
            System.out.println("Informe o Matricula do funcionário (Deixar vazio para manter)");
            String matricula = scanner.next();
            if (matricula.length() > 0){
                funcionario.setMatricula(matricula);
            }
            scanner.close();
            return funcionario;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static void updateFuncionarioS(Funcionario funcionario) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.execute("UPDATE funcionarios SET "
                + " nome = '" + funcionario.getNome() + "'"
                + ", cpf = '" + funcionario.getCpf() + "'"
                + ", data_nascimento = '" + funcionario.getDataNascimento() + "'"
                + ", matricula = '" + funcionario.getMatricula() + "'"
                + " WHERE id = " + funcionario.getId());
            if(!sql) {
                System.out.println("Falha na execução");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void updateFuncionarioPS(Funcionario funcionario) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pStm = con.prepareStatement("UPDATE funcionarios SET "
                            + " nome = ?"
                            + ", cpf = ?"
                            + ", data_nascimento = ?"
                            + ", matricula = ?"
                            + " WHERE id = ?");
            pStm.setString(1, funcionario.getNome());
            pStm.setString(2, funcionario.getCpf());
            pStm.setDate(3, funcionario.getDataNascimento());
            pStm.setString(4, funcionario.getMatricula());
            pStm.setInt(5, funcionario.getId());
            if (pStm.executeUpdate() <= 0) {
                System.out.println("Falha na execução.");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Funcionario getFuncionario() throws Exception { 
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o ID de exclusão: ");
            int id = scanner.nextInt();
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM funcionarios WHERE id = " + id);
            
            if(!rs.next()) {
                throw new Exception("Id inválido");
            }
            scanner.close();
            return new Funcionario(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("cpf"),
                rs.getDate("data_nascimento"),
                rs.getString("matricula")
            );

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static void deleteFuncionarioS(Funcionario funcionario) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.execute("DELETE FROM funcionarios "
                + " WHERE id = " + funcionario.getId());
            if(!sql) {
                System.out.println("Falha na execução");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteFuncionarioPS(Funcionario funcionario) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pStm = con.prepareStatement("DELETE FROM funcionarios WHERE id = ?");
            pStm.setInt(1, funcionario.getId());
            if(pStm.executeUpdate() <= 0) {
                System.out.println("Falha na execução.");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
