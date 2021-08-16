public class Exercicios {
    public static void main(String args[]) {
        System.out.println("Ex. 1 - Média das Notas"); {
            int nota1 = 10;
            int nota2 = 8;
            int nota3 = 4;
            int nota4 = 5;
        
            int media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println(media);
        }
    System.out.println("\n\n");
    
        
        System.out.println("Ex. 2 - Cálculo da Área"); {
            double lado1 = 2.70;
            float lado2 = 8;
        
            double area = lado1 * lado2;
        
        System.out.println(area);
        }
    System.out.println("\n\n");
        
        
        System.out.println("Ex. 3 - Calcule o Volume"); {    
            double largura = 10.2;
            double altura = 8;
            double profundidade = 2;
        
            double volume = altura * largura * profundidade;
        
        System.out.println(volume);
        }
    System.out.println("\n\n");
        
        
        System.out.println("Ex. 4 - Valor maior que o dobro"); {
            int valor1 = 10;
            int valor2 = 30;
        
            String message = valor2 >= valor1 * 2 ? "É maior ou igual ao valor 1" : "Não é maior igual ao valor 1";
        
        System.out.println(message);
        }
    System.out.println("\n\n");
    
    
        System.out.println("Ex. 5 - Baskara"); {
            int a = 1;
            int b = 0;
            int c = -4;
        
            int delta = (b * b) - (4 * a * c);
            double x = (-b + Math.sqrt(delta)) / (2 * a);
            double xL = (-b - Math.sqrt(delta)) / (2 * a);
        
        System.out.println(x);
        System.out.println(xL);
        }
    System.out.println("\n\n");
    
    
        System.out.println("Ex. 6 - Velocidade média de uma viagem"); {
            int km = 270;
            int tempo_h = 2;
        
            double vel_media = km / tempo_h;
        
        System.out.println(vel_media + " km/h");
        }
    System.out.println("\n\n");
    
    
        System.out.println("Ex. 7 - Imposto Pago"); {
            double faturamento = 2250.45;
            double imposto = 750.00;
        
            double imposto_pago = (faturamento/imposto);
        
        System.out.println(imposto_pago);
        }
    System.out.println("\n\n");
     
     
        System.out.println("Ex. 8 - Par ou Ímpar"); {
            int valor = 10;
        
            String msg = (valor%2)==0? "É par" : "É impar";
        
        System.out.println(msg);
        }
    System.out.println("\n\n");
    
        
        System.out.println("Ex. 9 - Valor maior que o dobro"); {    
            int valor3 = 5;
            int valor4 = 21;
        
        String men= valor4 >= valor3 * 2 ? "É maior ou igual ao valor 3" : "Não é maior igual ao valor 3";
        
        System.out.println(men);
        }
    System.out.println("\n\n");
    
    
        System.out.println("Ex. 10 - Comparação String"); {
            String abc = " 8";
            String abcd = "8";
        
            boolean comparar = abc.equals(abcd);
        
        System.out.println(comparar);
        }
    System.out.println("\n\n");
    
    
        System.out.println("Ex. 11 - String p/ Inteiro"); {
            String bem = "4.9";
            int mal = (int) Double.parseDouble(bem);
        
        System.out.println(mal);
        }
    System.out.println("\n\n");
    
    
        System.out.println("Ex. 12 - Imposto de Renda");{
            double salario = 4500;
            
            String aliquota = salario <= 1903.98 ? "Isento" : salario <= 2826.65 ? "7.5%" : salario <= 3751.05 ? "15%" : salario <= 4664.68 ? "22.5%" : "27.5%";
        
        System.out.println(aliquota);
        }
    }
}