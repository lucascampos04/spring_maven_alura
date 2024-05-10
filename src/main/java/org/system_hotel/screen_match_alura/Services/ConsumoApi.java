package org.system_hotel.screen_match_alura.Services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
    public String obterDados(String endereco){
        HttpClient client = HttpClient.newHttpClient(); // Cliente
        HttpRequest request = HttpRequest.newBuilder() // Criando um request para fazer a requisição
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = null;
        try{
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e){
            throw new RuntimeException(e);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        String json = response.body();
        return json; // Retornando JSON
    }
}
