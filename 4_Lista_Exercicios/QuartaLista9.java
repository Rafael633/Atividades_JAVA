import java.util.Scanner;

    public class QuartaLista9 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i=0;
        int j=0;
        int v1[] = new int[10];
        int v2[] = new int[10];
        int v3[] = new int[20];
        
        for (i=0; i<10; i++){
            System.out.printf("- Informe o "+(i+1)+"° valor do vetor 1: ");
            v1[i] = sc.nextInt();
        }
        System.out.println("\n");
        
        for (i=0; i<10; i++){
            System.out.printf("- Informe o "+(i+1)+"° valor do vetor 2: ");
            v2[i] = sc.nextInt();
        }
        System.out.println("\n");
        
        for (i=0; i<10; i++){
            v3[j] = v1[i];
            j++;
            v3[j] = v2[i];
            j++;
        }
        
        System.out.println("Dados do vetor 3: ");
        for (j=0; j<20; j++){
            System.out.println(v3[j]);
        }
        sc.close();
    }
}