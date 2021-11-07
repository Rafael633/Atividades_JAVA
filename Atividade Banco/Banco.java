public class Banco {
    public static void main(String[] args) {
        Correntista correntista = new Correntista("Rafael", "000.000.000-00", "31/01/1986", "30/07/2007");

        Gerente gerente = new Gerente("Juvenal", "111.111.111-11", "09/04/1949", "Gerente");

        Conta conta = new Conta(3030,"01234567/8", 1950.00 , 500.00, 150.00);

        Corrente corrente = new Corrente(3030,"01234567/8", 1950.00 , 700.00, 50.00);

        Investimento investimento = new Investimento(3030,"01234567/8", 1950.00 , 700.00, 50.00);

        System.out.println(correntista);
        System.out.println();
        System.out.println(conta);
        System.out.println(); 
        System.out.println(gerente);
        System.out.println("\n\n");
        System.out.println(corrente.Historico());
        System.out.println(); 
        System.out.println(investimento.Carteira());
        System.out.println();
    }
}