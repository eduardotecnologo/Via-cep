import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConsultaCep {
    public Endereco buscaEndereco (String cep) throws IOException, InterruptedException {

        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try {
        	HttpResponse<String> response = HttpClient.newHttpClient()
            .send(request, HttpResponse.BodyHandlers.ofString());

        String body = response.body();

        return new Gson().fromJson(body, Endereco.class);

        	}catch(IOException | InterruptedException e) {
        		System.out.println("Erro ao buscar endereço!");
                throw e;
        }
      }
}