package org.system_hotel.screen_match_alura.Services;

public interface IConvertDados {
     <T> T obterDados(String json, Class<T> tClass); // Não informa o tipo da Interface, por isso o <T> T
}
