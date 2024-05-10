package org.system_hotel.screen_match_alura;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.system_hotel.screen_match_alura.Services.ConsumoApi;
import org.system_hotel.screen_match_alura.Services.ConverteDados;
import org.system_hotel.screen_match_alura.model.DadosJson;

@SpringBootApplication
public class ScreenMatchAluraApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenMatchAluraApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var consumoApi = new ConsumoApi();
        var json = consumoApi.obterDados("https://jsonplaceholder.typicode.com/posts/1");
        System.out.println(json);

        System.out.println(json);

        ConverteDados converteDados = new ConverteDados();
        DadosJson dados = converteDados.obterDados(json, DadosJson.class);
        System.out.println(dados);
    }

}
