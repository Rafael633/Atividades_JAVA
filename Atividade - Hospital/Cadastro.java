public class Cadastro {
    public static void main(String[] args) {
        
        Paciente pacienteUm = new Paciente(1,"Rafael","000.000.000-00","31/01/2002","a12");
        System.out.println(pacienteUm);
        System.out.println("\n");

        Paciente pacienteDois = new Paciente(2,"Luan","111.111.111-11","25/05/2000","r11");
        System.out.println(pacienteDois);
        System.out.println("\n");
        
        Paciente pacienteTres = new Paciente(3,"Matheus","222.222.22-22","31/12/1970","l11");
        System.out.println(pacienteTres);
        System.out.println("\n");

        Medico medicoUm = new Medico("Eduardo","000.000.000-00","10/10/2000","1000","São Paulo","a30");
        System.out.println(medicoUm);
        System.out.println("\n");

        Medico medicoDois = new Medico("Lucas","111.111.111-11","15/11/2014","2000","Santa Catarina","lgk10");
        System.out.println(medicoDois);
        System.out.println("\n");

        Medico medicoTres = new Medico("Caue","222.222.22-22","02/04/1999","3000","Curitiba","mi9");
        System.out.println(medicoTres);
        System.out.println("\n");

        Consulta consultaUm = new Consulta("10/10/2020","Cirurgia",10);
        System.out.println(consultaUm);
        System.out.println("\n");

        Consulta consultaDois = new Consulta("10/11/1990","Transplante",11);
        System.out.println(consultaDois);
        System.out.println("\n");

        Consulta consultaTres = new Consulta("12/02/2000","Bariatrica",12);
        System.out.println(consultaTres);
        System.out.println("\n");

        Consulta consultaQuatro = new Consulta("17/05/2001","Implante",13);
        System.out.println(consultaQuatro);
        System.out.println("\n");

        Consulta consultaCinco = new Consulta("01/04/2002","Cirurgia da mão",14);
        System.out.println(consultaCinco);
        System.out.println("\n");

        Consulta consultaSeis = new Consulta("15/06/2003","Polipectomia",15);
        System.out.println(consultaSeis);
        System.out.println("\n");

        Consulta consultaSete = new Consulta("07/03/2004","Varizes",16);
        System.out.println(consultaSete);
        System.out.println("\n");

        Consulta consultaOito = new Consulta("31/10/2005","Facectomia",17);
        System.out.println(consultaOito);
        System.out.println("\n");

        Consulta consultaNove = new Consulta("31/01/2006","Lipomas",18);
        System.out.println(consultaNove);
        System.out.println("\n");

        Consulta consultaDez = new Consulta("12/12/2004","Biópsias: pele",19);
        System.out.println(consultaDez);
        System.out.println("\n");
    }
}