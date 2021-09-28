import java.util.HashSet;
import java.util.Scanner;

public class TerceiraLista5 {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<String>();
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            System.out.println("Digite o " + (i + 1) + "º nome: ");
            String aux = sc.nextLine();
            hash.add(aux);
        }

        System.out.println("\n");
        System.out.println(hash);
        sc.close();
        hash.clear();
    }
}