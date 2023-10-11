public class Pessoas {
    public static void main(String[] args) {
        Fisica fis = new Fisica();
        fis.nome = "Danilo";
        fis.cpf = "12312312308";
        fis.identidade = "12121212";
        fis.situacaoPessoa = "A";
        System.out.println("Dados da pessoa física:");
        System.out.println(fis.toString());

        Juridica juri = new Juridica();
        juri.cnpj = "123123123";
        juri.nome = "Casas do Silva";
        juri.inscEstadual = "123123123";
        juri.situacaoPessoa = "I";
        System.out.println("Dados da pessoa jurídica:");
        System.out.println(juri.toString());
    }
}
