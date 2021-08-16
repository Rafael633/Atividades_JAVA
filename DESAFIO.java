public class DESAFIO { 
    public static void main(String[] args) {

    System.out.println("DESAFIO - Números Primos"); 

        int num = 7; 
        int contPrimo = 0; 
 
        for (int i=2; i<num; i++) {
            if (num%i == 0){ 
            contPrimo++; 
            } 
        }

        if (contPrimo > 0) { 
        System.out.println("Não é primo"); 
        } 
        
        else { 
        System.out.println("É primo"); 
        }
    }
}