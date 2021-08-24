import java.util.Scanner;
public class SegundaLista {
    public static void main(String[]args) {
        
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        
        do{
            System.out.println("Digite a opção: ");
            menu = scanner.nextInt();
            
            switch(menu) {
                case 0:
                    System.out.println("Sair");
                    break;
                case 1:
                    System.out.println("Ex 1");
                    medianotas();
                    break;
                case 2:
                    System.out.println("Ex 2");
                    Nummes();
                    break;
                case 3:
                    System.out.println("Ex 3");
                    forca();
                    break;
                case 4:
                    System.out.println("Ex 4");
                    tabuada();
                    break;
                case 5:
                    System.out.println("Ex 5");
                    torreString();
                    break;
                case 6:
                    System.out.println("Ex 6");
                    imparesMultSete();
                    break;
                case 7:
                    System.out.println("Ex 7");
                    notaNegativa();
                    break;
                case 8:
                    System.out.println("Ex 8");
                    fatorial();
                    break;
                case 9:
                    System.out.println("Ex 9");
                    imc();
                    break;
                case 10:
                    System.out.println("Ex 10");
                    operacoes();
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        }while(menu != 0);
        scanner.close();
    }
    
    public static void medianotas() {
    	
        Scanner scanner = new Scanner (System.in);
        double nota = 0.0;
        double soma = 0.0;
        
        for(int i=1;i<4;i++) {
            System.out.println("Digite a "+ i +"ª nota: ");
            nota = scanner.nextDouble();
            soma+=nota;
        }
        
        String media = (soma / 3) >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.println(media);
        scanner.close();
    }
	
    public static void Nummes() {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Informe um número de 1 a 12: ");
        int Nummes = scanner.nextInt();
        String mes = "";

        switch (Nummes) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                mes = "Valor inválido"; 
                break;
        }
        System.out.println("Mês correspondente: " + mes);
        scanner.close();
    }
    
    public static void forca() {
    	
        Scanner scanner = new Scanner (System.in);
        String pOculta = "";
        String pInformada = "";
        
        System.out.println("Informe a palavra oculta: ");
        pOculta = scanner.next();
        
        System.out.println("\n Quantidade de tentativas: 6");
        
        for (int tentativas=5;tentativas>=0;--tentativas) {
            
            System.out.println("\n Digite a sua tentativa: ");
            pInformada = scanner.next();
            
            if (pInformada.equals(pOculta)) {
                System.out.println("\n Parabéns, você acertou antes de ser enforcado!!!!!");
                break;
            }else if (tentativas == 5) {
                System.out.println("\n\t Você perdeu a cabeça");
            }else if (tentativas == 4) {
                System.out.println("\n\t Você perdeu o tronco");
            }else if (tentativas == 3) {
                System.out.println("\n\t Você perdeu um braço");
            }else if (tentativas == 2) {
                System.out.println("\n\t Você perdeu o outro braço");
            }else if (tentativas == 1) {
                System.out.println("\n\t Você perdeu uma perna");
            }else {
                System.out.println("\n\t Você perdeu a outra perna e foi enforcado");
            }
        }
        scanner.close();
    }

    public static void tabuada() {
    	
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite o valor da tabuada: ");
        int valor = scanner.nextInt();
        
        for (int i=0;i<=10;i++) {
            System.out.println(valor + " x " + i + " = " + (valor*i));
        }
        
        scanner.close();
    }

    public static void torreString() {

        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Insira uma palavra: ");
        String stringTorre = scanner.nextLine();
        
        for (int cont=0;cont<stringTorre.length();cont++) {
            System.out.println(stringTorre.charAt(cont));
        }
        
        scanner.close();
    }

    public static void imparesMultSete() {

        Scanner scanner = new Scanner (System.in);
        int soma = 0;
        
        for (int cont=1;cont<=500;cont+=2) {
            if (cont%2==1 && cont%7==0) {
                soma+=cont;
            }
        }
        
        System.out.println("A soma dos números ímpares múltiplos de 7 é: " + soma);
        scanner.close();
    }

    public static void notaNegativa() {

        Scanner scanner = new Scanner (System.in);
        double soma = 0.0, nota = 0.0;
        int qntNotas = 0;
        
        do{
            System.out.println("Informe a " + (qntNotas+1) + " ª nota do aluno: ");
            nota = scanner.nextDouble();
            soma+=nota;
            qntNotas++;
            
        }while(nota >= 0);
        
        System.out.println("A média das notas informadas é: " + (soma/qntNotas));
        
        scanner.close();
    }

    public static void fatorial() {

        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Informe um número: ");
        int fatorial = scanner.nextInt();
        
        for (int cont=fatorial;cont>1;cont--) {
            fatorial = fatorial * (cont-1);
        }
        
        System.out.println("A fatorial desse número é: " + fatorial);
        
        scanner.close();
    }

    public static void imc() {

        double altura = 0.0, peso = 0.0, imc = 0.0;
        String resultadoIMC = "";
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Informe sua altura: ");
        altura = scanner.nextDouble();
        
        System.out.println("\n Informe seu peso: ");
        peso = scanner.nextDouble();
        
        imc = peso/(altura*altura);
        
        if (imc <= 18.5) {
            resultadoIMC = "Abaixo do Peso";
        }else if (imc > 18.5 && imc <= 24.9) {
            resultadoIMC = "Peso Ideal";
        }else if (imc > 24.9 && imc <= 29.9) {
            resultadoIMC = "Acima do peso";
        }else if (imc > 29.9 && imc <= 34.9) {
            resultadoIMC = "Obesidade Grau I";
        }else if (imc > 34.9 && imc <= 39.9) {
            resultadoIMC = "Obesidade Grau II";
        }else {
            resultadoIMC = "Obesidade Grau III";
        }
        
        System.out.println("IMC: " + resultadoIMC);
        scanner.close();
    }

    public static void operacoes() {

        int valorUm = 0, valorDois = 0;
        double resultado = 0.0;
        String operacao = "";
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Informe o primeiro valor: ");
        valorUm = scanner.nextInt();
        
        System.out.println("Informe o segundo valor: ");
        valorDois = scanner.nextInt();
        
        System.out.println("Informe a operação a ser realizada (+ - * /): ");
        operacao = scanner.next();
        
        if (operacao.equals("+")) {
            resultado = valorUm + valorDois;
        }else if (operacao.equals("-")) {
            resultado = valorUm - valorDois;
        }else if (operacao.equals("*")) {
            resultado = valorUm * valorDois;
        }else {
            resultado = valorUm / valorDois;
        }
        
        System.out.println("O resultado é: " + resultado);
        
        scanner.close();
    }
}