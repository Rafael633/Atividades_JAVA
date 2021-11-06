public class Hospital {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Yago Edson Teixeira", "714.149.972-56", "21/04/1966", "000001");
        Paciente pacienteDois = new Paciente("Manoel Carlos Eduardo Pereira", "521.260.604-70", "09/07/1950", "000002");
        Paciente pacienteTres = new Paciente("Raimunda Rebeca Fernanda Silveira", "944.514.860-68", "07/11/1948", "000003");

        Medico medico = new Medico("Renan Cauã Thomas Castro", "865.380.088-36", "20/06/1952", "45321", "SC");
        Medico medicoDois = new Medico("Antonio Igor da Cunha", "673.003.054-23", "21/12/1954", "23456", "SC");
        Medico medicoTres = new Medico("Francisco Jorge Souza", "837.652.951-08", "17/01/1941", "67543", "SC");

        Consulta consulta = new Consulta("15/10/2021", "Dor de Cabeça", medico, paciente);
        Consulta consultaDois = new Consulta("18/10/2021", "Dor de Cabeça", medico, paciente);
        Consulta consultaTres = new Consulta("19/10/2021", "Dor de Cabeça", medico, paciente);
        Consulta consultaQuatro = new Consulta("20/10/2021", "Dor de Cabeça", medico, paciente);
        Consulta consultaCinco = new Consulta("15/10/2021", "Dor de Cabeça", medicoDois, pacienteDois);
        Consulta consultaSeis = new Consulta("18/10/2021", "Dor de Cabeça", medicoDois, pacienteDois);
        Consulta consultaSete = new Consulta("19/10/2021", "Dor de Cabeça", medicoDois, pacienteDois);
        Consulta consultaOito = new Consulta("18/10/2021", "Dor de Cabeça", medicoTres, pacienteTres);
        Consulta consultaNove = new Consulta("19/10/2021", "Dor de Cabeça", medicoTres, pacienteTres);
        Consulta consultaDez = new Consulta("20/10/2021", "Dor de Cabeça", medicoTres, pacienteTres);


        System.out.println(paciente.carteira());
        System.out.println();
        System.out.println(pacienteDois.carteira());
        System.out.println();
        System.out.println(pacienteTres.carteira());

        System.out.println();
        System.out.println(medico.carteira());
        System.out.println();
        System.out.println(medicoDois.carteira());
        System.out.println();
        System.out.println(medicoTres.carteira());




    }
}
