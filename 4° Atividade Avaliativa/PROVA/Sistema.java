import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost:3306/BancoJavaProva?useTimezone=true&serverTimezone=UTC";
        final String user = "root";
        final String password = "";
        
        /*Chef chefUm = new Chef(1,"Rafael","000.000.000-00","31/01/2002","Massas","R$60,000");
        Chef chefDois = new Chef(2,"Junior","111.111.111-11","03/03/1990","Doces","R$5,000");
        Chef chefTres = new Chef(3,"Jacquin","222.222.22-22","31/12/1970","Carnes","R$12,000");

        Cliente clienteUm = new Cliente("Afonso","333.333.333-33","01/01/2001","4002-8922",200);
        Cliente clienteDois = new Cliente("Hamilton","444.444.444-44","07/04/1992","3025-2530",400);
        Cliente clienteTres = new Cliente("Felipe","555.555.555-55","18/05/2003","9779-8228",600);*/

        Padaria padariaUm = new Padaria(100,"Padaria das Frituras","10/10/2000","10:00 as 18:00","0800","89211-450","Rua Colombia",800,"Floresta","Joinville-SC");
        Padaria padariaDois = new Padaria(200,"Padaria dos Pães","02/02/2008","07:00 as 21:00","9090","89204-060","Rua Max Colin",480,"América","Joinville-SC");
        Padaria padariaTres = new Padaria(300,"Padaria dos Doces","12/12/2012","09:30 as 15:30","1930","89200-111","Rua São Paulo",112,"Centro","Joinville-SC");

        Mercados mercadoUm = new Mercados(400,"Angeloni","01/01/1998","Carnes em promoção","1935","89204-080","Rua João Colin",2800,"Saguaçu","Joinville-SC");
        Mercados mercadoDois = new Mercados(500,"Giassi","06/08/1978","Refrigerantes em promoção","4002","89211-321","Rua Orestes Guimarães",315,"Centro","Joinville-SC");
        Mercados mercadoTres = new Mercados(600,"Condor","11/08/2000","Frutas em promoção","8922","89278-020","Rua Blumenau",715,"Atiradores","Joinville-SC");

        Receita receitaUm = new Receita("10","Sonho","Comece preparando a massa do sonho.",6,"R$2,50");
        Receita receitaDois = new Receita("20","Coxinha","Colocar a coxinha pré-frita no air-fryer.",1,"R$3,00");
        Receita receitaTres = new Receita("30","Quindim","Para fazer essa receita de quindim, você não vai precisar de batedeira e não vai precisa de liquidificador.",8,"R$3,50");
        Receita receitaQuatro = new Receita("40","Quibe","Colocar o quibe pré-frito no air-fryer.",1,"R$7,50");
        Receita receitaCinco = new Receita("50","Pão de Queijo","Colocar o pão de queijo pré-pronto no forno.",1,"R$2,50");
        Receita receitaSeis = new Receita("60","Misto Quente","Passe a margarina em ambas as fatias de pão, recheie e coloque em uma assadeira",3,"R$5,50");
        Receita receitaSete = new Receita("70","Pastel","Prepare a massa e o recheio, e coloque na fritadeira",3,"R$8,00");
        Receita receitaOito = new Receita("80","Pão Frances","Prepare a massa e deixe assando no forno",9,"R$1,50");
        Receita receitaNove = new Receita("90","Bolo de morango","Prepare a massa e deixe o bolo assando no forno",10,"R$9,00");
        Receita receitaDez = new Receita("1000","Cuca","Inicialmente preparar a farofa",11,"R$3,25");
        Receita receitaOnze = new Receita("2000","Pudim","Primeiro, bata bem os ovos no liquidificador",8,"R$5,50");
        Receita receitaDoze = new Receita("3000","Suco Verde","Junte todos os ingredientes (com as cascas) no liquidificador.",4,"R$6,75");
        Receita receitaTreze = new Receita("4000","Vitamina","Bater tudo no liquidificador e acrescentar gelo picado.",3,"R$6,00");
        Receita receitaQuatorze = new Receita("5000","Suco de Laranja","Misture tudo em 1 jarra de água gelada.",2,"R$4,50");
        Receita receitaQuinze = new Receita("6000","Bolo de Fubá","Em um liquidificador, adicione os ovos, o açúcar, o fubá, a farinha de trigo, o óleo, o leite e o fermento",3,"R$8,00");
        Receita receitaDezesseis = new Receita("7000","Café c/leite"," Bata todos os ingredientes na batedeira por 15 a 20 minutos até virar uma pasta cremosa",3,"R$2,50");
        Receita receitaDezessete = new Receita("8000","Pão de Hambúrguer","Em uma vasilha, misture 250g da farinha de trigo, o fermento e o sal.",8,"R$3,20");
        Receita receitaDezoito = new Receita("9000","Café","Em um suporte para filtro, coloque o filtro de papel e o pó.",3,"R$1,50");

        /*chefUm.adicionarReceita(receitaUm);
        chefUm.adicionarReceita(receitaDois);
        chefUm.adicionarReceita(receitaTres);
        chefUm.adicionarReceita(receitaQuatro);
        chefUm.adicionarReceita(receitaCinco);
        chefUm.adicionarReceita(receitaSeis);

        chefDois.adicionarReceita(receitaSete);
        chefDois.adicionarReceita(receitaOito);
        chefDois.adicionarReceita(receitaNove);
        chefDois.adicionarReceita(receitaDez);
        chefDois.adicionarReceita(receitaOnze);
        chefDois.adicionarReceita(receitaDoze);

        chefTres.adicionarReceita(receitaTreze);
        chefTres.adicionarReceita(receitaQuatorze);
        chefTres.adicionarReceita(receitaQuinze);
        chefTres.adicionarReceita(receitaDezesseis);
        chefTres.adicionarReceita(receitaDezessete);
        chefTres.adicionarReceita(receitaDezoito);

        System.out.println("\n\t****Chefs****");
        System.out.println();
        System.out.println(chefUm.carteira());
        System.out.println("\n- Receitas do 1°chef:");
        for (Receita receita : chefUm.getReceita()) {
            System.out.println(receita.getNome() + " - " + receita.getValor());
        }

        System.out.println("\n\n");
        System.out.println(chefDois.carteira());
        System.out.println("\n- Receitas do 2°chef:");
        for (Receita receita : chefDois.getReceita()) {
            System.out.println(receita.getNome() + " - " + receita.getValor());
        }

        System.out.println("\n\n");
        System.out.println(chefTres.carteira());
        System.out.println("\n- Receitas do 3°chef:");
        for (Receita receita : chefTres.getReceita()) {
            System.out.println(receita.getNome() + " - " + receita.getValor());
        }
        
        System.out.println("--------------------------------------------------------");*/

        /*clienteUm.adicionarReceita(receitaDois);
        clienteUm.adicionarReceita(receitaQuatro);
        clienteUm.adicionarReceita(receitaSeis);
        clienteUm.adicionarReceita(receitaOito);
        clienteUm.adicionarReceita(receitaDez);
        clienteUm.adicionarReceita(receitaDoze);
        clienteUm.adicionarReceita(receitaQuatorze);
        clienteUm.adicionarReceita(receitaDezesseis);
        clienteUm.adicionarReceita(receitaDezoito);
        clienteUm.adicionarReceita(receitaUm);

        clienteDois.adicionarReceita(receitaUm);
        clienteDois.adicionarReceita(receitaTres);
        clienteDois.adicionarReceita(receitaCinco);
        clienteDois.adicionarReceita(receitaSete);
        clienteDois.adicionarReceita(receitaNove);
        clienteDois.adicionarReceita(receitaOnze);
        clienteDois.adicionarReceita(receitaTreze);
        clienteDois.adicionarReceita(receitaQuinze);
        clienteDois.adicionarReceita(receitaDezessete);
        clienteDois.adicionarReceita(receitaDois);

        clienteTres.adicionarReceita(receitaUm);
        clienteTres.adicionarReceita(receitaDois);
        clienteTres.adicionarReceita(receitaTres);
        clienteTres.adicionarReceita(receitaQuatro);
        clienteTres.adicionarReceita(receitaCinco);
        clienteTres.adicionarReceita(receitaOnze);
        clienteTres.adicionarReceita(receitaDoze);
        clienteTres.adicionarReceita(receitaTreze);
        clienteTres.adicionarReceita(receitaQuatorze);
        clienteTres.adicionarReceita(receitaQuinze);

        System.out.println("\n\t****Clientes****");
        System.out.println();
        System.out.println(clienteUm.carteira());
        System.out.println("\n- Receitas do 1°cliente:");
        for (Receita receita : clienteUm.getReceita()) {
            System.out.println(receita.getNome() + " - " + receita.getValor());
        }

        System.out.println("\n\n");
        System.out.println(clienteDois.carteira());
        System.out.println("\n- Receitas do 2°cliente:");
        for (Receita receita : clienteDois.getReceita()) {
            System.out.println(receita.getNome() + " - " + receita.getValor());
        }

        System.out.println("\n\n");
        System.out.println(clienteTres.carteira());
        System.out.println("\n- Receitas do 3°cliente:");
        for (Receita receita : clienteTres.getReceita()) {
            System.out.println(receita.getNome() + " - " + receita.getValor());
        }
        System.out.println("--------------------------------------------------------");*/

        Scanner scanner = new Scanner(System.in);
        int opChef = 0;
        int opCliente = 0;
        int escolha = 0;

        do{
            System.out.println("===============================");
            System.out.println("1) Chef");
            System.out.println("2) Cliente");
            System.out.println("3) Listar tudo");
            System.out.println("===============================");
            System.out.printf("Sua escolha: ");
            try{
                escolha = scanner.nextInt();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            switch (escolha) {
                case 1:
                    do {
                        System.out.println("\n\t=================");
                        System.out.println("\t      MENU       ");
                        System.out.println("\t=================");
                        System.out.println(" [1] Chef - SELECT com Prepared Statement");
                        System.out.println(" [2] Chef - INSERT com Prepared Statement");
                        System.out.println(" [3] Chef - UPDATE com Prepared Statement");
                        System.out.println(" [4] Chef - DELETE com Prepared Statement");
                        System.out.printf(" Sua escolha: ");
                        try{
                            opChef = scanner.nextInt();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

            switch (opChef) {
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
                        System.out.println("\n - Informe o nome do Chef (Deixar vazio para manter)");
                        String nome = scanner.next();
                        if (nome.length() > 0){
                            chef.setNome(nome);
                        }
                        System.out.println("\n - Informe o CPF do Chef (Deixar vazio para manter)");
                        String cpf = scanner.next();
                        if (cpf.length() > 0){
                            chef.setCpf(cpf);
                        }
                        System.out.println("\n - Informe a data de nascimento do Chef (Deixar vazio para manter)");
                        String dataNascimento = scanner.next();
                        if (dataNascimento.length() > 0){
                            chef.setDataNascimento(Date.valueOf(dataNascimento));
                        }
                        System.out.println("\n - Informe a especialidade do Chef (Deixar vazio para manter)");
                        String especialidade = scanner.next();
                        if (especialidade.length() > 0){
                            chef.setEspecialidade(especialidade);
                        }
                        System.out.println("\n - Informe o salário do Chef (Deixar vazio para manter)");
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
            } while (opChef != 0);
            break;

            case 2:
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
                        opCliente = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                switch (opCliente) {
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
                } while (opCliente != 0);
                break;

            case 3:
                Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM chef;");
                ResultSet r = stmt.executeQuery();
                while(r.next()){
                    System.out.println("\n\n\t****Chefs****\n");
                    System.out.println(new Chef(
                    r.getInt("id"),
                    r.getString("nome"),
                    r.getString("cpf"),
                    r.getDate("dataNascimento"),
                    r.getString("especialidade"),
                    r.getString("salario")
                    ));
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                }

                PreparedStatement stmt1 = con.prepareStatement("SELECT * FROM cliente;");
                ResultSet rs = stmt1.executeQuery();
                while(rs.next()){
                    System.out.println("\n\n\t****Clientes****\n");
                    System.out.println(new Cliente(
                    rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getDate("dataNascimento"),
                    rs.getString("telefone"),
                    rs.getInt("id")
                    ));
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                }

                padariaUm.adicionarReceita(receitaUm);
                padariaUm.adicionarReceita(receitaDois);
                padariaUm.adicionarReceita(receitaTres);
                padariaUm.adicionarReceita(receitaQuatro);
                padariaUm.adicionarReceita(receitaCinco);
                padariaDois.adicionarReceita(receitaQuatro);
                padariaDois.adicionarReceita(receitaCinco);
                padariaDois.adicionarReceita(receitaSeis);
                padariaDois.adicionarReceita(receitaSete);
                padariaDois.adicionarReceita(receitaOito);
                padariaTres.adicionarReceita(receitaOito);
                padariaTres.adicionarReceita(receitaNove);
                padariaTres.adicionarReceita(receitaUm);
                padariaTres.adicionarReceita(receitaDois);
                padariaTres.adicionarReceita(receitaTres);
                System.out.println("\n\n\t****Padarias****");
                System.out.println();
                System.out.println(padariaUm.carteira());
                System.out.println("\n- Receitas da 1°padaria:");
                for (Receita receita : padariaUm.getReceita()) {
                    System.out.println(receita.getNome() + " - " + receita.getValor());
                }
                System.out.println("\n\n");
                System.out.println(padariaDois.carteira());
                System.out.println("\n- Receitas da 2°padaria:");
                for (Receita receita : padariaDois.getReceita()) {
                    System.out.println(receita.getNome() + " - " + receita.getValor());
                }
                System.out.println("\n\n");
                System.out.println(padariaTres.carteira());
                System.out.println("\n- Receitas da 3°padaria:");
                for (Receita receita : padariaTres.getReceita()) {
                    System.out.println(receita.getNome() + " - " + receita.getValor());
                }
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                
                mercadoUm.adicionarReceita(receitaDez);
                mercadoUm.adicionarReceita(receitaOnze);
                mercadoUm.adicionarReceita(receitaDoze);
                mercadoUm.adicionarReceita(receitaTreze);
                mercadoUm.adicionarReceita(receitaQuatorze);
                mercadoDois.adicionarReceita(receitaQuinze);
                mercadoDois.adicionarReceita(receitaDezesseis);
                mercadoDois.adicionarReceita(receitaDezessete);
                mercadoDois.adicionarReceita(receitaDezoito);
                mercadoDois.adicionarReceita(receitaQuatorze);
                mercadoTres.adicionarReceita(receitaDezesseis);
                mercadoTres.adicionarReceita(receitaOnze);
                mercadoTres.adicionarReceita(receitaTreze);
                mercadoTres.adicionarReceita(receitaDezoito);
                mercadoTres.adicionarReceita(receitaQuatorze);
                System.out.println("\n\t****Mercados****");
                System.out.println();
                System.out.println(mercadoUm.carteira());
                System.out.println("\n- Receitas do 1°mercado:");
                for (Receita receita : mercadoUm.getReceita()) {
                    System.out.println(receita.getNome() + " - " + receita.getValor());
                }
                System.out.println("\n\n");
                System.out.println(mercadoDois.carteira());
                System.out.println("\n- Receitas do 2°mercado:");
                for (Receita receita : mercadoDois.getReceita()) {
                    System.out.println(receita.getNome() + " - " + receita.getValor());
                }
                System.out.println("\n\n");
                System.out.println(mercadoTres.carteira());
                System.out.println("\n- Receitas do 3°mercado:");
                for (Receita receita : mercadoTres.getReceita()) {
                    System.out.println(receita.getNome() + " - " + receita.getValor());
                }
                System.out.println("\n");
                }
        } while(escolha != 0);
        scanner.close();
    }
}