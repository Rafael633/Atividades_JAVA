import java.util.Scanner;

public class TerceiraLista6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            double raio = 0.0, c = 0.0, area = 0.0;

            System.out.println("Informe o raio: ");
            raio = sc.nextDouble();

            c = 2* (Math.PI) * raio;
            area = Math.PI*(raio * raio);

            System.out.println("\nRaio: " + raio + "\nCircunferência: " + c + "\nÁrea: " + area);
        } catch (Exception e) {
            System.out.println("Erro de execução: " + e.getMessage());
        }
        sc.close();
    }
}