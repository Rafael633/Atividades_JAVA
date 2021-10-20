public class Sistema {
    public static void main(String[] args) {
        
        Chef chefUm = new Chef("1","Rafael","000.000.000-00","31/01/2002");
        Chef chefDois = new Chef("2","Lucas","111.111.111-11","15/05/2001");
        Chef chefTres = new Chef("3","Jacquin","222.222.22-22","31/12/1970");

        Padaria padariaUm = new Padaria("100","Padaria das Frituras","10/10/2000","1000","89211-450","Rua Colombia",565,"Floresta","Joinville");
        Padaria padariaDois = new Padaria("200","Padaria dos Doces","15/11/2014","2000","89204-060","Rua Orestes Guimaraes",687,"América","Joinville");
        Padaria padariaTres = new Padaria("300","Padaria dos Pães","02/04/1999","3000","89224-403","Rua Selma Doering Bruns",480,"Iririú","Joinville");

        Receita receitaUm = new Receita("10","Sonho","Comece preparando a massa do sonho.",6);
        Receita receitaDois = new Receita("20","Coxinha","Colocar a coxinha pré-frita no air-fryer.",1);
        Receita receitaTres = new Receita("30","Quindim","Para fazer essa receita de quindim, você não vai precisar de batedeira e não vai precisa de liquidificador.",8);
        Receita receitaQuatro = new Receita("40","Quibe","Colocar o quibe pré-frito no air-fryer.",1);
        Receita receitaCinco = new Receita("50","Pão de Queijo","Colocar o pão de queijo pré-pronto no forno.",1);
        Receita receitaSeis = new Receita("60","Misto Quente","Passe a margarina em ambas as fatias de pão, recheie e coloque em uma assadeira",3);
        Receita receitaSete = new Receita("70","Pastel","Prepare a massa e o recheio, e coloque na fritadeira",3);
        Receita receitaOito = new Receita("80","Pão Frances","Prepare a massa e deixe assando no forno",9);
        Receita receitaNove = new Receita("90","Bolo de morango","Prepare a massa e deixe o bolo assando no forno",10);

        chefUm.adicionarReceita(receitaUm);
        chefUm.adicionarReceita(receitaDois);
        chefUm.adicionarReceita(receitaTres);

        chefDois.adicionarReceita(receitaQuatro);
        chefDois.adicionarReceita(receitaCinco);
        chefDois.adicionarReceita(receitaSeis);

        chefTres.adicionarReceita(receitaSete);
        chefTres.adicionarReceita(receitaOito);
        chefTres.adicionarReceita(receitaNove);

        System.out.println("Receitas do 1°chef - Rafael:");
        for (Receita receita : chefUm.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n");

        System.out.println("Receitas do 2°chef - Lucas:");
        for (Receita receita : chefDois.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n");

        System.out.println("Receitas do 3°chef - Jacquin:");
        for (Receita receita : chefTres.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n");

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

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("CEP:" + padariaUm.endereco.cep + "\nRua: " + padariaUm.endereco.rua + "\nNúmero: " + padariaUm.endereco.numero + "\nBairro: " + padariaUm.endereco.bairro + "\nCidade: " + padariaUm.endereco.cidade);
        System.out.println("\nReceitas da 1°padaria - Padaria das Frituras:");
        for (Receita receita : padariaUm.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n");

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("CEP:" + padariaDois.endereco.cep + "\nRua: " + padariaDois.endereco.rua + "\nNúmero: " + padariaDois.endereco.numero + "\nBairro: " + padariaDois.endereco.bairro + "\nCidade: " + padariaDois.endereco.cidade);
        System.out.println("\nReceitas da 2°padaria - Padaria dos Doces:");
        for (Receita receita : padariaDois.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n");

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("CEP:" + padariaTres.endereco.cep + "\nRua: " + padariaTres.endereco.rua + "\nNúmero: " + padariaTres.endereco.numero + "\nBairro: " + padariaTres.endereco.bairro + "\nCidade: " + padariaTres.endereco.cidade);
        System.out.println("\nReceitas da 3°padaria - Padaria dos Pães:");
        for (Receita receita : padariaTres.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n");
    }
}
