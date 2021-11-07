//import java.util.ArrayList;
import java.util.Objects;

public class Corrente extends Conta{

    public Corrente(
        int agencia,
        String conta,
        double saldo,
        double entrada,
        double saida
    ) {
        super(agencia, conta, saldo, entrada, saida);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Corrente)) {
            return false;
        }
        Corrente corrente = (Corrente) o;
        return Objects.equals(this.getSaldo(), corrente.getSaldo());
    }

    @Override
    public String toString() {
        return "\n\tExtrato "
            + "\nSaldo: " + this.getSaldo()
            + "\nEntrada: " + this.getEntrada()
            + "\nSaída: " + this.getSaida();
    }

    public String Historico() {
        return "{" +
            "Saldo = " + this.getSaldo() +
            "}";
    }
}