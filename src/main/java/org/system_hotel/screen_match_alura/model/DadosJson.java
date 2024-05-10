package org.system_hotel.screen_match_alura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosJson(
        @JsonAlias("userId") String IdUser,
        @JsonAlias("id") String id,
        @JsonAlias("title") String titulo
    )
    {
}
