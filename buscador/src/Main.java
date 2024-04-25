public class Main {
    public static void main(String[] args) throws Exception {
        ConsultaCep consultaCep = new ConsultaCep();

        Endereco novoEndereco = consultaCep.buscaEndereco( "36083571");
        System.out.println(novoEndereco);
    }
}
