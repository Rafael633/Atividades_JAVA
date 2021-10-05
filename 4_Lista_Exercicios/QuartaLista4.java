import java.util.Scanner;

public class QuartaLista4 {
    public static void main(String[] args){
        int i;
        int valor[] = {2,4,6,8,10,12,14,16,18,3};
        
        for (i=0; i<valor.length; i++){
            System.out.println("Número "+valor[i]);
            if (valor[i]%2==0){
                System.out.println("- Valor par \n");
            }
            else{
                System.out.println("- Valor ímpar \n");
            }
        }
    }
}