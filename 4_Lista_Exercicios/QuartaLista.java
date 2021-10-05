import java.util.Scanner;
import java.text.DecimalFormat; //biblioteca para arredondamento
 
public class QuartaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtde;
        double acumula=0;
        double nota=0;
 
        System.out.println("Digite a quantidade de notas: ");
        qtde = sc.nextInt();
        
        for(int i=1; i<=qtde; i++){
            System.out.println("\nInforme a "+ i +"° nota");
            nota = sc.nextDouble();
            acumula = acumula + nota;
        }
        
        DecimalFormat formatador = new DecimalFormat("0.00"); //arredondar número
        System.out.println("\n- A média das notas é: " + formatador.format(acumula / qtde));
        sc.close();
    }
}