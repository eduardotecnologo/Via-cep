import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    	
    	Scanner leitura = new Scanner(System.in);
    	
        ConsultaCep consultaCep = new ConsultaCep();
        
        System.out.println("Digite um número de série para consulta!!!");
        var cep = leitura.nextInt();

        try {
	        Endereco novoEndereco = consultaCep.buscaEndereco(cep);
	        System.out.println(novoEndereco);
	        
	        GeradorDeArquivo gerador = new GeradorDeArquivo();
	        gerador.SalvarJson(novoEndereco);
	        
        }catch (Exception e) {
			// TODO: handle exception
        	System.out.println(e.getMessage());
        	System.out.println("Finalizando a aplicação!!!");
		}
        
    }
}
