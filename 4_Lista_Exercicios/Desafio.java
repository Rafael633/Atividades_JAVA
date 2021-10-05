import java.util.Scanner;
 
public class Desafio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "\n\nTelefonou para a vítima?",
            "\n\nEsteve no local do crime?",
            "\n\nMora perto da vítima?",
            "\n\nDevia para a vítima?",
            "\n\nJá trabalhou com a vítima?"
        };
 
        int soma = 0;
 
        for (String question : questions) {
            System.out.println(question);
            soma += scanner.nextInt();
        }
 
        if (soma < 2){
            System.out.println("\n\n *Você é inocente");
        }
 
        if (soma == 2){
            System.out.println("\n\n *Você é suspeita");
        }
 
        if ((soma == 3) || (soma == 4)){
            System.out.println("\n\n *Você é cúmplice");
        }
 
        if (soma == 5){
            System.out.println("\n\n *Você é o assassino(a)");
        }
        scanner.close();
    }
}