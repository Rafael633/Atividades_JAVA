//import java.util.ArrayList;
//import java.util.Objects;

public class Investimento extends Conta{

    public Investimento(
        int agencia,
        String conta,
        double saldo,
        double entrada,
        double saida
    ) {
        super(agencia, conta, saldo, entrada, saida);
    }

    /*@Override
    public String toString() {
        return "\n\tInvestimento "
            + "\n\nAgência: " + this.getAgencia()
            + "\nConta: " + this.getConta()
            + "\nSaldo: " + this.getSaldo()
            + "\nEntrada: " + this.getEntrada()
            + "\nSaída: " + this.getSaida();
    }*/

    public String Carteira() {
        return "{" +
            "Saldo = " + this.getSaldo() +
            ", Entrada = " + this.getEntrada() +
            ", Saida = " + this.getSaida() +
            "}";
    }
}