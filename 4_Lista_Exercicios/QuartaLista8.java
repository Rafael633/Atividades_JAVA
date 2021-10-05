import java.util.Scanner;

public class QuartaLista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double media;
        double acumula=0;
        double temp=0;
 
        System.out.println("\n\t Média de Temperatura \n");
        for(int i=1; i<13; i++){
            System.out.println("- Informe a temperatura em graus C° do "+ i +"° mês do ano:");
            temp = sc.nextDouble();
            acumula = acumula + temp;
        }
        
        media = acumula/12;
        System.out.println("\n- A média de temperatura no ano é de "+media+" C°");
        sc.close();
    }
}