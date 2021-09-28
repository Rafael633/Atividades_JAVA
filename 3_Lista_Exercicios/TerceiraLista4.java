import java.util.Scanner;

public class TerceiraLista4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");

        System.out.println("Digite o número: ");
        int num = sc.nextInt();
        System.out.println("Digite o expoente: ");
        int exp = sc.nextInt();

        double result = Math.pow(num, exp);

        System.out.println("\n O número " + num + " elevado ao expoente " + exp + " é igual a " + result + "\n");
        sc.close();
    }
}