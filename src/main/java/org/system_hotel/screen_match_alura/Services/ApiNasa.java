package org.system_hotel.screen_match_alura.Services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

public class ApiNasa {
    private static final String API_KEY = "vathVB8xhRxxHL7XVKayVpZfnb436WttyDmrV1hf";
    private static final String BASE_URL = "https://api.nasa.gov";

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        String apiUrl = BASE_URL + "/planetary/apod?api_key=" + API_KEY;

        String response = restTemplate.getForObject(apiUrl, String.class);

        System.out.println(response);
    }
}
