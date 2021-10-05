import java.util.Scanner;
import java.util.InputMismatchException;

public class QuartaLista10 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int media, acumula = 0;
        int v[] = new int[20];
        int i; 
        
        try{
            for (i=0; i<v.length; i++){
                System.out.printf("Informe o " + (i+1) + "° valor: ");
                v[i] = sc.nextInt();
                acumula = acumula + v[i];
            }
        
            media=acumula/v.length;
            System.out.println("\n- Média = "+media);
            System.out.println("\n- Valores abaixo da média: ");
        
            for (i=0; i<v.length; i++){
                if(v[i] < media){
                    System.out.println(v[i]);
                }
            }
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        } finally {
        sc.close();
        }
    }
}