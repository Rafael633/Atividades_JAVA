import java.io.BufferedReader;
import java.io.FileReader;

public class TerceiraLista7 {
    public static void main (String[] args) {
        
        try {
            BufferedReader leitura = new BufferedReader(new FileReader("./Ex7.txt"));
            String value = "";
            do {
                if (value != null && value.equalsIgnoreCase("JAVA")) {
                    System.out.println("Possui a string JAVA");
                    break;
                }
        
            }while ((value = leitura.readLine()) != null);
            if (value == null) {
                System.out.println("Não possui a string JAVA");
            }
        } catch (Exception e) {
            System.out.println("Erro de execução: " + e.getMessage());
            }
    }
}