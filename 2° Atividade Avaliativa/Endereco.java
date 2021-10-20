public class Endereco {

    String idEndereco;
    String cep;
    String rua;
    int numero;
    String bairro;
    String cidade;
    Padaria padaria;

    public Endereco(
        String idEndereco,
        String cep,
        String rua,
        int numero,
        String bairro,
        String cidade,
        Padaria padaria
    ) {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }
}