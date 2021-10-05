import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.SortedSet; //biblioteca usada para ordenação de vetor
import java.util.TreeSet; //biblioteca usada para ordenação de vetor

public class avaliacao {
    public static void main(String[] args) {
        System.out.println("\n\t Atividade Avaliativa \n");

        try{
            BufferedReader leitura = new BufferedReader(new FileReader("./lista_desordenada.txt"));
            String temp = "";
            int cont = 0;
            while((temp = leitura.readLine()) != null){
                cont++;
            }
            leitura.close();
        
        //Crio o array com o tamanho das linhas
            int[] array = new int[cont];
            cont = 0;

        //Leio novamente o arquivo do buffer
            leitura = new BufferedReader(new FileReader("./lista_desordenada.txt"));
            while((temp = leitura.readLine()) != null){
                //aloco os valores nas posições
                int numero = Integer.parseInt(temp);
                array[cont] = numero;
                cont++;
            }
            leitura.close();

        //Ordenando os números - Selection Sort
            System.out.println("Selection Sort - Processo de Ordenação");
            
            for (int i = 0; i<array.length; i++){  
                int menor = i;  
                for (int j = i + 1; j<array.length; j++){  
                    if (array[j] < array[menor]){  
                        menor = j;  
                    }  
                }  
            int contador = array[menor];   
            array[menor] = array[i];  
            array[i] = contador;  
            }
        
        //Imprimindo a collection ordenada
            for (int i : array){
                System.out.println(i);
            }
            System.out.println(" ");
        
        //Leitura novamente do arquivo agora com collection
            leitura = new BufferedReader(new FileReader("./lista_desordenada.txt"));
            SortedSet<Integer> valores = new TreeSet<>();
            temp = "";
            while((temp = leitura.readLine()) != null){
                int numero = Integer.parseInt(temp);
                valores.add(numero);
                }
                leitura.close();
            System.out.println(valores);

        //Array com a ordenação
            BufferedWriter escrita = new BufferedWriter(new FileWriter("./lista_ordenada.txt"));

            for (int i = 0; i<array.length; i++){
                escrita.append(array[i]+"\n"); 
            }
            escrita.close();
        }catch (IOException exception){
            System.out.println("Não foi localizado o arquivo.");
        }
    }
}