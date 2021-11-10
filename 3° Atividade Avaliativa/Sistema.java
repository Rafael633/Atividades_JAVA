public class Sistema {
    public static void main(String[] args) {
        
        Chef chefUm = new Chef("1","Rafael","000.000.000-00","31/01/2002","Massas");
        Chef chefDois = new Chef("2","Junior","111.111.111-11","03/03/1990","Doces");
        Chef chefTres = new Chef("3","Jacquin","222.222.22-22","31/12/1970","Carnes");

        Cliente clienteUm = new Cliente("Afonso","333.333.333-33","01/01/2001","4002-8922");
        Cliente clienteDois = new Cliente("Hamilton","444.444.444-44","07/04/1992","3025-2530");
        Cliente clienteTres = new Cliente("Felipe","555.555.555-55","18/05/2003","9779-8228");

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

        chefUm.adicionarReceita(receitaUm);
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
        for (Receita receita : chefUm.receitas) {
            System.out.println(receita.nome + " - " + receita.valor);
        }

        System.out.println("\n\n");
        System.out.println(chefDois.carteira());
        System.out.println("\n- Receitas do 2°chef:");
        for (Receita receita : chefDois.receitas) {
            System.out.println(receita.nome + " - " + receita.valor);
        }

        System.out.println("\n\n");
        System.out.println(chefTres.carteira());
        System.out.println("\n- Receitas do 3°chef:");
        for (Receita receita : chefTres.receitas) {
            System.out.println(receita.nome + " - " + receita.valor);
        }
        System.out.println("--------------------------------------------------------");

        clienteUm.adicionarReceita(receitaDois);
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
        for (Receita receita : clienteUm.receitas) {
            System.out.println(receita.nome + " - " + receita.valor);
        }

        System.out.println("\n\n");
        System.out.println(clienteDois.carteira());
        System.out.println("\n- Receitas do 2°cliente:");
        for (Receita receita : clienteDois.receitas) {
            System.out.println(receita.nome + " - " + receita.valor);
        }

        System.out.println("\n\n");
        System.out.println(clienteTres.carteira());
        System.out.println("\n- Receitas do 3°cliente:");
        for (Receita receita : clienteTres.receitas) {
            System.out.println(receita.nome + " - " + receita.valor);
        }
        System.out.println("--------------------------------------------------------");

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

        System.out.println("\n\t****Padarias****");
        System.out.println();
        System.out.println(padariaUm.carteira());
        System.out.println("\n- Receitas da 1°padaria:");
        for (Receita receita : padariaUm.receitas) {
            System.out.println(receita.nome + " - " + receita.valor);
        }

        System.out.println("\n\n");
        System.out.println(padariaDois.carteira());
        System.out.println("\n- Receitas da 2°padaria:");
        for (Receita receita : padariaDois.receitas) {
            System.out.println(receita.nome + " - " + receita.valor);
        }

        System.out.println("\n\n");
        System.out.println(padariaTres.carteira());
        System.out.println("\n- Receitas da 3°padaria:");
        for (Receita receita : padariaTres.receitas) {
            System.out.println(receita.nome + " - " + receita.valor);
        }
        System.out.println("--------------------------------------------------------");

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
        for (Receita receita : mercadoUm.receitas) {
            System.out.println(receita.nome + " - " + receita.valor);
        }

        System.out.println("\n\n");
        System.out.println(mercadoDois.carteira());
        System.out.println("\n- Receitas do 2°mercado:");
        for (Receita receita : mercadoDois.receitas) {
            System.out.println(receita.nome + " - " + receita.valor);
        }

        System.out.println("\n\n");
        System.out.println(mercadoTres.carteira());
        System.out.println("\n- Receitas do 3°mercado:");
        for (Receita receita : mercadoTres.receitas) {
            System.out.println(receita.nome + " - " + receita.valor);
        }
        System.out.println("\n");
    }
}