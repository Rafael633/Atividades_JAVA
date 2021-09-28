public class TerceiraLista9 {
    public static void main (String[] args) {
        
        try {
            int valor1 = Integer.parseInt(args[0]);
            int valor2 = Integer.parseInt(args[1]);

            System.out.println("A área dos valores é: " + (valor1 * valor2));

        } catch (Exception e) {
            System.out.println("Erro de execução: " + e.getMessage());
        }
    }
}
