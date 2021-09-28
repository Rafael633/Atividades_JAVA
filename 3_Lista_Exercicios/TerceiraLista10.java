import java.io.BufferedReader;
import java.io.FileReader;

public class TerceiraLista10 {
    public static void main (String[] args) {
        
        try {
            String file = args[0];

            BufferedReader ler = new BufferedReader(new FileReader(file));
            String value = "";
            int soma = 0;
            while ((value = ler.readLine()) != null) {
                soma += Integer.parseInt(value);
            }
            System.out.println(soma);
            ler.close();
        } catch (Exception exception) {
            System.out.println("Erro de execução: " + exception.getMessage());
        }
    }
}