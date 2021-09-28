import java.util.Scanner;
 
public class TerceiraLista3 {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);
        System.out.println("");
 
        int A = 0;
        int B = 0;
        int adicao;
        int subtracao;
        int multiplicacao;
        int divisao;
 
        System.out.println("Digite o 1º valor: ");
        A = conta.nextInt();
        System.out.println("Digite o 2º valor: ");
        B = conta.nextInt();
 
        adicao = ((A + B));
        subtracao = (A - B);
        multiplicacao = (A * B);
        divisao = (A / B);
 
        System.out.println("\n" + A + " + " + B + " = " + adicao);
        System.out.println(+A + " - " + B + " = " + subtracao);
        System.out.println(+A + " * " + B + " = " + multiplicacao);
        System.out.println(+A + " / " + B + " = " + divisao);
        conta.close();
    }
}
